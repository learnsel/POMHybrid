package com.qa.trek.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trek.qa.base.TestBase;
import com.trek.qa.pages.HomePage;
import com.trek.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
	/*
	 * @Test(priority=1) public void loginPageTitleTest(){ String title =
	 * loginPage.validateLoginPageTitle(); Assert.assertEquals(title,
	 * "Trek Bikes - The world's best bikes and cycling gear | Trek Bikes"); }
	 * 
	 * @Test(priority=2) public void trekLogoImageTest(){ boolean flag =
	 * loginPage.validateTREKImage(); Assert.assertTrue(flag); }
	 */
	@Test(priority=3)
	public void loginTest(){
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
