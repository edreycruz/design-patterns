package mx.com.warache.abstractfactory;

import mx.com.warache.abstractfactory.modelos.Burgman400ScooterMotocicleta;
import mx.com.warache.abstractfactory.modelos.BurgmanStreet125ScooterMotocicleta;
import mx.com.warache.abstractfactory.modelos.XMax2023ScooterMotocicleta;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuzukiFactory suzukiFactory = new SuzukiFactory();
		YamahaFactory yamahaFactory = new YamahaFactory();

		ScooterMotocicleta burgman400 = (Burgman400ScooterMotocicleta) suzukiFactory
				.getScooterMotocicleta(EnumSuzukiScooterMotocicleta.SUZUKI_BURGMAN_400.name());
		
		ScooterMotocicleta burgman400_2 = (Burgman400ScooterMotocicleta) suzukiFactory
				.getScooterMotocicleta(EnumSuzukiScooterMotocicleta.SUZUKI_BURGMAN_400.name());
		
		ScooterMotocicleta burgman125 = (BurgmanStreet125ScooterMotocicleta ) suzukiFactory
				.getScooterMotocicleta(EnumSuzukiScooterMotocicleta.SUZUKI_BURGMAN_125.name());

		ScooterMotocicleta xmax2023 = (XMax2023ScooterMotocicleta) yamahaFactory
		.getScooterMotocicleta(EnumYamahaScooterMotocicleta.YAMAHA_XMAX_2023.name());
		
		
		burgman400.encender();
		burgman400_2.encender();
		burgman125.encender();
		xmax2023.encender();
		
		burgman400_2.apagar();
		burgman125.apagar();
		xmax2023.apagar();
		
	}

}
