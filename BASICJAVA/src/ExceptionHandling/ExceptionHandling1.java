package ExceptionHandling;

public class ExceptionHandling1 {

	public static void main(String[] args) 
	{
		try {
			System.out.println(10/0);
			
		}catch(ArithmeticException e) 
		{
			System.out.println("Recovery scenario");
			System.out.println(e.getMessage());
		}

	}

}
