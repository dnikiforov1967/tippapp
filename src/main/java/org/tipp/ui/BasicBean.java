package org.tipp.ui;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.tipp.jpa.Cat;

@ApplicationScoped
public class BasicBean {
	
	@Inject
	private Pin pin;
	
	@Inject
	private Instance<EntityManager> emi;

	public void message() {
		System.out.println("Instance "+pin.name());
	}
	
	public void saveCat(String name) {
		EntityManager em=emi.get();
		em.getTransaction().begin();
		Cat cat = new Cat();
		cat.setName(name);
		em.persist(cat);
		em.flush();
		em.getTransaction().commit();
		em.close();
	}
	
}
