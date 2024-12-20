package in.inheritance;

public class Main {
public static void main(String[] args) {
	Vegetable v=new Vegetable();
	Potatoes p=new Potatoes();
	Carrot c=new Carrot();
	v.wash();
	v.chop();
//v.prepareFries(); // we can't access sub specific methods using superclass
//						reference
	p.wash();
	p.chop();
	p.prepareFries();
	c.wash();
	p.chop();
	c.prepareHalwa();
	
	
}
}
