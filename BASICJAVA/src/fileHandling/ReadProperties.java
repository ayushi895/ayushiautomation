package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file= new FileInputStream("D:\\TESTING\\AUTOMATION\\ayushiautomation\\BASICJAVA\\src\\fileHandling\\OR.Properties");
		Properties or= new Properties();
		or.load(file);
		System.out.println(or.getProperty("name"));
		
		

	}

}
