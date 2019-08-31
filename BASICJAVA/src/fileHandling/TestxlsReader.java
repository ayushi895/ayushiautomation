package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class TestxlsReader {

	public static void main(String[] args) throws IOException 
	{
		Xls_Reader xl= new Xls_Reader("D:\\TESTING\\AUTOMATION\\ayushiautomation\\BASICJAVA\\src\\fileHandling\\TestData.xls");
				int rows=xl.getRowCount("Sheet1");
				int cols=xl.getColumnCount("Sheet1");
				System.out.println(rows);
				System.out.println(cols);
				
				System.out.println(xl.getCellData("sheet1", 1, 1));
				for (int r=1; r<=rows; r++)
				{
					for(int c=1; c<=cols; c++)
					{
						System.out.print(xl.getCellData("sheet1" ,r ,c)+"  ");
						
					}
					System.out.println( );
				}

	}


}
