import java.util.Scanner;
public class NumAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		if(num1<0 || num2<0 )
			System.out.println("Invalid");
		
		else
		{
			num3=num1+num2;
			System.out.println("Added result is:"+num3);
		}
	}

}
