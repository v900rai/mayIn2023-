package ArraysListInJavaAllProgram;

import java.util.ArrayList;

public class ArraysListRevers 
{
	public static void main(String []args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		System.out.print(list);
		System.out.println();
		for(int i=list.size()-1; i>=0; i--)
		{
			System.out.print(list.get(i)+"  ");
			
		}
		System.out.println();
		
	}

}
