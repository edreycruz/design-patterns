package mx.com.warache.structural.composite;

public abstract class Componente {
	
	protected String nombre;
	
	abstract double getPrecio();
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
