package mx.com.warache.abstractfactory;

import java.lang.reflect.InvocationTargetException;

public interface MotocicletaFactory {

	ScooterMotocicleta getScooterMotocicleta(String modelo);

	AdventureMotocicleta getAdventureMotocicleta(String modelo);

	default public Motocicleta instanciarObjeto(Class<? extends Motocicleta> modelo) {
		try {
			return modelo.getDeclaredConstructor().newInstance();
		} catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException
				| InstantiationException exception) {
			return null;
		}
	}
}
