
public class StringDemo {
	 
	    public static void main(String[] args)
	    {
	        String name ="Harish";
	        String name1 = new String("Harish");
	        name = "Riya";
	        name.concat(" Sharma");
	        System.out.println(name);
	        
	        System.out.println(name.substring(2,4));
	        System.out.println(name);
	        System.out.println(name.equals(name1)); //comparing values
	        System.out.println(name==name1); //comparing reference
	        System.out.println(name.endsWith("ya"));
	        System.gc();
	    }
	    
	    protected void finalize() throws Throwable
	    {
	        System.out.println("Employee finalize called");
	    }
}
	 
