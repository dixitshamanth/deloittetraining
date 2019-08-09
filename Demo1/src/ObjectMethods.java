
class Customer{
	String name;
	int id;
	public Customer(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public Customer() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
public class ObjectMethods {
	public static void main(String[] args) {
		Customer e1=new Customer("Varun", 23);
		Customer e2=new Customer("Varun", 23);
		Customer e3=new Customer();
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		
	}
		
 }

