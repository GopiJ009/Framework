package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public String URL="https://adactinhotelapp.com/";
	public String username="mahesh23456";
	public String password="India@123";
	
	public  WebDriver driver;
	
	@BeforeClass
	public void OpenApplication(){
		//launch the web driver
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
	}
	
	@AfterClass
	public void CloseApplication(){
		
		driver.quit();
	}
	
	

}
