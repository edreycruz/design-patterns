package mx.com.warache.structural.composite;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Componente reparacion = new Sistema("Reparación integral");
		
		Componente corona = new Refaccion("Corona", 500.00);
		Componente cadena = new Refaccion("Cadena", 700.00);
		Componente sprock = new Refaccion("Sprock", 200.00);
		Componente sistemaArrastre = new Sistema("Sistema de arrastre");
		
		((Sistema)sistemaArrastre).getComponentes().add(corona);
		((Sistema)sistemaArrastre).getComponentes().add(cadena);
		((Sistema)sistemaArrastre).getComponentes().add(sprock);
		
		Componente zapata = new Refaccion("Zapata", 250.00);
		Componente piston = new Refaccion("Pistón", 300.00);
		Componente palanca = new Refaccion("Palanca de freno", 150.00);
		Componente disco = new Refaccion("Disco ventilado", 650.00);
		Componente caliper = new Sistema("Caliper");
		Componente sistemaFrenado = new Sistema("Sistema de frenado");
		
		
		((Sistema)caliper).getComponentes().add(zapata);
		((Sistema)caliper).getComponentes().add(piston);

		((Sistema)sistemaFrenado).getComponentes().add(palanca);
		((Sistema)sistemaFrenado).getComponentes().add(disco);
		((Sistema)sistemaFrenado).getComponentes().add(caliper);
		
		((Sistema)reparacion).getComponentes().add(sistemaArrastre);
		((Sistema)reparacion).getComponentes().add(sistemaFrenado);
		
		System.out.println(String.format("Costo total de reparación: %s", reparacion.getPrecio()));
		
		
	}

}
