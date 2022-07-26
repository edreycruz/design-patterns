package mx.com.warache.creational.prototype;

public class App {

	public static void main(String[] args){
		
		Motocicleta moto1 = new Motocicleta();

		moto1.setBrand("Suzuki");
		moto1.setEngine("650cc");
		moto1.setWheels(2);
		moto1.setAbsBreakes("Brembo");
		moto1.setFrontSuspension("Conventional suspension");
		moto1.setRearSuspension("Monoshock");
		
		Motocicleta moto2 = moto1.clone();
		System.out.println(moto1);
		System.out.println(moto2);
		
		moto1.setWheels(4);
		System.out.println(moto1);
		System.out.println(moto2);
		
		moto2.setBrand("KTM");
		moto1.setWheels(6);
		System.out.println(moto1);
		System.out.println(moto2);
	}

}
