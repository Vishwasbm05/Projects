package typecasting;

public class Main {
public static void main(String[] args) {
	Human h=new Student();
	h.m();
	((Student)h).m1();

}
}
