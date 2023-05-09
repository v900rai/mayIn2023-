package DSA;
import java.util.Scanner;
public class EncapsulationBank 
{
	private double bal=50000;
	private int paw;
	
	public void  Deposite(double money)
	{
		System.out.println("Enter the password");
		Scanner sc=new Scanner(System.in);
		int paw=sc.nextInt();
		if(paw==123)
		{
			bal=bal+money;
			System.out.println("Deposite Money "+ bal+money);
			System.out.println("Total Balance "+bal);
		}
		else
		{
			System.out.println("Incorrect Password!!!!!!!!!!!!!");
		}	
	}
	public void Withdraw(double money)
	{
		Scanner sc=new Scanner(System.in);
		int paw=sc.nextInt();
		if(paw==123)
		{
			bal=bal-money;
			System.out.println("Withdraw Money "+money);
			System.out.println("Total Balance "+bal);
		}
		else
		{
			System.out.println("Incorrect Password!!!!!!!!!!!!!");
		}	
	}
	public void checkbalance()
	{
		System.out.println("Enter the paswored");
		Scanner sc=new Scanner(System.in);
		int paw=sc.nextInt();
		if(paw==123)
		{
			System.out.println("Toatal balance"+bal);
		}
		else
		{
			System.out.println("Incorrect pasword");
			
		}
	}
}
	class Customer
	{
		public static void main(String []args)
		{
			
			EncapsulationBank  bank=new EncapsulationBank ();
			int ch;
			System.out.println(" 1, Deposite");
			System.out.println(" 2, Withdraw");
			System.out.println(" 3, checkBalnce");
			System.out.println();
			Scanner c=new Scanner(System.in);
			ch=c.nextInt();
			switch(ch) {
			case 1: bank.Deposite(1000);
			break;
			case 2: bank.Withdraw(2000);
			break;
			case 3: bank.checkbalance();
			break;
			default:
				System.out.println("Invailed choice");
			
			
			
			}
			
		}
		
	}

