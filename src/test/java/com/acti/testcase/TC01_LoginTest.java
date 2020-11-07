package com.acti.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.base.DriverScript;
import com.acti.pages.LoginPage;

public class TC01_LoginTest extends DriverScript {
	
	@BeforeMethod
	public void preCondtion()
	{
		initBrowser();
		launchApplication();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	@Test
	public void testLoginFun()
	{
	
		LoginPage loginPage = new LoginPage();
		loginPage.loginApplication("admin", "manager");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void testLogo()
	{
		LoginPage loginPage = new LoginPage();
		boolean result = loginPage.verifyLogo();
		System.out.println(result);
	}
	
	@AfterMethod
	public void postCondition()
	{
		closeApplication();
	}
}
