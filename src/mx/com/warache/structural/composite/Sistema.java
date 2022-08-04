package mx.com.warache.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Sistema extends Componente {

	List<Componente> componentes;

	public Sistema(String nombre) {
		this.nombre = nombre;
		this.componentes = new ArrayList<>();
	}

	@Override
	double getPrecio() {
		Double precio = componentes.stream().mapToDouble(Componente::getPrecio).sum(); 
		System.out.println(String.format("Sistema %s, costo reparación: %s\n", this.nombre, precio));
		return precio;
	}

	public List<Componente> getComponentes() {
		return componentes;
	}

	public void setComponentes(List<Componente> componentes) {
		this.componentes = componentes;
	}
}
