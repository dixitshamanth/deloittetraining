import java.util.*;

public class MapDemo {
public static void main(String[] args) {
	//key value pairs
	
	Map<Integer,String> data=new Hashtable<Integer,String>();
	
	data.put(12, "Neethu");
	data.put(43, "Bhuvan");
	data.put(34, "Raju");
	data.put(1, "Vijay");
	
	System.out.println(data.get(34));
	

	
}
}
