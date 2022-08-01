package mx.com.warache.structural.bridge;

public class VStrom extends Motocicleta {

	public VStrom(Engine engine) {
		super(engine);
	}
	
	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("VStrom accelerating...");

	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("VStrom braking with breake lever...");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Vstrom turned on with key and button...");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Vstrom turned off with key and button...");

	}

	@Override
	public String toString() {
		return "VStrom [getEngine()=" + getEngine() + ", getBrakes()=" + getBrakes() + ", getFrontSuspension()="
				+ getFrontSuspension() + ", getRearSuspension()=" + getRearSuspension() + ", getColor()=" + getColor()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
