package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class LoginPage extends DriverScript{
	
	@FindBy(id="username") WebElement usernameTextbox;
	@FindBy(name="pwd") WebElement passwordTextbox;
	@FindBy(id="loginButton") WebElement loginButton;
	@FindBy(className="atLogoImg") WebElement LogoImg;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginApplication(String username, String password)
	{
		usernameTextbox.sendKeys(username);
		passwordTextbox.sendKeys(password);
		loginButton.click();
	}
	public boolean verifyLogo()
	{
		return LogoImg.isDisplayed();
	}
	public String pageTitle()
	{
		return driver.getTitle();
	}
}
