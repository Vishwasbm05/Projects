package typecasting;

import java.util.Scanner;
public class Demo {
	
			
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a char value");
	char c=sc.next().charAt(0);
	System.out.println(c);
	byte a=10;
//	char b=a;
//	System.out.println(a+" "+b);
	
	char a1='A';
	byte b1=(byte)a1;
	
	System.out.println(a1+" "+b1);
}
}
