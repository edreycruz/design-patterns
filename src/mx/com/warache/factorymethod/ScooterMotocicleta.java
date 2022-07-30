package mx.com.warache.factorymethod;

public class ScooterMotocicleta extends Motocicleta

{

	@Override
	void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Acelera con poca potencia...");
		
	}

	@Override
	void frenar() {
		// TODO Auto-generated method stub
		System.out.println("Frena con poca potencia...");
	}

	@Override
	public String toString() {
		return "Se creó una motocicleta scooter...";
	}

}
