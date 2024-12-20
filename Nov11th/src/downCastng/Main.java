package downCastng;

public class Main {
public static void main(String[] args) {
	Food f=new Food();
	Food f1=new Dosa();
	Food f2=new ChickenBiriyani();
	Food f3=new MasalaDosa();
	Food f4=new DonneBiriyani();
	
	if(f2 instanceof ChickenBiriyani) {
		((ChickenBiriyani) f2).prepareBiriyani();
	}
	else {
		System.out.println("No !");
	}
	
	if(f2 instanceof DonneBiriyani) {
		((DonneBiriyani) f2).prepareBiriyani();
	}
	else {
		System.out.println("No !");
	}
	
	
}
}
