package mx.com.warache.structural.bridge;

public class BoulevardC50 extends Motocicleta{

	public BoulevardC50(Engine engine) {
		super(engine);
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Boulevard C50 accelerating...");
		
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Boulevard C50 breaking with breake lever...");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Boulevard C50 turned on with key and button...");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Boulevard C50 turned off with key and button...");
	}

	@Override
	public String toString() {
		return "BoulevardC50 [getEngine()=" + getEngine() + ", getBrakes()=" + getBrakes() + ", getFrontSuspension()="
				+ getFrontSuspension() + ", getRearSuspension()=" + getRearSuspension() + ", getColor()=" + getColor()
				+ "]";
	}
	
}
