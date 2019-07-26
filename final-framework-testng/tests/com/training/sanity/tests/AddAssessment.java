package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AddAssessmentPOM;
import com.training.pom.CreateTestPOM;
import com.training.pom.TeacherLoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class AddAssessment {
	private WebDriver driver;
	private String baseUrl;
	private TeacherLoginPOM TeacherloginPOM;
	private AddAssessmentPOM AddassessmentPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		TeacherloginPOM = new TeacherLoginPOM(driver); 
		AddassessmentPOM = new AddAssessmentPOM(driver);
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
	public void CreateTest() throws Throwable {
		TeacherloginPOM.sendUserName("Pinky");
		TeacherloginPOM.sendPassword("pooja");
		TeacherloginPOM.clickLoginBtn(); 
		AddassessmentPOM.clickSelenium();
		AddassessmentPOM.clickAssessmentsIcon();
		AddassessmentPOM.clickAddOnineActivity();
		AddassessmentPOM.clickChooseTypeOfActivity();
		AddassessmentPOM.clickTests();
		AddassessmentPOM.clickChooseActivity();
		AddassessmentPOM.clickActivity();
		AddassessmentPOM.sendWeight("1");
		AddassessmentPOM.clickAddActivity();
		AddassessmentPOM.clickEdit();
		AddassessmentPOM.Visible();
		AddassessmentPOM.clickEditLink();
		AddassessmentPOM.clickCertificate();
		screenShot.captureScreenShot("Certificate");
}
}
