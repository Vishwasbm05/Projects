package in.inheritance;

public class Main1 {
public static void main(String[] args) {
	Dosa d=new Dosa();
	d.prepareDosa();
//	((Object) d).prepareChutny();
	d.qty=5;
	System.out.println(d.qty);
//	System.out.println(d.nop);
	
}
}
