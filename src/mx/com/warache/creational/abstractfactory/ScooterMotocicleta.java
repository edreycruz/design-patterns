package mx.com.warache.creational.abstractfactory;

public abstract class ScooterMotocicleta extends Motocicleta {

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Aceleración suave y limitada...");

	}

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		System.out.println("Frenado prolongado con tambor...");
	}

	@Override
	abstract public void encender();

	@Override
	abstract public void apagar();

}
