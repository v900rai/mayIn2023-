package edu.jspider.String;
import java.util.Scanner;
public class reversString 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		 String revers="";
		System.out.println("Input the name");
		for(int i=str.length()-1; i>=0; i--)
		{
		revers=revers+str.charAt(i);
			
		}
		System.out.println(revers);
		
	}

}
