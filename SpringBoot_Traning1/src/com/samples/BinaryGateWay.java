package com.samples;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BinaryGateWay {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		BinaryApp binaryApp = (BinaryApp) factory.getBean("binaryApp");
		binaryApp.search();

	}

}
