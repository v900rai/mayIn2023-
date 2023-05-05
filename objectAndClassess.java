package javaoops;

public class objectAndClassess 
{
	public static class Student{
		String name;
		int roll;
		double percent;
	}
	public static void main(String []args)
	{
		Student s=new Student();
		s.name="vishal";
		s.roll=106;
		s.percent=88.67;
		System.out.println(s.name+" "+s.roll+" "+s.percent);
		
		
	}

}
