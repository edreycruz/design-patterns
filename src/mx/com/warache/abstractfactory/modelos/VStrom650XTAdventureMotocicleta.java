package mx.com.warache.abstractfactory.modelos;

import mx.com.warache.abstractfactory.AdventureMotocicleta;

public class VStrom650XTAdventureMotocicleta extends AdventureMotocicleta {

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("La VStrom 650XT se enciende electrónicamente por proximidad con botón...");
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("La VStrom 650XT se apaga electrónicamente por proximidad con botón...");
	}

}
