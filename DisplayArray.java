package javaInterviewProgram;

import java.util.Scanner;

public class DisplayArray 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]= new int[size];
		
		System.out.println("Enter the value");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();	
		}
		 // display the array using for loop
	    System.out.println("The Entered array: ");
	    for(int i=0; i<arr.length; i++) {
	      System.out.print(arr[i] + " ");
			
		
	}
	}
}
