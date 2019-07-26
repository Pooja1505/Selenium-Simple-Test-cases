package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTestPOM {
private WebDriver driver; 
	
	public CreateTestPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Selenium")
	private WebElement Selenium; 
	
	@FindBy(xpath="//img[@alt='Tests']")
	private WebElement TestsIcon;
	
	//@FindBy(xpath="(//a[contains(@class,'btn')])[2]")
	//private WebElement CreateNewTest;
	
	@FindBy(xpath="//img[@alt='Create a new test']")
	private WebElement CreateNewTest;
	
	
	@FindBy(name="exerciseTitle")
	private WebElement TestName;
	
	@FindBy(id="advanced_params")
	private WebElement AdvancedSettings;
	
	@FindBy(xpath="//iframe[contains(@class,'cke_wysiwyg_frame')]")
	private WebElement myFrame;
	
	@FindBy(xpath="//body[@spellcheck='false']")
	private WebElement ContextTest;
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement Feedback;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement EnableStartTime;
	
	@FindBy(xpath="//p[contains(@class,'form-control')]")
	private WebElement Time;
	
	@FindBy(linkText="Next")
	private WebElement CalenderNext;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr[5]/td[7]")
	private WebElement CalenderSelect;
	
	@FindBy(xpath="//button[contains(@class,'ui-datepicker-close')]")
	private WebElement CalenderDone;
	
	@FindBy(name="pass_percentage")
	private WebElement PassPercentage;
	
	@FindBy(name="submitExercise")
	private WebElement ProceedToQ;
	
	@FindBy(xpath="//img[@title='Multiple choice']")
	private WebElement MultipleChoice;
	
	@FindBy(name="questionName")
	private WebElement Question;
	
	@FindBy(xpath="(//iframe[contains(@class,'cke_wysiwyg_frame')])[2]")
	private WebElement myFrame1;
	
	@FindBy(xpath="//body[@spellcheck='false']")
	private WebElement Option1;
	
	@FindBy(xpath="(//iframe[contains(@class,'cke_wysiwyg_frame')])[4]")
	private WebElement myFrame2;
	
	@FindBy(xpath="//body[@spellcheck='false']")
	private WebElement Option2;
	
	@FindBy(xpath="(//iframe[contains(@class,'cke_wysiwyg_frame')])[6]")
	private WebElement myFrame3;
	
	@FindBy(xpath="//body[@spellcheck='false']")
	private WebElement Option3;
	
	@FindBy(xpath="(//iframe[contains(@class,'cke_wysiwyg_frame')])[8]")
	private WebElement myFrame4;
	
	@FindBy(xpath="//body[@spellcheck='false']")
	private WebElement Option4;
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement Answer1;
	
	@FindBy(xpath="(//button[@type='submit'])[5]")
	private WebElement AddQ1;
	
	@FindBy(xpath="//img[@title='Multiple choice']")
	private WebElement MultipleChoice1;
	
	@FindBy(name="questionName")
	private WebElement Question1;
	
	@FindBy(xpath="(//iframe[contains(@class,'cke_wysiwyg_frame')])[2]")
	private WebElement myFrame5;
	
	@FindBy(xpath="//body[@spellcheck='false']")
	private WebElement Q2Option1;
	
	@FindBy(xpath="(//iframe[contains(@class,'cke_wysiwyg_frame')])[4]")
	private WebElement myFrame6;
	
	@FindBy(xpath="//body[@spellcheck='false']")
	private WebElement Q2Option2;
	
	@FindBy(xpath="(//iframe[contains(@class,'cke_wysiwyg_frame')])[6]")
	private WebElement myFrame7;
	
	@FindBy(xpath="//body[@spellcheck='false']")
	private WebElement Q2Option3;
	
	@FindBy(xpath="(//iframe[contains(@class,'cke_wysiwyg_frame')])[8]")
	private WebElement myFrame8;
	
	@FindBy(xpath="//body[@spellcheck='false']")
	private WebElement Q2Option4;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement Answer2;
	
	@FindBy(xpath="(//button[@type='submit'])[5]")
	private WebElement AddQ2;
	
	@FindBy(xpath="//img[@alt='Preview']")
	private WebElement Preview;
	
	@FindBy(linkText="Start test")
	private WebElement StartTest;
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement Q1Answer;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement NextQ;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement Q2Answer;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	private WebElement EndTest;
	
	
	public void clickSelenium() {
		this.Selenium.click(); 
	}
	
	public void clickTestsIcon() {
		this.TestsIcon.click(); 
	}
	public void clickCreateNewTest() {
		this.CreateNewTest.click(); 
	}
	
	public void sendTestName(String TestName) {
		this.TestName.clear();
		this.TestName.sendKeys(TestName);
	}
	
	public void clickAdvancedSettings() {
		this.AdvancedSettings.click(); 
	}
	public void sendContextTest(String ContextTest) {
		driver.switchTo().frame(myFrame);
		this.ContextTest.clear();
		this.ContextTest.sendKeys(ContextTest);
		driver.switchTo().defaultContent();
	}
	public void clickFeedback() {
		this.Feedback.click(); 
	}
	public void clickEnableStartTime() {
		this.EnableStartTime.click(); 
	}
	public void clickTime() {
		this.Time.click(); 
	}
	public void clickCalenderNext() {
		this.CalenderNext.click(); 
	}
	public void clickCalenderSelect() {
		this.CalenderSelect.click(); 
	}
	public void clickCalenderDone() {
		this.CalenderDone.click(); 
	}
	public void sendPassPercentage(String TestName) {
		this.PassPercentage.clear();
		this.PassPercentage.sendKeys(TestName);
	}
	public void clickProceedToQ() {
		this.ProceedToQ.click(); 
	}
	public void clickMultipleChoice() {
		this.MultipleChoice.click(); 
	}
	public void sendQuestion(String Question) {
		this.Question.clear();
		this.Question.sendKeys(Question);
	}
	public void sendOption1(String Option1) {
		driver.switchTo().frame(myFrame1);
		this.Option1.clear();
		this.Option1.sendKeys(Option1);
		driver.switchTo().defaultContent();
	}
	public void sendOption2(String Option2) {
		driver.switchTo().frame(myFrame2);
		this.Option2.clear();
		this.Option2.sendKeys(Option2);
		driver.switchTo().defaultContent();
	}
	public void sendOption3(String Option3) {
		driver.switchTo().frame(myFrame3);
		this.Option3.clear();
		this.Option3.sendKeys(Option3);
		driver.switchTo().defaultContent();
	}
	public void sendOption4(String Option4) {
		driver.switchTo().frame(myFrame4);
		this.Option4.clear();
		this.Option4.sendKeys(Option4);
		driver.switchTo().defaultContent();
	}
	public void clickAnswer1() {
		this.Answer1.click(); 
	}
	public void clickAddQ1() {
		this.AddQ1.click(); 
	}
	public void clickMultipleChoice1() {
		this.MultipleChoice1.click(); 
	}
	public void sendQuestion1(String Question1) {
		this.Question1.clear();
		this.Question1.sendKeys(Question1);
	}
	public void sendQ2Option1(String Q2Option1) {
		driver.switchTo().frame(myFrame5);
		this.Q2Option1.clear();
		this.Q2Option1.sendKeys(Q2Option1);
		driver.switchTo().defaultContent();
	}
	public void sendQ2Option2(String Q2Option2) {
		driver.switchTo().frame(myFrame6);
		this.Q2Option2.clear();
		this.Q2Option2.sendKeys(Q2Option2);
		driver.switchTo().defaultContent();
	}
	public void sendQ2Option3(String Q2Option3) {
		driver.switchTo().frame(myFrame7);
		this.Q2Option3.clear();
		this.Q2Option3.sendKeys(Q2Option3);
		driver.switchTo().defaultContent();
	}
	public void sendQ2Option4(String Q2Option4) {
		driver.switchTo().frame(myFrame8);
		this.Q2Option4.clear();
		this.Q2Option4.sendKeys(Q2Option4);
		driver.switchTo().defaultContent();
	}
	public void clickAnswer2() {
		this.Answer2.click(); 
	}
	public void clickAddQ2() {
		this.AddQ2.click(); 
	}
	public void clickPreview() {
		this.Preview.click(); 
	}
	public void clickStartTest() {
		this.StartTest.click(); 
	}
	public void clickQ1Answer() {
		this.Q1Answer.click(); 
	}
	public void clickNextQ() {
		this.NextQ.click(); 
	}
	public void clickQ2Answer() {
		this.Q2Answer.click(); 
	}
	public void clickEndTest() {
		this.EndTest.click(); 
	}
}
