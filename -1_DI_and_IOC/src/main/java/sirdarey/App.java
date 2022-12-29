package sirdarey;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sirdarey.interfaces.Car;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car toyota = context.getBean("toyota", Car.class);
		Car benz = context.getBean("myBenz", Car.class);
		
		System.out.println(toyota.specs());
		System.out.println(benz.specs());
		
		context.close();
	}
}
