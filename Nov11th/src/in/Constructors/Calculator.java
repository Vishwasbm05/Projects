package in.Constructors;

public class Calculator {
int a,b,c;

	public Calculator() {
		this.a=10;
	}
	
	public Calculator(int b) {
		this();
		this.b = b;
	}

	public Calculator(int b, int c) {
			this(b);
			this.c = c;
	}


public static void main(String[] args) {
	Calculator c=new Calculator(20,30);
	System.out.println(c.a+" "+c.b+" "+c.c);
}
}
