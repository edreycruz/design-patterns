package mx.com.warache.factorymethod;

public class SuperSportMotocicleta extends Motocicleta{

	@Override
	void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Acelera con la mayor potencia...");
	}

	@Override
	void frenar() {
		// TODO Auto-generated method stub
		System.out.println("Frena con la mayor potencia...");
	}

	@Override
	public String toString() {
		return "Se creó una motocicleta super sport...";
	}

}
