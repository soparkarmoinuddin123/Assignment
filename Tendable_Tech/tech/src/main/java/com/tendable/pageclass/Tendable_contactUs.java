package com.tendable.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Utility;

public class Tendable_contactUs extends Utility {

	public WebDriver driver;

	public Tendable_contactUs(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contact_Us;

	@FindBy(xpath = "//button[text()='Contact']")
	private WebElement contact_Btn;

	@FindBy(xpath = "(//input[@name='fullName'])[1]")
	private WebElement fullName_Input;

	@FindBy(xpath = "(//input[@name='organisationName'])[1]")
	private WebElement orgName_Input;

	@FindBy(xpath = "(//input[@name='cellPhone'])[1]")
	private WebElement cellPhone_Input;

	@FindBy(xpath = "(//input[@name='email'])[1]")
	private WebElement email_Input;

	@FindBy(xpath = "(//select[@name='jobRole'])[1]")
	private WebElement jobRole_List;

	@FindBy(xpath = "(//textarea[@name='message'])[1]")
	private WebElement message_Input;

	@FindBy(xpath = "(//input[@name='consentAgreed'])[1]")
	private WebElement radio_Button;

	@FindBy(xpath = "(//button[@name='form_page_submit'])[1]")
	private WebElement submit_Button;

	@FindBy(xpath = "//div[@class='ff-form-errors']/p")
	private WebElement error_Msg;

	@FindBy(xpath = "(//button[@name='form_page_submit'])[1]")
	private WebElement scroll;

	public void directedToForm() {
//		Navigate to form 
		clickOnElement(contact_Us);			//click on contact us button
		clickOnElement(contact_Btn);		// click on marketing option
	}

	public void formSubmittion() {
//		Entering details in form 
		typeInput(fullName_Input, "ABC");			
		typeInput(orgName_Input, "EFG");				
		typeInput(cellPhone_Input, "0987654321");	
		typeInput(email_Input, "abc.xyz@gmail.com");
		clickOnElement(jobRole_List);
		selectOption(jobRole_List, "CNO");
		clickOnElement(radio_Button);
		pageScroll(scroll);
		clickOnElement(submit_Button);
	}

	public void verifyErrorMessage() {
//		Verifying the error message
		verifyUIElementDisplayed(error_Msg);
	}
}
