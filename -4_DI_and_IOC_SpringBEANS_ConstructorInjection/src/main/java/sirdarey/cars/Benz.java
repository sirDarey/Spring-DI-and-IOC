package sirdarey.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import sirdarey.interfaces.Car;
import sirdarey.interfaces.Engine;

public class Benz implements Car {

	@Autowired() 
	@Qualifier("engineType") //This line is optional in this case since, only one class("EngineType") 
	//is implementing "Engine" interface.
	Engine engine;
	


	@Override
	public String specs() {
		return "This is a Benz with engine type: "+engine.type();
	}

}
