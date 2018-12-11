package org.audi.autowiringsample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("spring.xml");
		
		                Person p1 = (Person) c1.getBean("person") ;

		              
		                // display all the details of the car
		                
		                System.out.println(p1.getName());
		                System.out.println(p1.getAge());
		                System.out.println(p1.getCar().getBrand());
		                 
	}
	
}
