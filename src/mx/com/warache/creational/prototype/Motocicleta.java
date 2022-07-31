package mx.com.warache.creational.prototype;

public class Motocicleta implements Cloneable {

	private String brand;
	private String engine;
	private Integer wheels;
	private String absBreakes;
	private String frontSuspension;
	private String rearSuspension;

	public Motocicleta() {

	}

	private Motocicleta(Motocicleta motocicleta) {
		this.brand = motocicleta.brand;
		this.engine = motocicleta.engine;
		this.wheels = motocicleta.wheels;
		this.absBreakes = motocicleta.absBreakes;
		this.frontSuspension = motocicleta.frontSuspension;
		this.rearSuspension = motocicleta.rearSuspension;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public Integer getWheels() {
		return wheels;
	}

	public void setWheels(Integer wheels) {
		this.wheels = wheels;
	}

	public String getAbsBreakes() {
		return absBreakes;
	}

	public void setAbsBreakes(String absBreakes) {
		this.absBreakes = absBreakes;
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

	@Override
	public Motocicleta clone(){

		Motocicleta miMoto = new Motocicleta(this);

		return miMoto;
	}

	@Override
	public String toString() {
		return "\nMotocicleta [\nbrand=" + brand + ", \nengine=" + engine + ", \nwheels=" + wheels + ", \nabsBreakes="
				+ absBreakes + ", \nfrontSuspension=" + frontSuspension + ", \nrearSuspension=" + rearSuspension + "]";
	}

}
