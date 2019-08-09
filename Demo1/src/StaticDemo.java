
public class StaticDemo {

	String doctorname;
	int fees;
	static int countofobj=0;
	
	StaticDemo(){
		countofobj++;
		doctorname="NA";
		fees=500000;
	}
	
	StaticDemo(String doctorname, int fees){
		countofobj++;
		this.doctorname=doctorname;
		this.fees=fees;
	}
	
	public static void printObjCount() {
		System.out.println("Current number of objects:"+countofobj);
	}
	
	public void display() {
		System.out.println("Doctor name:"+doctorname);
		System.out.println("Doctor fees:"+fees);
	}
	
	public static void main(String[] args) {
		StaticDemo A=new StaticDemo();
		StaticDemo B=new StaticDemo("Vijay",600000);
		A.display();
		B.display();
		printObjCount();
		
	}
}
