

	class A
	{
		int i=10;
		public A()
		{
			i=20;
			System.out.println("A default constuctor called");
		}
		
		public A(int num) {
			i=num;
			System.out.println("Parameterized constructor called");
		}
	}
	
	public class constructordemo {
		public static void main(String[] args) {
			A a1=new A();
			A a2=new A(50);
			System.out.println(a1.i);
			System.out.println(a2.i);
		}
	}

