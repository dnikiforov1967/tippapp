package org.tipp.jpa.em;

import javax.persistence.Embeddable;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUtil;
import javax.persistence.spi.PersistenceProvider;

import org.hibernate.jpa.internal.util.PersistenceUtilHelper;

public final class JpaUtils {
	
	private JpaUtils() {
		
	}
	
	public static EntityManagerFactory createFactory(String unitName) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(unitName);
		return entityManagerFactory;
	}

}
