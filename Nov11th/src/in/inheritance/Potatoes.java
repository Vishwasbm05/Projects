package in.inheritance;

public class Potatoes extends Vegetable {
	@Override
	void wash() {
		System.out.println("Potatoes washed");
	}
	void prepareFries() {
		System.out.println("Preparing French Fries");
	}
}
