
package javaInterviewProgram;

public class checkItspresentOrNot 
{
	public static void main(String []args)
	{
		float [] makrs= {12.3f, 13.3f,14.4f,15.3f};
		float num=12.3f;
		boolean isInArray=false;
		for(float element:makrs)
		{
			if(num==element) {
				 isInArray=true;
				break;
			}
		}
			if(isInArray)
			{
				System.out.println("the valu is the present in the arrays");
			}
			else
			{
				System.out.println("the value is the not present in the arrays");
			}
				
			
		}
	}


