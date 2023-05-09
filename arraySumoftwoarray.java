package DSA;
import java.util.Scanner;
public class arraySumoftwoarray 
{
	public static void main(String []args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 =sc.nextInt();
		int arr1[]=new int[num1];
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i]=sc.nextInt();
		}
		int num2 =sc.nextInt();
		int arr2[]=new int[num2];
		for(int i=0; i<arr2.length; i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		int[] sum =new int[num1 > num2 ? num1 :num2];
		int c=0;
		int i=arr1.length-1;
		int j=arr2.length-1;
		int k=sum.length-1;
		
		while(k>=0)
		
		{
			int d=c;
			if(i>=0)
			{
				d+=arr1[i];
			}
			
			if(j>=0)
			{
				d+=arr2[j];
			}
			c=c/10;
			d=d%10;
			sum[k]=d;
			i--;
			j--;
			k--;
		}
		if(c!=0)
		{
			System.out.print(c);
		}
		for(int val:sum) {
			System.out.println(val);
		}
		
		
		
	}

}
