package mx.com.warache.structural.bridge;

public class CombustionEngine extends Engine {

	public CombustionEngine(String specification) {
		this.engineType = "Internal combustion";
		this.engineSpecification = specification;
	}

	@Override
	void calibrate() {
		// TODO Auto-generated method stub
		System.out.println("Calibrating valves, shaft, intake, outlet...");
	}

	@Override
	void transmitPower() {
		// TODO Auto-generated method stub
		System.out.println("Transmiting power uncontinuously due to gear shifting..");
	}

	@Override
	void speedUp() {
		// TODO Auto-generated method stub
		System.out.println("Speeding up uncontinuously and burning fuel...");
	}

	@Override
	void slowDown() {
		// TODO Auto-generated method stub

		System.out.println("Slowing down uncontinuously and shifting gears down...");
	}

}
