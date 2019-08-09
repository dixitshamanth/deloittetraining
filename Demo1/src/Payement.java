
public class Payement {
public static void main(String[] args) {
	SingletonDemo s1=SingletonDemo.getObject();
	SingletonDemo s2=SingletonDemo.getObject();
	SingletonDemo s3=SingletonDemo.getObject();
	
	s1.pay(200);
	s2.pay(233);
	s3.pay(322);
}
}
