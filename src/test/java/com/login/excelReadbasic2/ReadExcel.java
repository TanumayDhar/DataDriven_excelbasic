package com.login.excelReadbasic2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {


	public static void main(String arg []) throws IOException
	{
		//file class to specify the testexcel path
		File src = new File("C:\\Users\\tanumay123\\Desktop\\Automation\\Selenium_projects_workspace\\DataDrivenFramework_Excel_basic\\src\\test\\resources\\testData.xlsx");
		
		// class to load the testexcel , specify file source	Note: all reading writing of file will be there in java.io file
		FileInputStream fis = new FileInputStream(src);   
		
		//XSSFWorkbook ->APACHE POI package, total work book will be loaded by this. used for xlsx
		XSSFWorkbook wb =new XSSFWorkbook(fis);  		
		//Index- excel tab (sheet number)												
		XSSFSheet sheet1=  wb.getSheetAt(2);
		
		Integer num=sheet1.getLastRowNum();
		
		System.out.println(num);
		
		String sheetOutput=sheet1.getRow(1).getCell(0).getStringCellValue();
		
		System.out.println("Data from  excel is "+ sheetOutput);
		
		wb.cloneSheet(2);
	
		
		
	}



}
