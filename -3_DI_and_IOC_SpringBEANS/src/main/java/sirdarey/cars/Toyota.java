package sirdarey.cars;

import sirdarey.interfaces.Car;

public class Toyota implements Car {

	@Override
	public String specs() {
		return "This is a Toyota";
	}

}
