package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) 
	{
		try {
			System.out.println(10/0);
			System.out.println("Anand");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}finally {
			System.out.println("Finally Block");
		}

	}

}
