package com.mythic;

import it.gotoandplay.smartfoxserver.data.User;
import it.gotoandplay.smartfoxserver.events.InternalEventObject;
import it.gotoandplay.smartfoxserver.extensions.AbstractExtension;
import it.gotoandplay.smartfoxserver.lib.ActionscriptObject;
import java.util.Date;
import java.util.List;
import com.mythic.aqw.ServerMessage;
import com.mythic.avatars.Adventurer;
import com.mythic.config.Configuration;
import com.mythic.db.Database;
import com.mythic.db.entities.Server;
import com.mythic.db.entities.SettingLogin;
import com.mythic.exceptions.RequestException;
import com.mythic.exceptions.ServerInitException;
import com.mythic.factories.InternalEventHandlerFactory;
import com.mythic.factories.RequestHandlerFactory;
import com.mythic.handlers.InternalEventHandler;
import com.mythic.handlers.RequestHandler;
import com.mythic.region.Region;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
   
   private static final Logger LOGGER = LoggerFactory.getLogger(mext.Main.class);
   public static final int VERSION_MAJOR = 4;
   public static final int VERSION_MINOR = 1;
   private String newsString;
   private String messageOfTheDay;
   private Region region;

   public void destroy() {
      Session session = Database.openSessionAndBegin();
      Server server = (Server)session.createCriteria(Server.class).add(Restrictions.eq("name", Configuration.SERVER_NAME)).uniqueResult();
      server.setOnline(false);
      Database.endSessionAndCommit(session);
      this.region.destroy();
   }

   public void init() {
      this.region = new Region(this);
      Session session = Database.openSessionAndBegin();
      Server server = (Server)session.createCriteria(Server.class).add(Restrictions.eq("name", Configuration.SERVER_NAME)).uniqueResult();
      server.setOnline(true);
      if (server == null) {
         throw new ServerInitException("Server name was not found.");
      } else {
         this.messageOfTheDay = server.getMotd();
         List<SettingLogin> settings = session.createCriteria(SettingLogin.class).list();
         StringBuilder sb = new StringBuilder();

         for (SettingLogin setting : settings) {
            sb.append(",");
            sb.append(setting.getName());
            sb.append("=");
            sb.append(setting.getValue());
         }

         this.newsString = sb.toString().substring(1);
         Database.endSessionAndCommit(session);
      }
   }

   public void handleRequest(String cmd, ActionscriptObject ao, User user, int fromRoom) {
      throw new UnsupportedOperationException("ActionscriptObject protocol is not supported.");
   }

   public void handleRequest(String cmd, String[] params, User user, int fromRoom) {
      Adventurer adventurer = this.region.getByName(user.getName());
      LOGGER.debug("Received Request : {}", cmd);

      try {
         RequestHandler dispatcher = RequestHandlerFactory.getRequestHandler(cmd);
         dispatcher.handle(params, adventurer);
      } catch (RuntimeException var7) {
         LOGGER.error("Error while handling request", var7);
         adventurer.dispatch(ServerMessage.warning("An error occured while handling your request. Please contact the server developer immediately."));
      } catch (RequestException var8) {
         LOGGER.debug("Request exception handled", var8);
         adventurer.dispatch(ServerMessage.warning(var8.getMessage()));
      }
   }

   public void handleInternalEvent(InternalEventObject ieo) {
      String evtName = ieo.getEventName();
      LOGGER.debug("InternalEvent : {}", evtName);
      InternalEventHandler handler = InternalEventHandlerFactory.getInternalEventHandler(evtName);
      ieo.addObject("region", this.region);
      if (evtName.equals("loginRequest")) {
         Adventurer adventurer = (Adventurer)handler.handle(ieo);
         if (adventurer.isLoggedIn()) {
            this.region.add(adventurer);
            this.loginSuccess(adventurer);
         } else {
            this.loginFail(adventurer, ieo);
         }
      } else {
         handler.handle(ieo);
      }
   }

   private void loginSuccess(Adventurer adventurer) {
      adventurer.dispatch(
         new String[]{
            "loginResponse",
            "true",
            String.valueOf(adventurer.getUserId()),
            adventurer.getName(),
            this.messageOfTheDay,
            DateFormatUtils.format(new Date(), "yyyy-MM-dd'T'HH:mm:ss"),
            this.newsString
         }
      );
   }

   private void loginFail(Adventurer adventurer, InternalEventObject ieo) {
      String advName = ieo.getParam("nick").split("~")[1];
      adventurer.dispatch(
         new String[]{
            "loginResponse",
            "false",
            "-1",
            advName,
            "User Data for '" + advName + "' could not be retrieved. Please contact the InfinityArts staff to resolve the issue."
         }
      );
   }
}
