package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.TeacherLoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TeacherLogin {
	private WebDriver driver;
	private String baseUrl;
	private TeacherLoginPOM TeacherloginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		TeacherloginPOM = new TeacherLoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	/*@BeforeMethod
	public void setUp() throws Exception {
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}*/
	@Test
	public void validLoginTest() {
		TeacherloginPOM.sendUserName("Pinky");
		TeacherloginPOM.sendPassword("pooja");
		TeacherloginPOM.clickLoginBtn(); 
		String Expectedtitle = "Hello pinky sharma and welcome,";
		String Actualtitle = "Hello pinky sharma and welcome,";
		Assert.assertEquals(Expectedtitle, Actualtitle);
		System.out.println(Actualtitle);
		screenShot.captureScreenShot("Teacher login Test");
	}
}