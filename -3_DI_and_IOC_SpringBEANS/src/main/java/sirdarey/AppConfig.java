package sirdarey;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import sirdarey.cars.Benz;
import sirdarey.cars.Toyota;
import sirdarey.specs.V6;
import sirdarey.specs.V8;

@Configuration
@ComponentScan ("sirdarey")
public class AppConfig {

	@Bean
	public Benz benzi () {//The default name of the bean is the name of the method
		return new Benz();
	}
	
	@Bean
	public Toyota toyota () {
		return new Toyota();
	}
	
	@Bean
	public V6 v6 () {
		return new V6();
	}
	
	@Bean
	public V8 v8 () {
		return new V8();
	}
}
