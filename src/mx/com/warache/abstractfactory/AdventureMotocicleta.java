package mx.com.warache.abstractfactory;

public abstract class AdventureMotocicleta extends Motocicleta {

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Aceleración con torque y progresiva...");
	}

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		System.out.println("Frenado agresivo con ABS...");
	}

	@Override
	abstract public void encender();

	@Override
	abstract public void apagar();

}
