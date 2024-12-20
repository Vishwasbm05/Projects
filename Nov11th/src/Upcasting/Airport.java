package Upcasting;

public class Airport {
	
	void allowPlane(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
		if(ref instanceof PassengerPlane ) {
			((PassengerPlane) ref).crash();
		}
		
	}
	
	
}
