package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.CreateTestPOM;
import com.training.pom.TeacherLoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class CreateTest {
	private WebDriver driver;
	private String baseUrl;
	private TeacherLoginPOM TeacherloginPOM;
	private CreateTestPOM CreatetestPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		TeacherloginPOM = new TeacherLoginPOM(driver); 
		CreatetestPOM = new CreateTestPOM(driver);
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
		CreatetestPOM.clickSelenium();
		Thread.sleep(3000);
		CreatetestPOM.clickTestsIcon();
		CreatetestPOM.clickCreateNewTest();
		CreatetestPOM.sendTestName("Online Quiz Final 1");
		CreatetestPOM.clickAdvancedSettings();
		CreatetestPOM.sendContextTest("Quiz");
		CreatetestPOM.clickFeedback();
		CreatetestPOM.clickEnableStartTime();
		CreatetestPOM.clickTime();
		CreatetestPOM.clickCalenderNext();
		CreatetestPOM.clickCalenderSelect();
		CreatetestPOM.clickCalenderDone();
		CreatetestPOM.sendPassPercentage("50");
		CreatetestPOM.clickProceedToQ();
		CreatetestPOM.clickMultipleChoice();
		CreatetestPOM.sendQuestion("which course are you learning?");
		CreatetestPOM.sendOption1("Selenium");
		CreatetestPOM.sendOption2("Java");
		CreatetestPOM.sendOption3("C");
		CreatetestPOM.sendOption4("C#");
		CreatetestPOM.clickAnswer1();
		CreatetestPOM.clickAddQ1();
		CreatetestPOM.clickMultipleChoice1();
		CreatetestPOM.sendQuestion1("which language are you using in selenium?");
		CreatetestPOM.sendQ2Option1("python");
		CreatetestPOM.sendQ2Option2("Java");
		CreatetestPOM.sendQ2Option3("C");
		CreatetestPOM.sendQ2Option4("C#");
		CreatetestPOM.clickAnswer2();
		CreatetestPOM.clickAddQ2();
		CreatetestPOM.clickPreview();
		CreatetestPOM.clickStartTest();
		CreatetestPOM.clickQ1Answer();
		CreatetestPOM.clickNextQ();
		CreatetestPOM.clickQ2Answer();
		CreatetestPOM.clickEndTest();
		screenShot.captureScreenShot("Results");
	}
}
