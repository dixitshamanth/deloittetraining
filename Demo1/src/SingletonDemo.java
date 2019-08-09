
public class SingletonDemo {
static SingletonDemo singleton=new SingletonDemo();
//make constructor pprivate

private SingletonDemo() {
	System.out.println("Object created");
}

public static SingletonDemo getObject() {
	return singleton;
}

public void pay(int amount) {
	System.out.println("Payment done: "+amount);
}
}
