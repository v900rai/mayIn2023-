package OctoberProgram;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.Inflater;
public class ArrayListt 
{
	public static void main(String []args)
	{
		ArrayList list= new ArrayList();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		//list.add("vishal");
		
		
		System.out.println("Print All the Element....   " +list);
		System.out.println();
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println("iterartor "+it.next());
		}
		// for each loop
		/*for(integer element:list)
		{
			System.out.println("For each loop "+element);
		}
		
		*/
		
	}

}
