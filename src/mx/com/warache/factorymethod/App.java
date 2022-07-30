package mx.com.warache.factorymethod;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motocicleta motocicletaScooter = MotocicletaFactory
				.fabricarMotocicleta(EnumTipoMotocicleta.SCOOTER);
		
		Motocicleta motocicletaDobleProposito = MotocicletaFactory
				.fabricarMotocicleta(EnumTipoMotocicleta.DOBLE_PROPOSITO);
		
		Motocicleta motocicletaNaked = MotocicletaFactory
				.fabricarMotocicleta(EnumTipoMotocicleta.NAKED);
		
		Motocicleta motocicletaSuperSport = MotocicletaFactory
				.fabricarMotocicleta(EnumTipoMotocicleta.SUPER_SPORT);

		System.out.println(motocicletaScooter);
		System.out.println(motocicletaDobleProposito);
		System.out.println(motocicletaNaked);
		System.out.println(motocicletaSuperSport);
	}

}
