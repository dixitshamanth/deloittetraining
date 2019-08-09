package day6;

abstract class Animal
	{
		public abstract void makeNoise();
		public void sleep() {
			System.out.println("sleep");
		}
		public abstract void roam(); 		
	
	}


abstract class Feline extends Animal
{
	public void roam() {
		System.out.println("Feline roam");
	}
}

class Lion extends Feline
{
	public void makeNoise() {
		System.out.println("Lion noise");
	};
}

class Tiger extends Feline
{
	public void makeNoise() {
		System.out.println("Tiger noise");
	};
}

public class AbstractDemo{
	
	public static void main(String[] args) {
		Lion l=new Lion();
		l.makeNoise();
		l.sleep();
		l.roam();
		
	    Tiger t=new Tiger();
		t.makeNoise();
		t.sleep();
		t.roam();

	}
}