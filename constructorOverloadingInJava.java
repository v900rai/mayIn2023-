package ArraysListInJavaAllProgram;

public class constructorOverloadingInJava 
{
	public constructorOverloadingInJava ()
	{
		System.out.println("no-arguments");
	}
	public void constructorOverloadingInJava (boolean a)
	{
		System.out.println("boolean value "+a);
	}
	 public constructorOverloadingInJava (String b)
	 {
		 System.out.println("String name  "+b);
	 }
	 public constructorOverloadingInJava (int c)
	 {
		 System.out.println("Interger values "+c);
	 }
	 public static void main(String []vishalrai)
	 {
		 System.out.println("main class started");
		 new constructorOverloadingInJava ();
		 new constructorOverloadingInJava ();
		 new constructorOverloadingInJava ("vishalrai");
		 new constructorOverloadingInJava (106);
		 new constructorOverloadingInJava ();
		 System.out.println("main class close");
		 
	 }

}
