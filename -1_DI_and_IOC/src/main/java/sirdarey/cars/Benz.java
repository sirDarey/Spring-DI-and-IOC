package sirdarey.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sirdarey.interfaces.Car;

@Component("myBenz")
public class Benz implements Car {

	// Use "required = false" if the class is not sure of making use of this engine object
	//This helps to optimize memory as object will only be created when needed
	//@Autowired(required = false) 
	Engine engine;
	
	
	//Using @Autowired doesn't make a difference as when used on the engine object itself because
	//this constructor must always run on object creation
	//@Autowired
	public Benz(Engine engine) {
		this.engine = engine;
	}


	//However, the case is different when @Autowired is used on this setter rather than on the engine object itself
	//Setters are only used to modify an existing property
	@Autowired
	public void setEngine(Engine engine) {
		engine.setType("New V8 Engine");
		this.engine = engine;
	}



	@Override
	public String specs() {
		return "This is a Benz with engine type: "+engine.getType();
	}

}
