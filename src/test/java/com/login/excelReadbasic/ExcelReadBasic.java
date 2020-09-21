package com.login.excelReadbasic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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
	public Object[][] passData()
	{

		Object[][] data =new Object[3][2];

		data[0][0]= "Admin1";
		data[0][1]= "Admin123";

		data[1][0]= "Admin";
		data[1][1]= "Admin123";

		data[2][0]= "Admin2";
		data[2][1]= "Admin123";


		return data;

	}

}
