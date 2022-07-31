package mx.com.warache.structural.adapter;

public class PedidoMotocicletaSuzuki implements PedidoMotocicleta {

	@Override
	public void enviarPedido(String json) {
		
		System.out.println("ENVIANDO PEDIDO DE COMPRA A SUZUKI...");
		// TODO Auto-generated method stub
		System.out.println(String.format(
				"Ejecutando pedido de motocicleta Suzuki a través de servicio REST con json de entrada : %s", json));
	}

}
