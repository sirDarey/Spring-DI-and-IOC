package sirdarey;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import sirdarey.cars.Benz;
import sirdarey.cars.Toyota;
import sirdarey.specs.EngineType;

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
	public EngineType engineType () {
		//return new EngineType(); //Gives "Unknown"
		return new EngineType("Known V8 Engine"); //Gives value in constructor ("Known V8 Engine")
	}
}
