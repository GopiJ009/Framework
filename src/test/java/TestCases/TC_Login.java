package TestCases;

import org.testng.annotations.Test;

import PageObject.LoginPage;

public class TC_Login extends BaseClass{
	
	@Test
	public void login(){
		
		driver.get(URL);
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUsername(username);
		
		System.out.println("username is enterd");
		
		lp.setPassword(password);
		
		System.out.println("password is enterd");
		
		lp.clickLogin();
		
		System.out.println("testcase is passed");
	}
	

}
