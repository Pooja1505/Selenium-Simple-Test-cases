package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterAsStudentPOM {
private WebDriver driver; 
	
	public RegisterAsStudentPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText="up!")
	private WebElement Signup;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement firstName; 
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email; 
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='pass1']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='pass2']")
	private WebElement confirmPassword;
	
	@FindBy(xpath="(//input[@size='20'])[3]")
	private WebElement phone;
	
	@FindBy(xpath="//div[contains(@class,'inner-inner')]")
	private WebElement language;

	@FindBy(xpath="(//span[@class='text'])[6]")
	private WebElement english;
	
	@FindBy(xpath="//p[@class = 'caption']")
	private WebElement studentRadio;
	
	@FindBy(id="registration_submit")
	private WebElement registerButton;
	
	public void clickSignUp() {
		this.Signup.click(); 
	}
	
	public void sendfirstName(String firstname) {
		this.firstName.clear();
		this.firstName.sendKeys(firstname);
	}
	
	public void sendlastName(String lastname) {
		this.lastName.clear(); 
		this.lastName.sendKeys(lastname); 
	}
	
	public void email(String Email) {
		this.email.clear(); 
		this.email.sendKeys(Email);
	}
	public void username(String Username) {
		this.username.clear(); 
		this.username.sendKeys(Username);
	}
	public void password(String Password) {
		this.password.clear(); 
		this.password.sendKeys(Password);
	}
	public void confirmPassword(String ConfirmPassword) {
		this.confirmPassword.clear(); 
		this.confirmPassword.sendKeys(ConfirmPassword);
	}
	public void phone(String Phone) {
		this.phone.clear(); 
		this.phone.sendKeys(Phone);
	}
	public void language() {
		this.language.click(); 
	}
	public void english() {
		this.english.click(); 
	}
	public void studentRadio() {
		this.studentRadio.click(); 
	}
	public void registerButton() {
		this.registerButton.click(); 
	}
}
