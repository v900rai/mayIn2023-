package DSA;

public class methodCallingFunction 
{
	public static void main(String []args)
	{
		System.out.println("hi");
		double x=m1(10,'A');
		System.out.println(x);
		
		
	}
	public static double m1(int a, char b)
	{
		System.out.println(a);
		System.out.println(b);
		return 101.23;
		
	}

}
