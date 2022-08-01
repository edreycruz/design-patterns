package mx.com.warache.structural.adapter;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PedidoMotocicleta pedidoSuzuki = new PedidoMotocicletaSuzuki();
		PedidoMotocicleta pedidoYamaha = new PedidoMotocicletaYamahaAdapter();
		
		pedidoSuzuki.enviarPedido("{motor:'650',frenos:'ABS',anio:'2021',color:'blanca'}");
		pedidoYamaha.enviarPedido("{motor:'650',frenos:'ABS',anio:'2022 SE',color:'White'}");
	}

}
