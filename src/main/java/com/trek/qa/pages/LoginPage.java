package com.trek.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trek.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(xpath="(//*[@id='email'])")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="(//*[@id='primaryNavigation']//*[@id='logo-go-to-home'])")
	WebElement trekLogo;
	
	@FindBy(xpath="//*[@id='secondaryNavigation']//*[@class='is-dropdown-submenu-parent utility-dd opens-right']/a")
	WebElement personIcon;
	
	@FindBy(xpath="(//*[@class='sub-dd is-submenu-item is-dropdown-submenu-item']/a[contains(@href,'login')])")
	WebElement logInLink;
	
	
	//Initializing page objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateTREKImage(){
		return trekLogo.isDisplayed();
     }
	
	public HomePage login(String un, String pwd){
		personIcon.click();
		logInLink.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		//After login we are entering to home page so return type of login page should be homepage so this login method should retun hompage class object
		return new HomePage();
	}
}