package arraylist;

import java.util.ArrayList;

public class mainClass 
{
	public static void main(String []args)
	{
		ArrayList a1= new ArrayList();
		a1.add(new student(111, "vishal", 66.88));
		for(int i=0; i<=a1.size()-1; i++ )
		{
			Object obj=a1.get(i);
			if(obj instanceof student);
			{
				System.out.println(obj);
			}
		}
		
	}
	
	
		
	

}
