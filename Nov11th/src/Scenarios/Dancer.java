package Scenarios;

public class Dancer {
	void dance() {
		System.out.print( " Dancer dancing ");
		Jacket jac=Throws();
//      Jacket jac=new Jacket();
		System.out.println(jac);
	
	}
	
	Jacket Throws() {
		System.out.print("and throwing jacket \n");
		return new Jacket();
	}
}
