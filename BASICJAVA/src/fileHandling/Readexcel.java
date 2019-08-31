package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class Readexcel {

	public static void main(String[] args) throws  Exception {
		String path="D:\\TESTING\\AUTOMATION\\ayushiautomation\\BASICJAVA\\src\\fileHandling\\TestData.xls";
		FileInputStream file= new FileInputStream(path);
		HSSFWorkbook wb= new HSSFWorkbook(file);
		HSSFSheet sheet=wb.getSheet("Sheet1");
		HSSFRow row=sheet.getRow(0);
		HSSFCell cells=row.getCell(0);
		String data=cells.getStringCellValue();
		System.out.println(data);
	
		//Readexcel ab= test();
	}
	public static Readexcel test()
	{
		return  new Readexcel();
	}
	
	
}
