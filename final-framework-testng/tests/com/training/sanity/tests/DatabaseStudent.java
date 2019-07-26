package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.bean.UserDetails;
import com.training.dao.ELearningDAO;
import com.training.generics.ScreenShot;
import com.training.pom.DatabaseStudentPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class DatabaseStudent {
	private static WebDriver driver;
	private static DatabaseStudentPOM DatabaseStudent;
	private static Properties properties;
	private static ScreenShot screenShot;
	private static String baseUrl;
	private static ELearningDAO eLearningDAO;
	private static UserDetails userDetails;
	


	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		//RegisterAsStudentPOM = new RegisterAsStudent();
		DatabaseStudent = new DatabaseStudentPOM(driver);
		eLearningDAO = new ELearningDAO();
		userDetails = new UserDetails();
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
		DatabaseStudent.clickSignUp();
		Thread.sleep(3000);
		String firstname = "arjun";
		DatabaseStudent.sendfirstName(firstname);
		String lastname = "rampal";
		DatabaseStudent.sendlastName(lastname);
		String email = "aaa@gmail.com";
		DatabaseStudent.email(email);
		String username = "arjun";
		DatabaseStudent.username(username);
		String password = "arjun";
		DatabaseStudent.password(password);
		String confirmPassword = "arjun";
		DatabaseStudent.confirmPassword(confirmPassword);
		String phone = "9999999999";
		DatabaseStudent.phone(phone);
		String language = "english";
		DatabaseStudent.language();
		DatabaseStudent.english();
		
		DatabaseStudent.studentRadio();
		DatabaseStudent.registerButton();
		screenShot.captureScreenShot("Register Student test 3");
		String firstnameDB = null;
		String lastnameDB = null;
		String emailDB = null;
		String usernameDB = null;
		String passwordDB = null;
		String confirmPasswordDB = null;
		String phoneDB = null;
		String languageDB = null;
		Iterator<UserDetails> categoryValues = eLearningDAO.getUserDetails().iterator();
		
		while (categoryValues.hasNext()) {
			userDetails = categoryValues.next();
			firstnameDB = userDetails.getFirstname();
			lastnameDB = userDetails.getLastname();
			emailDB = userDetails.getEmail();
			usernameDB = userDetails.getUsername();
			passwordDB = userDetails.getPassword();
			confirmPasswordDB = userDetails.getConfirmPassword();
			phoneDB = userDetails.getPhone();
			languageDB = userDetails.getLanguage();
			
		}
	if (firstnameDB.equalsIgnoreCase(firstname) && lastnameDB.equalsIgnoreCase(lastname) && emailDB.equalsIgnoreCase(email) && usernameDB.equalsIgnoreCase(username) && passwordDB.equalsIgnoreCase(password) && confirmPasswordDB.equalsIgnoreCase(confirmPassword) && phoneDB.equalsIgnoreCase(phone) && languageDB.equalsIgnoreCase(language)) 
		
	{
	System.out.println("Test Case Passed");
	}
	else
	{
		System.out.println("Test Case Failed");
		Assert.fail();
	}
	}
}
