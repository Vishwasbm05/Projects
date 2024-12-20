package Upcasting;

public class PassengerPlane extends Plane {
	void takeOff() {
		System.out.println("Passenger Plane took off");
	}
	
	void fly() {
		System.out.println("Passenger plane flying ");
	}
	
	void land() {
		System.out.println("Passenger Plane landing");
	}
	
	void crash() {
		System.out.println("Passenger palne crashed");
	}

}
