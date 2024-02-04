package com.tendable.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Utility;

public class Tendable_ourStory extends Utility {

	public WebDriver driver;

	public Tendable_ourStory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

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
	
//	verifying the request demo button
	public boolean varify_requestDemo() {
		clickOnElement(our_Story);
		return (verifyUIElementDisplayed(request_Demo) && verifyUIElementEnabled(request_Demo));
	}
}
