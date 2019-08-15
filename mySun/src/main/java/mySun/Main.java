package mySun;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mySun.Hello;

public class Main {
	
	
	public static void main (String[] args0) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		Hello service = (Hello) context
				.getBean("helloWorldService");
		String message = service.sayHello();
		System.out.println(message);
		
		service.setName("Spring");
		message = service.sayHello();
		System.out.println(message);
		
	}
	
}
