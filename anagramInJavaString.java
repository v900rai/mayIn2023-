package javaInterviewProgram;

import java.util.Arrays;

public class anagramInJavaString 
{
	public static void main(String []args)
	{
	String x="silint";
	String y="listen";
	char []a=x.toCharArray();
	char []b=y.toCharArray();
	 Arrays.sort(a);
	 Arrays.sort(b);
	 
	 boolean result=Arrays.equals(a, b);
	 if(result==true)
	 {
		 System.out.println("String are anagram");
	 }
	 else 
	 {
		 System.out.println("String is not anagram");
	 }
	}
}
