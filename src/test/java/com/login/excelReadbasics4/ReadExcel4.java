package com.login.excelReadbasics4;


import java.io.IOException;

import com.excelRead.Library.ExcelRead;

//This package is used for accessing library package

public class ReadExcel4 {
	
	
	public static void main (String arg []) throws IOException
	{
		
		ExcelRead er= new ExcelRead("C:\\Users\\tanumay123\\Desktop\\Automation\\Selenium_projects_workspace\\DataDrivenFramework_Excel_basic\\src\\test\\resources\\testData.xlsx");
		
		System.out.println(er.getData(12, 0, 1));
		
	}

}
