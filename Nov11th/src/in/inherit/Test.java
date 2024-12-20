package in.inherit;

public class Test {
public static void main(String[] args) {
	Vegeteable v=new Vegeteable();
	Potatoes p=new Potatoes();
	Onion o=new Onion();
	
	v.wash();
	v.chop();

	p.wash();
	p.chop();
	p.prepareCurry();
	
	o.wash();
	o.chop();
	o.preparePakkoda();
}
}
