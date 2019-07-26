package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCoursePOM {
private WebDriver driver; 
	
	public CreateCoursePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create a course")
	private WebElement Createcourse; 
	
	@FindBy(id="title")
	private WebElement courseName;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement Advancedsettings; 
	
	@FindBy(xpath="//div[@class= 'filter-option-inner-inner']")
	private WebElement Category; 
	
	@FindBy(xpath="(//span[@class= 'text'])[4]")
	private WebElement SelectProjects;
	
	@FindBy(xpath="//input[@name= 'wanted_code']")
	private WebElement CourseCode;
	
	@FindBy(xpath="(//div[@class= 'filter-option-inner-inner'])[2]")
	private WebElement Language;
	
	@FindBy(linkText="English")
	private WebElement SelectLang;
	
	@FindBy(id="add_course_submit")
	private WebElement CreateCourseBtn;
	
	@FindBy(xpath="(//em[starts-with(@class,'fa')])[5]")
	private WebElement AddIntro;
	
	@FindBy(xpath="//iframe[contains(@class,'cke_wysiwyg_frame')]")
	private WebElement myFrame;
	
	@FindBy(xpath="//body[@spellcheck='false']")
	private WebElement Textbox;

	@FindBy(name="intro_cmdUpdate")
	private WebElement SaveIntroTxt;
	
	@FindBy(linkText="Course description")
	private WebElement CourseDescription;
	
	@FindBy(xpath="//img[@alt='Description']")
	private WebElement Description;
	
	@FindBy(name="title")
	private WebElement Title;
	
	@FindBy(xpath="//iframe[contains(@class,'cke_wysiwyg_frame')]")
	private WebElement myFrame1;
	
	@FindBy(xpath="//body[@spellcheck='false']")
	private WebElement Content;
	
	@FindBy(name="submit")
	private WebElement Submit;
	
	@FindBy(xpath="//img[@alt='Objectives']")
	private WebElement Objectives;
	
	@FindBy(name="title")
	private WebElement ObjTitle;
	
	@FindBy(xpath="//iframe[contains(@class,'cke_wysiwyg_frame')]")
	private WebElement myFrame2;
	
	@FindBy(xpath="//body[@spellcheck='false']")
	private WebElement ObjContent;
	
	@FindBy(name="submit")
	private WebElement ObjSubmit;
	
	@FindBy(xpath="//img[@title='Topics']")
	private WebElement Topics;
	
	@FindBy(name="title")
	private WebElement TopicTitle;
	
	@FindBy(xpath="//iframe[contains(@class,'cke_wysiwyg_frame')]")
	private WebElement myFrame3;
	
	@FindBy(xpath="//body[@spellcheck='false']")
	private WebElement TopicContent;
	
	@FindBy(name="submit")
	private WebElement TopicSubmit;
	
	public void clickCreatecourse() {
		this.Createcourse.click(); 
	}
	
	public void sendcourseName(String courseName) {
		this.courseName.clear();
		this.courseName.sendKeys(courseName);
	}
	
	public void clickAdvancedsettings() {
		this.Advancedsettings.click(); 
	}
	public void clickCategory() {
		this.Category.click(); 
	}
	public void clickSelectProjects() {
		this.SelectProjects.click(); 
	}
	public void sendCourseCode(String CourseCode) {
		this.CourseCode.clear();
		this.CourseCode.sendKeys(CourseCode);
	}
	public void clickLanguage() {
		this.Language.click(); 
	}
	public void clickSelectLang() {
		this.SelectLang.click(); 
	}
	public void clickCreateCourseBtn() {
		this.CreateCourseBtn.click(); 
	}
	public void clickAddIntro() {
		this.AddIntro.click(); 
	}
	public void sendTextbox(String Textbox) {
		driver.switchTo().frame(myFrame);
		this.Textbox.clear();
		this.Textbox.sendKeys(Textbox);
		driver.switchTo().defaultContent();
	}
	public void clickSaveIntroTxt() {
		this.SaveIntroTxt.click(); 
	}
	public void clickCourseDescription() {
		this.CourseDescription.click(); 
	}
	public void clickDescription() {
		this.Description.click(); 
	}
	public void sendTitle(String Title) {
		this.Title.clear();
		this.Title.sendKeys(Title);
	}
	public void sendContent(String Content) {
		driver.switchTo().frame(myFrame1);
		this.Content.clear();
		this.Content.sendKeys(Content);
		driver.switchTo().defaultContent();
	}
	public void clickSubmit() {
		this.Submit.click(); 
	}
	public void clickObjectives() {
		this.Objectives.click(); 
	}
	public void sendObjTitle(String ObjTitle) {
		this.ObjTitle.clear();
		this.ObjTitle.sendKeys(ObjTitle);
	}
	public void sendObjContent(String ObjContent) {
		driver.switchTo().frame(myFrame2);
		this.ObjContent.clear();
		this.ObjContent.sendKeys(ObjContent);
		driver.switchTo().defaultContent();
	}
	public void clickObjSubmit() {
		this.ObjSubmit.click(); 
	}
	public void clickTopics() {
		this.Topics.click(); 
	}
	public void sendTopicTitle(String TopicTitle) {
		this.TopicTitle.clear();
		this.TopicTitle.sendKeys(TopicTitle);
	}
	public void sendTopicContent(String TopicContent) {
		driver.switchTo().frame(myFrame3);
		this.TopicContent.clear();
		this.TopicContent.sendKeys(TopicContent);
		driver.switchTo().defaultContent();
	}
	public void clickTopicSubmit() {
		this.TopicSubmit.click(); 
	}
}
