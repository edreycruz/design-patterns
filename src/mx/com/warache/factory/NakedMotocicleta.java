package mx.com.warache.factory;

public class NakedMotocicleta extends Motocicleta{

	@Override
	void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Acelera con mucha potencia...");
		
	}

	@Override
	void frenar() {
		// TODO Auto-generated method stub
		System.out.println("Frena con mucha potencia...");
	}

	@Override
	public String toString() {
		return "Se creó una motocicleta naked...";
	}

}
