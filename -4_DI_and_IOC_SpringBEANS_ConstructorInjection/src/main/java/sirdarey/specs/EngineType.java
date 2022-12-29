package sirdarey.specs;

import sirdarey.interfaces.Engine;

public class EngineType implements Engine {

	String type;
	
	public EngineType() {
		type = "Unknown";
	}
	
	
	public EngineType(String type) { //This is the constructor via which injection will be performed
		this.type = type;
	}


	@Override
	public String type() {
		return type;
	}

}
