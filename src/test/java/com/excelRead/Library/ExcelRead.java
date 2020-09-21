package com.excelRead.Library;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {


	XSSFSheet sheet1;
	XSSFWorkbook wb;
	FileInputStream fis;

	//Constructor
	public ExcelRead(String excelpath) throws IOException
	{


		File src =new File(excelpath);

		fis =new FileInputStream(src);

		wb =new XSSFWorkbook(fis);


	}

	public String getData(int idex , int row , int col)
	{
		sheet1 = wb.getSheetAt(0);
		String data=sheet1.getRow(row).getCell(col).getStringCellValue();
		return data;
	}


}
