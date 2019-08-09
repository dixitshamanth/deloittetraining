
import java.io.*;
class Customer1 implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private int Customer1Id;
    private String Customer1Name;
    private String Customer1Addr;
    private int billAmount;
    
    public Customer1() {
        // TODO Auto-generated constructor stub
    }
 
    public Customer1(int i, String string, String string2, int j) {
        // TODO Auto-generated constructor stub
    }
 
    public int getCustomer1Id() {
        return Customer1Id;
    }
 
    public void setCustomer1Id(int Customer1Id) {
        this.Customer1Id = Customer1Id;
    }
 
    public String getCustomer1Name() {
        return Customer1Name;
    }
 
    public void setCustomer1Name(String Customer1Name) {
        this.Customer1Name = Customer1Name;
    }
 
    public String getCustomer1Addr() {
        return Customer1Addr;
    }
 
    public void setCustomer1Addr(String Customer1Addr) {
        this.Customer1Addr = Customer1Addr;
    }
 
    public int getBillAmount() {
        return billAmount;
    }
 
    public void setBillAmount(int billAmount) {
        this.billAmount = billAmount;
    }
    
    
    
    @Override
	public String toString() {
		return "Customer1 [Customer1Id=" + Customer1Id + ", Customer1Name=" + Customer1Name + ", Customer1Addr="
				+ Customer1Addr + ", billAmount=" + billAmount + "]";
	}

	public static void readObjectFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
 	   Customer1 cust=new Customer1();
 	   ObjectInputStream stream = new ObjectInputStream(new FileInputStream("sample.txt"));
 	   cust=(Customer1) stream.readObject();
 	   stream.close();
 	   System.out.println(cust);
}
    
    
    public static void saveObjectToFile() throws FileNotFoundException, IOException {
  	   Customer1 cust=new Customer1(112,"Varun","Jupiter",25400);
  	   ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("sample.txt"));
  	   stream.writeObject(cust);
  	   stream.close();
 }
}
public class Demo5 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
    {
       
        
        Customer1.saveObjectToFile();
        Customer1.readObjectFromFile();
    	   
    	   
       }
    }
