package OctoberProgram;

public class primeNumbr 
{
	public static void main(String []args)
	{
		int number=7,count=0;
		for(int i=1; i<=number; i++)
		{
			if(number%i==0)
			{
				count++;
			}
			if(count==2)
			{
				System.out.println(number+" it is prime  number");
			}
			else
			{
				System.out.println(number+" it is not prime number");
			}
			
		}
	}

}
