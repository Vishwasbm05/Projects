package Upcasting;

public class Main {
public static void main(String[] args) {
	Plane p=new Plane();
	PassengerPlane pp=new PassengerPlane();
	CargoPlane cp=new CargoPlane();
	Airport a=new Airport();
	
	a.allowPlane(p);
	a.allowPlane(pp);
	a.allowPlane(cp);

	
	
}
}
