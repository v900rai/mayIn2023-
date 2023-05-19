package javaInterviewProgram;

public class reversString 
{
		public static void main (String[] args) {
		       
	                String str= "vishalrai";
	        		String rev="";
	                
	       
	      System.out.print("Original word: ");
	      System.out.println("vishalrai"); //Example word
	       
	      for (int i=0; i<str.length(); i++)
	      {
	      char  ch= str.charAt(i); //extracts each character
	        rev= ch+rev; //adds each character in front of the existing string
	      }
	      System.out.println("Reversed word: "+ rev);
	    }
		
	}


