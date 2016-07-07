package helloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		objA.getMessage1();
		objA.getMessage2();
		
		HelloIndia objeB = (HelloIndia) context.getBean("helloIndia");
		objeB.getMessage1();
		objeB.getMessage2();
		objeB.getMessage3();
	}
}
