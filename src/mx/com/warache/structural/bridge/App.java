package mx.com.warache.structural.bridge;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Motocicleta electricVStrom = new VStrom(new ElectricEngine("440V"));
		Motocicleta vStrom = new VStrom(new CombustionEngine("650cc"));
		Motocicleta electricBoulevardC50 = new BoulevardC50(new ElectricEngine("880V"));
		Motocicleta boulevardC50 = new BoulevardC50(new CombustionEngine("850cc"));

		List<Motocicleta> motos = new ArrayList<>();

		motos.add(vStrom);
		motos.add(electricVStrom);
		motos.add(boulevardC50);
		motos.add(electricBoulevardC50);

		motos.stream().forEach((moto) -> {
			System.out.println("\nMOTORCYCLE: " + moto.getClass() + " with engine: " + moto.getEngine().getClass());
			moto.accelerate();
			moto.brake();
			moto.turnOn();
			moto.turnOff();
			System.out.println(moto.toString());
		});
	}

}
