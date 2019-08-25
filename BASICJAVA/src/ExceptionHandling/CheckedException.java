package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException 
	{
		System.out.println("name");
		Thread.sleep(6000);
		UncheckedExceptions.test();
		System.out.println("Surname");
		
		FileInputStream obj=new FileInputStream("");

	}

}
