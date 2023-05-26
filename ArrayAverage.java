package javaInterviewProgram;

public class ArrayAverage 
{
	public static void main(String []args)
	{
		int arr[]= {10,20,30,40,50};
		// declare sum variable, & initialize with 0
	    double sum = 0.0;
	    // declare average variable
	    double avg = 0.0;
	    for(int i=0; i<arr.length; i++)
	    {
	    	sum=sum+arr[i];
	    }
	    avg=sum/arr.length;

	    // display result
	    System.out.println("Average: " + avg );

	}

}
