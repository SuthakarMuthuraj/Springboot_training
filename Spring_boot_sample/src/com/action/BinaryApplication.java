package com.action;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class BinaryApplication {

	
	public static void main(String[] args) {

		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		BinarySearch binarySarch = (BinarySearch) factory.getBean("binarySarch");
		binarySarch.binaryOpretion();

	}
}
