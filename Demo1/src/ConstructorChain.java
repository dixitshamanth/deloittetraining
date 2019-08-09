
public class ConstructorChain {
	private int id;
	private String name;
	private int marks;
	public ConstructorChain() {
		id=0;
		name="NA";
		marks=50;
			
	}
	public ConstructorChain(int id, String name) {
		this();
		this.id = id;
		this.name = name;
	}
	public ConstructorChain(int id, String name, int marks) {
		
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public static void main(String[] args) {
		ConstructorChain c=new ConstructorChain(1,"Divya");
		System.out.println(c.id);
		System.out.println(c.name);
		System.out.println(c.marks);
		
	}
	
	
}
