
public class Calcy {
int a,b,c;

	public Calcy() {
		this.a=10;
		System.out.println("zero - para");
	}
	
	public Calcy(int b) {
		this();
		this.b = b;
		System.out.println("Single - para");
	}
	
	public Calcy(int b, int c) {
		this(b);
		this.c = c;
		System.out.println("double - para");

	}
	
	public Calcy(int a, int b, int c) {
		this(b,c);
		System.out.println("three - para");

	}
	public static void main(String[] args) {
		Calcy c=new Calcy(10,20,30);
		System.out.println(c.a+" "+c.b+" "+c.c);
		
		System.out.println(c.toString());

	}

}
