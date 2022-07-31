package mx.com.warache.creational.factorymethod;

import java.lang.reflect.InvocationTargetException;

public class MotocicletaFactory {

	public static Motocicleta fabricarMotocicleta(EnumTipoMotocicleta tipoMotocicleta) {
		Class<? extends Motocicleta> tipoInstancia = tipoMotocicleta.getClazz();
		
		try {
			return (Motocicleta) tipoInstancia.getDeclaredConstructor().newInstance();
		} catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException
				| InstantiationException ex) {
			return null;
		}
	}

}
