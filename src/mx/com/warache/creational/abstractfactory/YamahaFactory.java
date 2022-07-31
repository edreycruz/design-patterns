package mx.com.warache.creational.abstractfactory;

public class YamahaFactory implements MotocicletaFactory {

	@Override
	public ScooterMotocicleta getScooterMotocicleta(String modelo) {
		EnumYamahaScooterMotocicleta enumScooter = EnumYamahaScooterMotocicleta.valueOf(modelo);
		if(enumScooter == null) throw new IllegalArgumentException("Modelo no existente...");
		ScooterMotocicleta motocicleta = (ScooterMotocicleta) instanciarObjeto(enumScooter.getModelo());
		return motocicleta;
	}

	@Override
	public AdventureMotocicleta getAdventureMotocicleta(String modelo) {
		EnumYamahaAdventureMotocicleta enumAdventure = EnumYamahaAdventureMotocicleta.valueOf(modelo);
		if(enumAdventure == null) throw new IllegalArgumentException("Modelo no existente...");
		AdventureMotocicleta motocicleta = (AdventureMotocicleta)instanciarObjeto(enumAdventure.getModelo());
		return motocicleta;
	}
}
