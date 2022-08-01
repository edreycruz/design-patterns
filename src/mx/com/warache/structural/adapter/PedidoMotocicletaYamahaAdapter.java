package mx.com.warache.structural.adapter;

import mx.com.warache.structural.adapter.thirdparty.MotorcycleModel;
import mx.com.warache.structural.adapter.thirdparty.ThirdPartyYamahaMotorcycleLibraryClass;

public class PedidoMotocicletaYamahaAdapter implements PedidoMotocicleta {

	private ThirdPartyYamahaMotorcycleLibraryClass pedidosYamaha;

	public PedidoMotocicletaYamahaAdapter() {
		super();
		this.pedidosYamaha = new ThirdPartyYamahaMotorcycleLibraryClass();
	}

	@Override
	public void enviarPedido(String json) {
		System.out.println("ENVIANDO PEDIDO DE COMPRA A YAMAHA...");
		// TODO Auto-generated method stub
		pedidosYamaha.placeOrder(mapMotorcycleModelFromJson(json));
	}

	private MotorcycleModel mapMotorcycleModelFromJson(String json) {
		System.out.println("Mapeando JSON a MotorcycleModel...");

		// This logic should implement a JSON->Object mapping process so an instance
		// from ThirdPartyYamahaMotorcycleLibraryClass expected type is generated
		// according to provided String parameters
		MotorcycleModel motocicleta = new MotorcycleModel();
		motocicleta.setEngine("650");
		motocicleta.setBrakes("ABS");
		motocicleta.setColor("White");
		motocicleta.setYear("2022 SE");

		return motocicleta;
	}

}
