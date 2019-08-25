package ExceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		pause1(6000);
		pause(2000);
		test();
		// TODO Auto-generated method stub

	}
	public static void pause(int seconds) throws InterruptedException
	{
		Thread.sleep(seconds);
	}
	public static void pause1(int seconds)
	{
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e){
			e.printStackTrace();
			
		}
	}
	public static void test() throws ArithmeticException
	{
		
	}
}
