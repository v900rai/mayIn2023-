package DSA;
import java.util.Scanner;
public class ifEvenNumber 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("the Even number");
		}
		else
		{
			System.out.println("the odd number");
		}
	}

}
