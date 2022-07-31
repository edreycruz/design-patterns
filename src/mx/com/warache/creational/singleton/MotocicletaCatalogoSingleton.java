package mx.com.warache.creational.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class MotocicletaCatalogoSingleton {

	private static volatile MotocicletaCatalogoSingleton catalogo;

	private List<Integer> randomIntegers;

	private MotocicletaCatalogoSingleton() {
		randomIntegers = generateRandomIntegerList();
	}

	public static MotocicletaCatalogoSingleton getInstance() {
		if (catalogo == null) {
			synchronized (MotocicletaCatalogoSingleton.class) {
				if (catalogo == null) {
					System.out.println("Generando catálogo...");
					catalogo = new MotocicletaCatalogoSingleton();
				}
			}
		}
		return catalogo;

	}

	private List<Integer> generateRandomIntegerList() {

		Random random = new Random();
		List<Integer> list = new ArrayList<>();

		while (list.size() < 15) {
			list.add(random.nextInt());
		}

		return list;
	}

	public List<Integer> getRandomIntegers() {
		return randomIntegers;
	}

}
