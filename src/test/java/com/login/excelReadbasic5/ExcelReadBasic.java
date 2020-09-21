package com.login.excelReadbasic5;
import java.io.IOException;

import org.apache.poi.hssf.model.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.excelRead.Library.ExcelRead;





public class ExcelReadBasic {


	static WebDriver driver;
	static String projectURL = "https://demo.openmrs.org/openmrs/login.htm";

	@Test(dataProvider = "openMRSLoginData")
	public void Login(String username, String password )
	{


		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(projectURL);

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);

		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);

		driver.findElement(By.xpath("//*[@id=\"Isolation Ward\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();


	}
	
	@DataProvider(name = "openMRSLoginData")			//dataprovider annotation.
	public Object[][] passData() throws Exception
	{
		
		ExcelRead er=new ExcelRead("C:\\Users\\tanumay123\\Desktop\\Automation\\Selenium_projects_workspace\\DataDrivenFramework_Excel_basic\\src\\test\\resources\\testData2.xlsx");
		int j;
		Object[][] data =new Object[j][2];
		
		for(int i=0; i<j; i++)
		{
			for(int j1=0; j1<i; j1++)
			{
				data[i][0]=er.getData(0, i, 0);
			}
			
		
				
			
		}
		
		return data;
		
	}

}
