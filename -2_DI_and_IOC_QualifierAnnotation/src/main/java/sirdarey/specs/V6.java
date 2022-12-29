package sirdarey.specs;

import org.springframework.stereotype.Component;

import sirdarey.interfaces.Engine;

@Component
public class V6 implements Engine {

	@Override
	public String type() {
		return "V6 Engine";
	}

}
