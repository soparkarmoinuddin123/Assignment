package com.tendable.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Utility;

public class Tendable_home extends Utility {

	public WebDriver driver;

//initialisation of locators
	public Tendable_home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//locators from home page
	@FindBy(xpath = "//a[@class='logo']")
	private WebElement tandable_Logo;

	@FindBy(xpath = "//a[text()='Our Story']")
	private WebElement our_Story;

	@FindBy(xpath = "//a[text()='Our Solution']")
	private WebElement our_Solution;

	@FindBy(xpath = "//a[text()='Why Tendable?']")
	private WebElement why_Tendable;

	@FindBy(xpath = "(//a[@class='button'])[2]")
	private WebElement request_Demo;

	
//	Verifying all top menu options
	public boolean visiblityOfTandable_Logo() {
		return verifyUIElementDisplayed(tandable_Logo);		// action method for varifying logo
	}

	public boolean visiblityOfOur_Story() {
		return verifyUIElementDisplayed(our_Story);		// action method for varifying element
	}

	public boolean visiblityOfOur_Solution() {
		return verifyUIElementDisplayed(our_Solution);
	}

	public boolean visiblityOfWhy_Tendable() {
		return verifyUIElementDisplayed(why_Tendable);
	}

//	verifying the request demo button
	public boolean varify_requestDemo() {
		return (verifyUIElementDisplayed(request_Demo) && verifyUIElementEnabled(request_Demo));
	}
}
