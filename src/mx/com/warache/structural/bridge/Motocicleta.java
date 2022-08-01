package mx.com.warache.structural.bridge;

public abstract class Motocicleta {

	private String brakes;
	private String frontSuspension;
	private String rearSuspension;
	private String color;
	private Engine engine; 

	public Motocicleta(Engine engine) {
		this.engine = engine;
	}
	
	abstract public void accelerate();
	abstract public void brake();
	abstract public void turnOn();
	abstract public void turnOff();
	

	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getBrakes() {
		return brakes;
	}

	public void setBrakes(String brakes) {
		this.brakes = brakes;
	}

	public String getFrontSuspension() {
		return frontSuspension;
	}

	public void setFrontSuspension(String frontSuspension) {
		this.frontSuspension = frontSuspension;
	}

	public String getRearSuspension() {
		return rearSuspension;
	}

	public void setRearSuspension(String rearSuspension) {
		this.rearSuspension = rearSuspension;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
