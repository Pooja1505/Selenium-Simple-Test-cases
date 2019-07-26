package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAssignmentsPOM {
private WebDriver driver; 
	
	public AddAssignmentsPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Selenium")
	private WebElement Selenium; 
	
	@FindBy(xpath="//img[@alt='Assignments']")
	private WebElement AssignmentsIcon;
	
	@FindBy(xpath="//img[@alt='Create assignment']")
	private WebElement CreateAssignment;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement AssignmentName;
	
	@FindBy(xpath="//iframe[contains(@class,'cke_wysiwyg_frame')]")
	private WebElement myFrame;
	
	@FindBy(xpath="//body[@spellcheck='false']")
	private WebElement Description;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement AdvancedSettings;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement MaximumScore;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Validate;
	
	@FindBy(xpath="(//input[@type='checkbox'])[6]")
	private WebElement Checkbox;
	
	@FindBy(xpath="//img[@alt='Selenium']")
	private WebElement Selenium1;
	
	@FindBy(xpath="//img[@alt='Settings']")
	private WebElement Settings;
	
	@FindBy(xpath="(//a[@class='collapsed'])[10]")
	private WebElement AssignmentSettings;
	
	@FindBy(name="student_delete_own_publication")
	private WebElement AllowLearners;
	
	@FindBy(xpath="(//button[@name='submit_save'])[11]")
	private WebElement SaveSettings;
	
	
	public void clickSelenium() {
		this.Selenium.click(); 
	}
	
	public void clickAssignmentsIcon() {
		this.AssignmentsIcon.click(); 
	}
	public void clickCreateAssignment() {
		this.CreateAssignment.click(); 
	}
	public void sendAssignmentName(String AssignmentName) {
		this.AssignmentName.clear();
		this.AssignmentName.sendKeys(AssignmentName);
	}
	public void sendDescription(String Description) {
		driver.switchTo().frame(myFrame);
		this.Description.clear();
		this.Description.sendKeys(Description);
		driver.switchTo().defaultContent();
	}
	public void clickAdvancedSettings() {
		this.AdvancedSettings.click(); 
	}
	public void sendMaximumScore(String MaximumScore) {
		this.MaximumScore.clear();
		this.MaximumScore.sendKeys(MaximumScore);
	}
	public void clickValidate() {
		this.Validate.click(); 
	}
	public void clickCheckbox() {
		this.Checkbox.click(); 
	}
	public void clickSelenium1() {
		this.Selenium1.click(); 
	}
	public void clickSettings() {
		this.Settings.click(); 
	}
	public void clickAssignmentSettings() {
		this.AssignmentSettings.click(); 
	}
	public void clickAllowLearners() {
		this.AllowLearners.click(); 
	}
	public void clickSaveSettings() {
		this.SaveSettings.click(); 
	}
}

