package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ChangePasswordPOM;
import com.training.pom.StudentLoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ChangePassword {
	private WebDriver driver;
	private String baseUrl;
	private StudentLoginPOM StudentloginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private ChangePasswordPOM ChangepasswordPOM;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		StudentloginPOM = new StudentLoginPOM(driver); 
		ChangepasswordPOM = new ChangePasswordPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	/*@BeforeMethod
	public void setUp() throws Exception {
		
	}*/
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void ChnagePasswordTest() {
		StudentloginPOM.sendUserName("Pooja456");
		StudentloginPOM.sendPassword("pooja123");
		StudentloginPOM.clickLoginBtn(); 
		ChangepasswordPOM.clickEditProfile();
		ChangepasswordPOM.sendPassword("pooja123");
		ChangepasswordPOM.sendnewPassword("prasad123");
		ChangepasswordPOM.confirmPassword("prasad123");
		ChangepasswordPOM.clicksaveSettings();
		screenShot.captureScreenShot("Change Password Test");
	}
}
