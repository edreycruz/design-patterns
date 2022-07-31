package mx.com.warache.creational.abstractfactory;

import mx.com.warache.creational.abstractfactory.modelos.Burgman400ScooterMotocicleta;
import mx.com.warache.creational.abstractfactory.modelos.BurgmanStreet125ScooterMotocicleta;
import mx.com.warache.creational.abstractfactory.modelos.Lets2021ScooterMotocicleta;

public enum EnumSuzukiScooterMotocicleta {

	SUZUKI_LETS_2021(Lets2021ScooterMotocicleta.class),
	SUZUKI_BURGMAN_125(BurgmanStreet125ScooterMotocicleta.class),
	SUZUKI_BURGMAN_400(Burgman400ScooterMotocicleta.class);
	
	private Class<? extends ScooterMotocicleta> modelo;
	
	private EnumSuzukiScooterMotocicleta(Class<? extends ScooterMotocicleta> modelo) {
		this.modelo = modelo;
	}

	public Class<? extends ScooterMotocicleta> getModelo() {
		return modelo;
	}

}
