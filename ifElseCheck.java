package edu.selfpractice.programing.string;

public class ifElseCheck 
{
	public static void main(String[] args)
	{
		check(20);
	}
	public static void check( int age)
	{
		if(age<18)
		{
			System.out.println("\"Access denied - You are not old enough!\"");
		}
		else 
		{
			System.out.println("\"Access granted - You are old enough!\"");
		}
	}

}
