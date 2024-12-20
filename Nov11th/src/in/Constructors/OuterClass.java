package in.Constructors;

class OuterClass {
	 int a=10;
 private class InnerClass{
		String nam="vishwas";
		void m() {
			System.out.println("hello");
			System.out.println(a);
		}
		public static void main(String[] args) {
			System.out.println("stupid");
			OuterClass o=new OuterClass();
			InnerClass i=o.new InnerClass();
			i.m();
			System.out.println(i.nam);
			
		}
	}
	public static void main(String[] args) {
		System.out.println("ajbjbajbasj");
		OuterClass o=new OuterClass();
		InnerClass i=o.new InnerClass();
		i.m();System.out.println(i.nam);
		
	}
}
