package mx.com.warache.creational.abstractfactory.modelos;

import mx.com.warache.creational.abstractfactory.ScooterMotocicleta;

public class Burgman400ScooterMotocicleta extends ScooterMotocicleta {

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("La Burgman 400 2022 se enciende electrónicamente por proximidad con panel touch..." + toString());
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("La Burgman 400 2022 se apaga electrónicamente por proximidad con panel touch..." + toString());

	}

}
