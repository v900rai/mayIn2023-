package javaInterviewProgram;
import java.util.*;
public class TwoArraySum 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		// take number of elements in both array
	    System.out.print("Enter number of elements in first array: ");
	    int array1 = sc.nextInt();
	    System.out.print("Enter number of elements in second array: ");
	    int array2 = sc.nextInt();
	    if(array1!=array2)
	    {
	    	System.out.println("Both array must have "+
                    "same number of elements");
	    	return;
	    }
	    //// declare three array with given size
	    int arr1[] = new int[array1];
	    int arr2[] = new int[array1];
	    int arr3[] = new int[array1];
	 // take input for array1 elements
	    System.out.println("Enter first array elements: ");
	    for (int i=0; i<arr1.length; i++) {
	      arr1[i] = sc.nextInt();
	    }

	    // take input for array2 elements
	    System.out.println("Enter second array elements: ");
	    for (int i=0; i<arr2.length; i++) {
	      arr2[i] = sc.nextInt();
	    }

	    // loop to iterate through the array
	    for (int i=0; i<arr1.length; i++) {
	      // add array elements
	      arr3[i] = arr1[i] + arr2[i];
	    }

	    // display the third array
	    System.out.println("Resultant Array: " 
	        + Arrays.toString(arr3));
	}

}

/*Enter number of elements in first array: 5
Enter number of elements in second array: 5
Enter first array elements:
10 20 30 40 50
Enter second array elements:
9 18 27 36 45
Resultant Array: [19, 38, 57, 76, 95]*/
