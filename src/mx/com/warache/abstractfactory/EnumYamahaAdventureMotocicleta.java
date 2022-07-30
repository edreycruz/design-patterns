package mx.com.warache.abstractfactory;

import mx.com.warache.abstractfactory.modelos.SuperTenere1200ZEAdventureMotocicleta;
import mx.com.warache.abstractfactory.modelos.VStrom1050XTAdventureMotocicleta;
import mx.com.warache.abstractfactory.modelos.VStrom650XTAdventureMotocicleta;
import mx.com.warache.abstractfactory.modelos.XTZ150AdventureMotocicleta;

public enum EnumYamahaAdventureMotocicleta{

	SUZUKI_VSTROM_650XT(VStrom650XTAdventureMotocicleta.class),
	SUZUKI_VSTROM_1050XT(VStrom1050XTAdventureMotocicleta.class),
	YAMAHA_XTZ_150(XTZ150AdventureMotocicleta.class),
	YAMAHA_SUPER_TENERE_1200XE(SuperTenere1200ZEAdventureMotocicleta.class);
	
	Class<? extends AdventureMotocicleta> modelo;
	
	private EnumYamahaAdventureMotocicleta(Class<? extends AdventureMotocicleta> modelo) {
		this.modelo = modelo;
	}
	
	public Class<? extends AdventureMotocicleta> getModelo() {
		return modelo;
	}
}
