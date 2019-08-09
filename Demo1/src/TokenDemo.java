import java.util.StringTokenizer;

public class TokenDemo {
public static void main(String[] args) {
	String quote="Once Upon a time; a movie";
	StringTokenizer tokenizer=new StringTokenizer(quote,";");
	System.out.println(tokenizer.countTokens());
	String []rev=new String[100];
	int i;
	while(tokenizer.hasMoreTokens())
	{	
		for(i=0;i<tokenizer.countTokens();i++)
		rev[i]=tokenizer.nextToken();
	}
	
	for(i=tokenizer.countTokens();i>0;i--)
	{
		System.out.println(rev[i]);
	}
}
}
