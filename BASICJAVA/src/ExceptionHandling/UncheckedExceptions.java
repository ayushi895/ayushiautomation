package ExceptionHandling;

public class UncheckedExceptions

{
	public static UncheckedExceptions obj;
	public static void main(String[] args) 
	{
		String str = "Ayushi";
				//System.out.println(str.charAt(7));
				//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 7
				//at java.lang.String.charAt(Unknown Source)
				//at ExceptionHandling.UncheckedExceptions.main(UncheckedExceptions.java:8)

				//System.out.println(10/0);
				//Exception in thread "main" java.lang.ArithmeticException: / by zero
				//at ExceptionHandling.UncheckedExceptions.main(UncheckedExceptions.java:13)
		//obj.test();
		//Exception in thread "main" java.lang.NullPointerException
		//at ExceptionHandling.UncheckedExceptions.main(UncheckedExceptions.java:18)

		
		
		obj=new UncheckedExceptions();
		obj.test();


	}
	public static void test() 
	{
		// TODO Auto-generated method stub
		
	}

}
