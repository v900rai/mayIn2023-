package DSA;
import java.util.Scanner;
public class ifelseIfstudent 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit");
		int num=sc.nextInt();
		if(num<=12)
		{
			System.out.println("child");	
		}
		else if(num>=12 && num<=18)
		{
			System.out.println("Teenager");
		}
		else
		{
			System.out.println("Adult");
		}
		
	}

}
