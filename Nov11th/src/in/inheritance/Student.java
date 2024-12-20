package in.inheritance;

public class Student {
String name;	// instance variables
int id;
	void exams() {
		int marks;  // local variables
		marks=456;		// initializing before using
		System.out.println(marks);	// accessing in the same scope
	}
public static void main(String[] args) {
	Student s=new Student();
	System.out.println(s.name);
	s.exams();
}
}
