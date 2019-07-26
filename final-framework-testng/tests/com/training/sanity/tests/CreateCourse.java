package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.CreateCoursePOM;
import com.training.pom.TeacherLoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class CreateCourse {
	private WebDriver driver;
	private String baseUrl;
	private TeacherLoginPOM TeacherloginPOM;
	private CreateCoursePOM CreatecoursePOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		TeacherloginPOM = new TeacherLoginPOM(driver); 
		CreatecoursePOM = new CreateCoursePOM(driver);
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
	public void CreateCourse() {
		TeacherloginPOM.sendUserName("Pinky");
		TeacherloginPOM.sendPassword("pooja");
		TeacherloginPOM.clickLoginBtn(); 
		CreatecoursePOM.clickCreatecourse();
		CreatecoursePOM.sendcourseName("Selenium");
		CreatecoursePOM.clickAdvancedsettings();
		CreatecoursePOM.clickCategory();
		CreatecoursePOM.clickSelectProjects();
		CreatecoursePOM.sendCourseCode("Sel11");
		CreatecoursePOM.clickLanguage();
		CreatecoursePOM.clickSelectLang();
		CreatecoursePOM.clickCreateCourseBtn();
		screenShot.captureScreenShot("Create Course Test 1");
		CreatecoursePOM.clickAddIntro();
		CreatecoursePOM.sendTextbox("This is a selenium course");
		CreatecoursePOM.clickSaveIntroTxt();
		screenShot.captureScreenShot("Save intro Test");
		CreatecoursePOM.clickCourseDescription();
		CreatecoursePOM.clickDescription();
		CreatecoursePOM.sendTitle("Selenium course for beginners_Description");
		CreatecoursePOM.sendContent("Selenium course for beginners_Description");
		CreatecoursePOM.clickSubmit();
		screenShot.captureScreenShot("Save Description Test");
		CreatecoursePOM.clickObjectives();
		CreatecoursePOM.sendObjTitle("Selenium course for beginners_Objectives");
		CreatecoursePOM.sendObjContent("Selenium course for beginners_Objectives");
		CreatecoursePOM.clickObjSubmit();
		screenShot.captureScreenShot("Save Objectives Test");
		CreatecoursePOM.clickTopics();
		CreatecoursePOM.sendTopicTitle("Selenium course for beginners_Topics");
		CreatecoursePOM.sendTopicContent("Selenium course for beginners_Topics");
		CreatecoursePOM.clickTopicSubmit();
		screenShot.captureScreenShot("Save Topics Test");
	}
}
