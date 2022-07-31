package mx.com.warache.creational.abstractfactory;

import mx.com.warache.creational.abstractfactory.modelos.SuperTenere1200ZEAdventureMotocicleta;
import mx.com.warache.creational.abstractfactory.modelos.XTZ150AdventureMotocicleta;

public enum EnumSuzukiAdventureMotocicleta {

	YAMAHA_XTZ_150(XTZ150AdventureMotocicleta.class),
	YAMAHA_SUPER_TENERE_1200XE(SuperTenere1200ZEAdventureMotocicleta.class);
	
	private Class<? extends AdventureMotocicleta> modelo;
	
	private EnumSuzukiAdventureMotocicleta(Class<? extends AdventureMotocicleta> modelo) {
		this.modelo = modelo;
	}
	
	public Class<? extends AdventureMotocicleta> getModelo() {
		return modelo;
	}
}
