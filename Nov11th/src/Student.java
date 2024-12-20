
public class Student {
	String name;
	int id;
	int age;
	
	Student(){
		System.out.println("Zero-parameterized constructor");
	}
	
	Student(String name){
		this();
		this.name=name;
		System.out.println("Single parametrized constructor");
	}
	
	Student(String name,int id){
		this(name);
		this.id=id;
		System.out.println("double parametrized constructor");
	}
	
	Student(String nm, int id,int age) {
		this(nm,id);
		this.age=age;
		System.out.println("Parameterized constructor");
	}
		
public static void main(String[] args) {
	Student s=new Student("dinga",23,23);
	System.out.println(s.name+ " "+ s.id+" "+s.age);
	

	
}

}
