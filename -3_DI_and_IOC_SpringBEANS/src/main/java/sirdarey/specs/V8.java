package sirdarey.specs;

import sirdarey.interfaces.Engine;

public class V8 implements Engine {

	@Override
	public String type() {
		return "V8 Engine";
	}

}
