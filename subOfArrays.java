package javaInterviewProgram;

public class subOfArrays 
{
	public static void main(String []args)
	{
		float [] makrs= {12.3f, 13.3f,14.4f,15.3f};
		float sum=0;
		for(float element:makrs)
		{
			sum=sum+element;
		}
		System.out.println("the taotal number of sum "+sum);
	}

}
