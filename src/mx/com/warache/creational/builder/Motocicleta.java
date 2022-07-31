package mx.com.warache.creational.builder;

public class Motocicleta {

	private String brand;
	private String segment;
	private String engine;

	private Integer wheels;
	private String frontSuspension;
	private String rearSuspension;
	private Boolean usbPlug;
	private Boolean absBrakes;
	private String color;

	private Motocicleta(MotocicletaBuilder builder) {
		this.brand = builder.brand;
		this.segment = builder.segment;
		this.engine = builder.engine;

		this.wheels = builder.wheels;
		this.frontSuspension = builder.frontSuspension;
		this.rearSuspension = builder.rearSuspension;
		this.usbPlug = builder.usbPlug;
		this.absBrakes = builder.absBrakes;
		this.color = builder.color;
	}

	public String getBrand() {
		return brand;
	}

	public String getSegment() {
		return segment;
	}

	public Integer getWheels() {
		return wheels;
	}

	public String getEngine() {
		return engine;
	}

	public String getFrontSuspension() {
		return frontSuspension;
	}

	public String getRearSuspension() {
		return rearSuspension;
	}

	public Boolean getUsbPlug() {
		return usbPlug;
	}

	public Boolean getAbsBrakes() {
		return absBrakes;
	}

	public String getColor() {
		return color;
	}

	public static class MotocicletaBuilder {

		private String brand;
		private String segment;
		private String engine;

		private Integer wheels;
		private String frontSuspension;
		private String rearSuspension;
		private Boolean usbPlug;
		private Boolean absBrakes;
		private String color;

		public MotocicletaBuilder(String brand, String segment, String engine) {
			this.brand = brand;
			this.segment = segment;
			this.engine = engine;
		}

		public MotocicletaBuilder withWheels(Integer wheels) {
			this.wheels = wheels;
			return this;
		}

		public MotocicletaBuilder withFrontSuspension(String frontSuspension) {
			this.frontSuspension = frontSuspension;
			return this;
		}

		public MotocicletaBuilder withRearSuspension(String rearSuspension) {
			this.rearSuspension = rearSuspension;
			return this;
		}

		public MotocicletaBuilder withUsbPlug(Boolean usbPlug) {
			this.usbPlug = usbPlug;
			return this;
		}

		public MotocicletaBuilder withAbsBrakes(Boolean absBrakes) {
			this.absBrakes = absBrakes;
			return this;
		}

		public MotocicletaBuilder withColor(String color) {
			this.color = color;
			return this;
		}

		public Motocicleta build() {
			if (this.brand == null || this.segment == null || this.engine == null) {
				throw new IllegalArgumentException("No se establecieron todos los argumentos requeridos...");
			}
			return new Motocicleta(this);
		}
	}

	@Override
	public String toString() {
		return "Motocicleta [\nbrand=" + brand + ", \nsegment=" + segment + ", \nengine=" + engine + ", \nwheels="
				+ wheels + ", \nfrontSuspension=" + frontSuspension + ", \nrearSuspension=" + rearSuspension
				+ ", \nusbPlug=" + usbPlug + ", \nabsBrakes=" + absBrakes + ", \ncolor=" + color + "]";
	}

}
