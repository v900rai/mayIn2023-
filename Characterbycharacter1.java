package selfStringPratices;

import java.util.Scanner;

public class Characterbycharacter1 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the characterbycharater");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		 charaterbycharacter.print(s1);
		
	}
	static class  charaterbycharacter
	{
	public static void print(String s)
	{
		for(int i=0; i<=s.length()-1; i++)
		{
			System.out.println(s.charAt(i));
		}
		System.out.println();
	
	}

}
}
