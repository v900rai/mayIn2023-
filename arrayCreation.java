package javaInterviewProgram;

import java.util.Scanner;

public class arrayCreation 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0; i<num; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("print the arrays in the size og length");
		for(int i=0; i<num; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
