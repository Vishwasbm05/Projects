package in.Constructors;

public class Student extends Human {

int id;
int std;
Student(String name, int age,int id,int std) {
	super(name, age);
	this.id=id;
	this.std=std;
}

void displayDetails() {
	System.out.println(super.name+" "+super.age+" "+this.id+" "+this.std);
}
public static void main(String[] args) {
		Student s=new Student("Dinnga",20,25,8);
		

	}
}
