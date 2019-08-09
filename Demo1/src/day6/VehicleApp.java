package day6;

class Vehicle {
 int modelNumber;
 public Vehicle(String carType)
 {
	 System.out.println("Vehicle 2nd constructor called "+carType);
 }
}

class Car extends Vehicle
{
	public Car()
	{
		super("GG");
		System.out.println("Car def cons called");
	}
	
	public Car(String carType)
	{
		super(carType);
		modelNumber =2009;
		System.out.println("Car 2nd cons called "+carType);
	}
}

public class VehicleApp{
	public static void main(String[] args) {
		Car c=new Car("ford");
	}
}
