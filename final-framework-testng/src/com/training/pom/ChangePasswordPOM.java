package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordPOM {
private WebDriver driver; 
	
	public ChangePasswordPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Edit profile")
	private WebElement EditProfile; 
	
	@FindBy(id="profile_password0")
	private WebElement password1;
	
	@FindBy(xpath="(//input[starts-with(@class,'form')])[3]")
	private WebElement newPassword;
	
	@FindBy(xpath="//input[@name = 'password2']")
	private WebElement confirmPassword;
	
	@FindBy(xpath="//button[@type = 'submit']")
	private WebElement saveSettings; 
	
	public void clickEditProfile() {
		this.EditProfile.click(); 
	}
	
	public void sendPassword(String password1) {
		this.password1.clear(); 
		this.password1.sendKeys(password1); 
	}
	public void sendnewPassword(String newPassword) {
		this.newPassword.clear(); 
		this.newPassword.sendKeys(newPassword); 
	}
	public void confirmPassword(String confirmPassword) {
		this.confirmPassword.clear(); 
		this.confirmPassword.sendKeys(confirmPassword); 
	}
	public void clicksaveSettings() {
		this.saveSettings.click(); 
	}
}
