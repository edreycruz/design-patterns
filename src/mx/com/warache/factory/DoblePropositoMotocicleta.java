package mx.com.warache.factory;

public class DoblePropositoMotocicleta extends Motocicleta{

	@Override
	void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Acelera con mucho torque...");
	}

	@Override
	void frenar() {
		// TODO Auto-generated method stub
		System.out.println("Frena con suficiente potencia...");
	}

	@Override
	public String toString() {
		return "Se creó una motocicleta doble propósito...";
	}

	
}
