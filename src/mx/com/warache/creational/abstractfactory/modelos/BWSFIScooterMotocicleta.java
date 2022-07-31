package mx.com.warache.creational.abstractfactory.modelos;

import mx.com.warache.creational.abstractfactory.ScooterMotocicleta;

public class BWSFIScooterMotocicleta extends ScooterMotocicleta {

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("La BWSFI se enciende con llave y patada...");
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("La BWSFI se apaga con llave...");
	}

}
