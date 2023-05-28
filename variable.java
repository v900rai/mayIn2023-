package OctoberProgram;

public class variable 
{
	static int a=12;// static variable bcoz static keyword used
	int b=20;/// instance variable 
	public static void main(String []args)
	{
		double d=12.2; // local variable
		variable  vr=new variable ();
		System.out.println(" static variable "+a);
		System.out.println(vr.b);
		System.out.println(d); 
	}

}
