package tippapp;

import javax.enterprise.inject.Instance;
import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import org.junit.Test;
import org.tipp.jpa.ci.JpaCiWrapper;
import org.tipp.ui.BasicBean;
import org.tipp.ui.Pin;

public class CollaborantTest {

	@Test
	public void test() {
		SeContainerInitializer initializer = SeContainerInitializer.newInstance();
        /** disable discovery and register bean classes manually */
        try (SeContainer container = initializer
        		.disableDiscovery()
        		.addBeanClasses(BasicBean.class, Pin.class, JpaCiWrapper.class)
        		.initialize()) {
            Instance<BasicBean> select = container.select(BasicBean.class);
            BasicBean basicBean = select.get();
            basicBean.message();
            basicBean.saveCat("Tom");
            basicBean.saveCat("Benny");
        }		
		
		System.out.println("Stopped container");
	}

}
