package com.github.jakubslazyk.springdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeActivity3DemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("PractiveActivity3Context.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach aCoach = context.getBean("myCoach",Coach.class);
		System.out.println(theCoach);
		System.out.println(aCoach);
		//close the context
		context.close();
	}

}
