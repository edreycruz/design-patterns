package mx.com.warache.structural.composite;

public class Refaccion extends Componente {

	private Double precio;

	public Refaccion(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	double getPrecio() {
		// TODO Auto-generated method stub
		System.out.println(String.format("Refacción: %s, Costo: %s", this.nombre, this.precio));
		return this.precio;
	}

}
