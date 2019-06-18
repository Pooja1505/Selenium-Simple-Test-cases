package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RegisterAsStudent {
	private static WebDriver driver;
	private static RegisterAsStudent RegisterAsStudentPOM;
	private static Properties properties;
	private static ScreenShot screenShot;
	private static String baseUrl;
	private static com.training.pom.RegisterAsStudentPOM RegisterAsStudent;


	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		//RegisterAsStudentPOM = new RegisterAsStudent();
		RegisterAsStudent = new com.training.pom.RegisterAsStudentPOM(driver);
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
	}*/
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validateStudent() throws InterruptedException {
		RegisterAsStudent.clickSignUp();
		Thread.sleep(3000);
		RegisterAsStudent.sendfirstName("pooja");
		RegisterAsStudent.email("poojaprasadms47@gmail.com");
		RegisterAsStudent.username("Pooja456");
		RegisterAsStudent.password("pooja123");
		RegisterAsStudent.confirmPassword("pooja123");
		RegisterAsStudent.phone("7092984246");
		RegisterAsStudent.language();
		RegisterAsStudent.english();
		RegisterAsStudent.sendlastName("prasad");
		RegisterAsStudent.studentRadio();
		RegisterAsStudent.registerButton();
		screenShot.captureScreenShot("Register Student test 3");
	
	}
	

}
