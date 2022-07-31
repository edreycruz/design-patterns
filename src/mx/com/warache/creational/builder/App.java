package mx.com.warache.creational.builder;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Motocicleta vStrom = new Motocicleta.MotocicletaBuilder("Suzuki", "Adventure", "650cc")
				.withWheels(2)
				.withColor("White")
				.withAbsBrakes(true)
				.withRearSuspension("Monoshock")
				.withUsbPlug(true)
				.build();

		System.out.println("Se construyó la motocicleta: " + vStrom);
	}

}
