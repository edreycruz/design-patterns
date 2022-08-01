package mx.com.warache.structural.bridge;

public class ElectricEngine extends Engine {

	public ElectricEngine(String specification) {
		this.engineType = "Electric";
		this.engineSpecification = specification;
	}
	
	@Override
	void calibrate() {
		// TODO Auto-generated method stub
		System.out.println("Calibrating engine voltage...");

	}

	@Override
	void transmitPower() {
		// TODO Auto-generated method stub
		System.out.println("Transmiting continuous power to rear wheel...");
	}

	@Override
	void speedUp() {
		// TODO Auto-generated method stub
		System.out.println("Speeding up continuously and electrically...");
	}

	@Override
	void slowDown() {
		// TODO Auto-generated method stub
		System.out.println("Slowing down electrically...");
	}

}
