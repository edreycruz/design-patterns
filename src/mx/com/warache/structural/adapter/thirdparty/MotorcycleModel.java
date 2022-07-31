package mx.com.warache.structural.adapter.thirdparty;

/**
 * Let's assume these classes is a third party library which you don't have
 * control on but only can make use of (let's say a jar dependency file)
 */
public class MotorcycleModel {

	private String engine;
	private String brakes;
	private String year;
	private String color;

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getBrakes() {
		return brakes;
	}

	public void setBrakes(String brakes) {
		this.brakes = brakes;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "MotorcyleModel [engine=" + engine + ", brakes=" + brakes + ", year=" + year + ", color=" + color + "]";
	}

}