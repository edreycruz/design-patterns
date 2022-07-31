package mx.com.warache.creational.abstractfactory;

import mx.com.warache.creational.abstractfactory.modelos.BWSFIScooterMotocicleta;
import mx.com.warache.creational.abstractfactory.modelos.XMax2023ScooterMotocicleta;

public enum EnumYamahaScooterMotocicleta  {

	YAMAHA_BWSFI(BWSFIScooterMotocicleta.class),
	YAMAHA_XMAX_2023(XMax2023ScooterMotocicleta.class);
	
	private Class<? extends ScooterMotocicleta> modelo;
	
	private EnumYamahaScooterMotocicleta(Class<? extends ScooterMotocicleta> modelo) {
		this.modelo = modelo;
	}

	public Class<? extends ScooterMotocicleta> getModelo() {
		return modelo;
	}

}
