package Upcasting;

public class CargoPlane extends Plane{
	void takeOff() {
		System.out.println("Cargo Plane took off");
	}
	
	void fly() {
		System.out.println("Cargo plane flying ");
	}
	
	void land() {
		System.out.println("Cargo Plane landing");
	}
}
