package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AddAssessmentPOM;
import com.training.pom.AddAssignmentsPOM;
import com.training.pom.TeacherLoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class AddAssignments {
	private WebDriver driver;
	private String baseUrl;
	private TeacherLoginPOM TeacherloginPOM;
	private AddAssignmentsPOM AddassignmentsPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		TeacherloginPOM = new TeacherLoginPOM(driver); 
		AddassignmentsPOM = new AddAssignmentsPOM(driver);
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
		AddassignmentsPOM.clickSelenium();
		AddassignmentsPOM.clickAssignmentsIcon();
		AddassignmentsPOM.clickCreateAssignment();
		AddassignmentsPOM.sendAssignmentName("hands on exercises");
		AddassignmentsPOM.sendDescription("Exercise");
		AddassignmentsPOM.clickAdvancedSettings();
		AddassignmentsPOM.sendMaximumScore("50");
		AddassignmentsPOM.clickValidate();
		AddassignmentsPOM.clickCheckbox();
		AddassignmentsPOM.clickSelenium1();
		AddassignmentsPOM.clickSettings();
		AddassignmentsPOM.clickAssignmentSettings();
		AddassignmentsPOM.clickAllowLearners();
		AddassignmentsPOM.clickSaveSettings();
		screenShot.captureScreenShot("Assignments");
}
	
}
