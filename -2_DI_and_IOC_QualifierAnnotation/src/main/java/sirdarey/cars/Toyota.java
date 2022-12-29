package sirdarey.cars;

import org.springframework.stereotype.Component;

import sirdarey.interfaces.Car;

@Component
public class Toyota implements Car {

	@Override
	public String specs() {
		return "This is a Toyota";
	}

}
