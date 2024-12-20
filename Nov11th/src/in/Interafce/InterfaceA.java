package in.Interafce;

public interface InterfaceA {
	int a=10;
	default void m() {
		System.out.println("hello");
	}
	static void m1() {
		System.out.println("world");
	}
	public static void main(String[] args) {
		System.out.println(a);
		m1();
	}
}

