
public class Overriding {
	public void m1() {
		System.out.println("Parent m1");
	}
	
	public static void main(String[] args) 
	{
		Second s= new Second();
		s.m1();
	}
	
}

class Second extends Overriding{
	public void m1() {
		System.out.println("Child m1");
	}
	
}


