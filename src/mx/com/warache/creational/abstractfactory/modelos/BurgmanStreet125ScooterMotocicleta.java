package mx.com.warache.creational.abstractfactory.modelos;

import mx.com.warache.creational.abstractfactory.ScooterMotocicleta;

public class BurgmanStreet125ScooterMotocicleta extends ScooterMotocicleta {

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("La Burgman Street 125 2021 enciende electrónicamente por proximidad con botón...");
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub

		System.out.println("La Burgman Street 125 2021 se apaga electrónicamente por proximidad con botón...");
	}

}
