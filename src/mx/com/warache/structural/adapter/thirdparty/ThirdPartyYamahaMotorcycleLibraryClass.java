package mx.com.warache.structural.adapter.thirdparty;

/**
 * Let's assume these classes is a third party library which you don't have
 * control on but only can make use of (let's say a jar dependency file)
 */
public class ThirdPartyYamahaMotorcycleLibraryClass {

	public void placeOrder(MotorcycleModel model) {
		System.out.println("Submiting order for " + model);
	}
}
