package sirdarey.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import sirdarey.interfaces.Car;
import sirdarey.interfaces.Engine;

public class Benz implements Car {

	@Autowired() 
	@Qualifier("v6")
	Engine engine;
	


	@Override
	public String specs() {
		return "This is a Benz with engine type: "+engine.type();
	}

}
