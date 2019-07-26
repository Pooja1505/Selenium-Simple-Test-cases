package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RegistrationError {
	private static WebDriver driver;
	private static Properties properties;
	private static ScreenShot screenShot;
	private static String baseUrl;
	private static RegistrationError registrationError;
	ApachePOIExcelRead aa ;
	


	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		//RegisterAsStudentPOM = new RegisterAsStudent();
		registrationError = new RegistrationError();
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		//driver.get(baseUrl);
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
	public void signUp() throws InterruptedException {
		aa = new ApachePOIExcelRead();
		String [][] as = aa.getExcelContent("C:\\01 TD Bank\\01 TD Bank\\Selenium\\Complex cases data.xlsx");
		for (int i = 8; i < as.length; i++) {
			driver.navigate().to(baseUrl);
			driver.findElement(By.partialLinkText("up!")).click();
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(as[i][2]);
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(as[i][3]);
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(as[i][4]);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(as[i][5]);
			driver.findElement(By.xpath("//input[@id='pass1']")).sendKeys(as[i][6]);
			driver.findElement(By.xpath("//input[@id='pass2']")).sendKeys(as[i][7]);
			driver.findElement(By.id("registration_phone")).sendKeys(as[i][8]);
			//driver.findElement(By.xpath("//div[contains(@class,'inner-inner')]")).sendKeys(as[i][9]);
			driver.findElement(By.xpath("//p[@class = 'caption']")).click();
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			screenShot.captureScreenShot("Registration Error"+i);
			
			if (i == 11) {
				break;
			}
		}
		
	}
	

		  	
	  
}
