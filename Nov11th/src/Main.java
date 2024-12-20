class Parent {
	void m1() {
		System.out.println("Parent method");
	}
}

class Child extends Parent{
	void m1() {
		System.out.println("Child method");
	}
	void m() {
		System.out.println("Child method-1");
	}
}
public class Main{
	public static void main(String[] args) {
		Parent p=new Child();
		p.m1();
		((Child) p).m();
	}
}