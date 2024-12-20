package in.inheritance;

public class Test {
	String name; // Dinga
	
	Test(){
		name="Dinga";
	}
		
	
	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(t.name);
		
		Test t1=new Test();
		System.out.println(t1.name);
		
		Test t2=new Test();
		System.out.println(t2.name);
	}
}
