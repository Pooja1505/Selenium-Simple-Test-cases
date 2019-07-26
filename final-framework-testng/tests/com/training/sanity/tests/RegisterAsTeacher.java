package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RegisterAsTeacher {
	private static WebDriver driver;
	private static RegisterAsTeacher RegisterAsTeacherPOM;
	private static Properties properties;
	private static ScreenShot screenShot;
	private static String baseUrl;
	private static com.training.pom.RegisterAsTeacherPOM RegisterAsTeacher;


	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		//RegisterAsStudentPOM = new RegisterAsStudent();
		RegisterAsTeacher = new com.training.pom.RegisterAsTeacherPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	//private Object firstName;
	//private Object lastName;
	//private Object email;

	/*@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		RegisterAsStudentPOM = new RegisterAsStudent(); 
		properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}*/
	@Test
	public void validateStudent() throws InterruptedException {
		RegisterAsTeacher.clickSignUp();
		Thread.sleep(3000);
		RegisterAsTeacher.sendfirstName("pinky");
		RegisterAsTeacher.email("pinkysharma.ps686@gmail.com");
		RegisterAsTeacher.username("Pinky");
		RegisterAsTeacher.password("pooja");
		RegisterAsTeacher.confirmPassword("pooja");
		RegisterAsTeacher.phone("8608580510");
		RegisterAsTeacher.language();
		RegisterAsTeacher.english();
		RegisterAsTeacher.sendlastName("sharma");
		RegisterAsTeacher.studentRadio();
		RegisterAsTeacher.registerButton();
		screenShot.captureScreenShot("Register As Teacher Test");
	
	}
}
