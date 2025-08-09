package com.mythic.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Classe utilitária para gerenciamento de sessões do Hibernate 6
 */
public class Database {

	private static final Logger LOGGER = LoggerFactory.getLogger(Database.class);
	private static SessionFactory sessionFactory;
	private static final ThreadLocal<Session> sessionThreadLocal = new ThreadLocal<>();
	private static final ThreadLocal<Transaction> transactionThreadLocal = new ThreadLocal<>();

	static {
		try {
			// Hibernate 6: Nova forma de construir SessionFactory
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure() // Lê o hibernate.cfg.xml
				.build();

			try {
				sessionFactory = new MetadataSources(registry)
					.buildMetadata()
					.buildSessionFactory();
				LOGGER.info("SessionFactory do Hibernate 6 inicializada com sucesso");
			} catch (Exception e) {
				StandardServiceRegistryBuilder.destroy(registry);
				throw e;
			}
		} catch (Exception e) {
			LOGGER.error("Erro ao inicializar SessionFactory do Hibernate 6", e);
			throw new ExceptionInInitializerError(e);
		}
	}

	/**
	 * Obtém a SessionFactory
	 * @return SessionFactory instance
	 */
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * Abre uma nova sessão e inicia uma transação
	 * @return Session com transação iniciada
	 */
	public static Session openSessionAndBegin() {
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();

			sessionThreadLocal.set(session);
			transactionThreadLocal.set(transaction);

			LOGGER.debug("Nova sessão aberta e transação iniciada");
			return session;
		} catch (Exception e) {
			LOGGER.error("Erro ao abrir sessão e iniciar transação", e);
			throw new RuntimeException("Erro ao abrir sessão do banco de dados", e);
		}
	}

	/**
	 * Faz commit da transação e fecha a sessão
	 * @param session Sessão a ser commitada e fechada
	 */
	public static void endSessionAndCommit(Session session) {
		Transaction transaction = transactionThreadLocal.get();

		try {
			if (transaction != null && transaction.isActive()) {
				transaction.commit();
				LOGGER.debug("Transação commitada com sucesso");
			}
		} catch (Exception e) {
			LOGGER.error("Erro ao fazer commit da transação", e);
			if (transaction != null) {
				try {
					transaction.rollback();
					LOGGER.info("Rollback da transação realizado");
				} catch (Exception rollbackException) {
					LOGGER.error("Erro ao fazer rollback da transação", rollbackException);
				}
			}
			throw new RuntimeException("Erro ao fazer commit da transação", e);
		} finally {
			closeSession(session);
		}
	}

	/**
	 * Faz rollback da transação e fecha a sessão
	 * @param session Sessão a ser revertida e fechada
	 */
	public static void endSessionAndRollback(Session session) {
		Transaction transaction = transactionThreadLocal.get();

		try {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
				LOGGER.debug("Transação revertida");
			}
		} catch (Exception e) {
			LOGGER.error("Erro ao fazer rollback da transação", e);
		} finally {
			closeSession(session);
		}
	}

	/**
	 * Fecha a sessão e limpa ThreadLocal
	 * @param session Sessão a ser fechada
	 */
	private static void closeSession(Session session) {
		try {
			if (session != null && session.isOpen()) {
				session.close();
				LOGGER.debug("Sessão fechada");
			}
		} catch (Exception e) {
			LOGGER.error("Erro ao fechar sessão", e);
		} finally {
			sessionThreadLocal.remove();
			transactionThreadLocal.remove();
		}
	}

	/**
	 * Obtém a sessão atual da thread
	 * @return Session atual ou null se não houver
	 */
	public static Session getCurrentSession() {
		return sessionThreadLocal.get();
	}

	/**
	 * Obtém a transação atual da thread
	 * @return Transaction atual ou null se não houver
	 */
	public static Transaction getCurrentTransaction() {
		return transactionThreadLocal.get();
	}

	/**
	 * Fecha a SessionFactory (deve ser chamado no shutdown da aplicação)
	 */
	public static void shutdown() {
		try {
			if (sessionFactory != null && !sessionFactory.isClosed()) {
				sessionFactory.close();
				LOGGER.info("SessionFactory fechada");
			}
		} catch (Exception e) {
			LOGGER.error("Erro ao fechar SessionFactory", e);
		}
	}

	/**
	 * Verifica se a SessionFactory está aberta
	 * @return true se estiver aberta, false caso contrário
	 */
	public static boolean isSessionFactoryOpen() {
		return sessionFactory != null && !sessionFactory.isClosed();
	}
	
}