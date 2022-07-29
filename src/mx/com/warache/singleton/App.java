package mx.com.warache.singleton;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotocicletaCatalogoSingleton catalogoUno = MotocicletaCatalogoSingleton.getInstance();
		MotocicletaCatalogoSingleton catalogoDos = MotocicletaCatalogoSingleton.getInstance();

		System.out.println(catalogoUno);
		System.out.println(catalogoDos);

//		catalogoUno.getRandomIntegers().stream().forEach((item) -> System.out.println(item));
//		catalogoDos.getRandomIntegers().stream().forEach((item) -> System.out.println(item));

	}

}
