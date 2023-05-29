package edu.selfpractice.programing.string;
/// wrp for the or odd number and even number without using modules operator
import java.util.Scanner;

public class evenAndOd 
{
	public static void main(String[] args) 
	{
		//Scanner sc =new Scanner(System.in);
		//System.out.println("enter the number");
		int num=10;
		if((num & 1)==0)
		{
			System.out.println(num+" the even number");
		}
		else
		{
			System.out.println(num+" odd number");
		}
		
		
	}

}
