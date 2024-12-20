
interface  Demo1 {
@Override
String toString();
}

public class Demo extends Object implements Demo1 {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public static void main(String[] args) {
		Demo1 d=new Demo();
		
		System.out.println(d.toString());
	}
}
