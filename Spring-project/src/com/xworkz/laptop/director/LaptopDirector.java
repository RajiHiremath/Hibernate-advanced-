package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Laptop;

public class LaptopDirector {

	public static void main(String[] args) {
		String xmlpath="resource/spring.xml";
		ApplicationContext application=new ClassPathXmlApplicationContext(xmlpath);
		
		Laptop lap=application.getBean(Laptop.class);
		lap.start();

	}

}
