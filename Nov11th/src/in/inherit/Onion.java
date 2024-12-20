package in.inherit;

public class Onion extends Vegeteable{
	@Override
	void wash() {
		System.out.println("Onion washed");
	}
	
	
	void preparePakkoda() {
		name="Onion";
		qty=5;
		System.out.println("preparing pakkoda");
		System.out.println(name);
		System.out.println(qty);
	}
}
