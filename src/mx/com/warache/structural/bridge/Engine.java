package mx.com.warache.structural.bridge;

public abstract class Engine {

	protected String engineType;
	protected String engineSpecification;

	abstract void calibrate();

	abstract void transmitPower();

	abstract void speedUp();

	abstract void slowDown();

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getEngineSpecification() {
		return engineSpecification;
	}

	public void setEngineSpecification(String engineSpecification) {
		this.engineSpecification = engineSpecification;
	}
	
	

}
