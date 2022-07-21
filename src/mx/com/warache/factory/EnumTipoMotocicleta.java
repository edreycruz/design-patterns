package mx.com.warache.factory;

public enum EnumTipoMotocicleta {

	SCOOTER			("scooter",			ScooterMotocicleta.class),
	DOBLE_PROPOSITO	("doble_proposito",	DoblePropositoMotocicleta.class),
	NAKED			("naked",			NakedMotocicleta.class),
	SUPER_SPORT		("super_sport",		SuperSportMotocicleta.class);

	private String tipo;
	private Class<? extends Motocicleta> clazz;

	private EnumTipoMotocicleta(String tipo, Class<? extends Motocicleta> clazz) {
		this.tipo = tipo;
		this.clazz = clazz;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Class<? extends Motocicleta> getClazz() {
		return clazz;
	}

	public void setClazz(Class<? extends Motocicleta> clazz) {
		this.clazz = clazz;
	}

}
