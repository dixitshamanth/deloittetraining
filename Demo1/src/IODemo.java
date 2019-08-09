import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;


public class IODemo {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\deloitte\\projects\\Batch");
	File f1=new File("C:\\deloitte\\projects\\Batch\\Students");
	File f2=new File("C:\\deloitte\\projects\\Batch\\Students\\batchmates.txt");
	
	if(f.exists())
	{
		File allFiles[]	= f1.listFiles();
		for(File temp: allFiles) {
			if(temp.isDirectory()) {
				System.out.println(temp+" is directory");
			}
			else {
				System.out.println(temp+" is file");
			}
		}
	}
	
	else {
		f.mkdir();
		f1.mkdir();
		f2.createNewFile();
		System.out.println("File and folder created");
	}
	
	FileWriter fw=new FileWriter("C:\\deloitte\\first.txt");
	fw.write("Hi bro");
	FileReader fr=new FileReader("C:\\deloitte\\first.txt");
	int i=0;
	while((i=fr.read())!=-1){
		System.out.println((char)i);
	}
	fw.close();
	fr.close();
	System.out.println("done");
		
	
}
}
