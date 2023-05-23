package edu.jspider.String;

public class duplicate 
{	static	 String s= "programming";
	public static boolean isUnique(char c) {
	int count=0;
	for(int i=0; i<s.length(); i++)
	 {
		if(s.charAt(i)==c)
			count++;
	}
	if(count==1)
		return true;
	return false;
}
	public static void main(String[] args)
	{
	

		for(int i=0; i<s.length(); i++)
		{
			boolean isUnique=isUnique(s.charAt(i));
			if(isUnique)
				System.out.print(s.charAt(i));
		}
		
	}
}


