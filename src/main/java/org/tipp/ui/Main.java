package org.tipp.ui;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Instance;
import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import org.apache.deltaspike.cdise.api.CdiContainer;
import org.apache.deltaspike.cdise.api.CdiContainerLoader;
import org.apache.deltaspike.cdise.api.ContextControl;

public class Main {

	public static void main(String[] args) {
		
		SeContainerInitializer initializer = SeContainerInitializer.newInstance();
        /** disable discovery and register bean classes manually */
        try (SeContainer container = initializer
        		.disableDiscovery()
        		.addBeanClasses(BasicBean.class, Pin.class)
        		.initialize()) {
            Instance<BasicBean> select = container.select(BasicBean.class);
            BasicBean basicBean = select.get();
            basicBean.message();
        }		
		
		System.out.println("Stopped container");
	}

}
