package tippapp;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.tipp.jpa.Cat;
import org.tipp.jpa.em.JpaUtils;

public class JpaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		/*EntityManagerFactory factory = JpaUtils.createFactory("test");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Cat cat = new Cat();
		cat.setName("Myau");
		em.persist(cat);
		em.flush();
		em.getTransaction().commit();
		em.close();
		factory.close();*/
	}

}
