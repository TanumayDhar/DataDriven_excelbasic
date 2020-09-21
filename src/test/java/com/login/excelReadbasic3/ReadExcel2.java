package com.login.excelReadbasic3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {


	public static void main(String arg []) throws IOException
	{

		File src = new File("C:\\Users\\tanumay123\\Desktop\\Automation\\Selenium_projects_workspace\\DataDrivenFramework_Excel_basic\\src\\test\\resources\\testData.xlsx");

		FileInputStream fis = new FileInputStream(src);   

		XSSFWorkbook wb =new XSSFWorkbook(fis);  		

		XSSFSheet sheet1=  wb.getSheetAt(0);

		Integer rowCount=sheet1.getLastRowNum();

		System.out.println("Total row count are "+rowCount);



		for(int i=0 ; i<=rowCount ; i++)
		{

			String value=sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println(value);

		}




	}



}
