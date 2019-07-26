package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAssessmentPOM {
private WebDriver driver; 
	
	public AddAssessmentPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Selenium")
	private WebElement Selenium; 
	
	@FindBy(xpath="//img[@alt='Assessments']")
	private WebElement AssessmentsIcon;
	
	@FindBy(xpath="//img[@title='Add online activity']")
	private WebElement AddOnineActivity;
	
	@FindBy(xpath="//div[@class='filter-option-inner-inner']")
	private WebElement ChooseTypeOfActivity;
	
	@FindBy(xpath="(//span[@class='text'])[2]")
	private WebElement Tests;
	
	@FindBy(xpath="(//div[@class='filter-option-inner-inner'])[2]")
	private WebElement ChooseActivity;
	
	@FindBy(xpath="(//span[@class='text'])[8]")
	private WebElement Activity;
	
	@FindBy(xpath="//input[@type='float']")
	private WebElement Weight;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement AddActivity;
	
	@FindBy(xpath="(//img[@alt='Edit'])[3]")
	private WebElement Edit;
	
	@FindBy(name="visible")
	private WebElement Visible;
	
	
	@FindBy(xpath="(//button[@type='submit'])")
	private WebElement EditLink;
	
	@FindBy(xpath="//img[@alt='Attach certificate']")
	private WebElement Certificate;
	
	
	public void clickSelenium() {
		this.Selenium.click(); 
	}
	
	public void clickAssessmentsIcon() {
		this.AssessmentsIcon.click(); 
	}
	public void clickAddOnineActivity() {
		this.AddOnineActivity.click(); 
	}
	public void clickChooseTypeOfActivity() {
		this.ChooseTypeOfActivity.click(); 
	}
	public void clickTests() {
		this.Tests.click(); 
	}
	public void clickChooseActivity() {
		this.ChooseActivity.click(); 
	}
	public void clickActivity() {
		this.Activity.click(); 
	}
	public void sendWeight(String Weight) {
		this.Weight.clear();
		this.Weight.sendKeys(Weight);
	}
	public void clickAddActivity() {
		this.AddActivity.click(); 
	}
	public void clickEdit() {
		this.Edit.click(); 
	}
	public void Visible() {
		this.Visible.isSelected(); 
		System.out.println("The visible checkbox is selected");
	}
	
	public void clickEditLink() {
		this.EditLink.click(); 
	}
	public void clickCertificate() {
		this.Certificate.click(); 
	}
}
