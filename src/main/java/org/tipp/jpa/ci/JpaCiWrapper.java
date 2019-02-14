package org.tipp.jpa.ci;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.tipp.jpa.em.JpaUtils;

@ApplicationScoped
public class JpaCiWrapper {

	private static String PU = "test"; 
	
	private EntityManagerFactory emf;
	
	@PostConstruct
	private void init() {
		emf = JpaUtils.createFactory(PU);
	}
	
	@PreDestroy
	private void destroy() {
		emf.close();
		emf = null;
	}
	
	@Produces
	public EntityManager createEntityManager() {
		return emf.createEntityManager();
	}
	
}
