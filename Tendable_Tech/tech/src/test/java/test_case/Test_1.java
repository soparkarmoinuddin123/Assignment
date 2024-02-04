package test_case;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.tendable.pageclass.Tendable_contactUs;
import com.tendable.pageclass.Tendable_home;
import com.tendable.pageclass.Tendable_ourSolution;
import com.tendable.pageclass.Tendable_ourStory;
import com.tendable.pageclass.Tendable_whyTendable;

import utility.Utility;

public class Test_1 extends Utility {

	public WebDriver driver;
	
	Tendable_home home; 
	Tendable_ourStory story;
	Tendable_ourSolution soln;
	Tendable_whyTendable why;
	Tendable_contactUs contact;

	@BeforeSuite
	public void setup() {
		driver = setUp("chrome", "https://www.tendable.com");	// initialisation of browser and url
		
//	initialisation of idividual webpage's driver
		home = new Tendable_home(driver);		
		story = new Tendable_ourStory(driver);
		soln = new Tendable_ourSolution(driver);
		why = new Tendable_whyTendable(driver);
		contact = new Tendable_contactUs(driver);
	}

	@Test(priority = 1)
	public void accessibility() {
		Assert.assertTrue(home.visiblityOfTandable_Logo());	
		Assert.assertTrue(home.visiblityOfOur_Story());
		Assert.assertTrue(home.visiblityOfOur_Solution());
		Assert.assertTrue(home.visiblityOfWhy_Tendable());
	}

	@Test(priority = 2)
	public void aformationORequestDemo() {
		Assert.assertTrue(home.varify_requestDemo());
		Assert.assertTrue(story.varify_requestDemo());
		Assert.assertTrue(soln.varify_requestDemo());
		Assert.assertTrue(why.varify_requestDemo());
	}

	@Test(priority = 3)
	public void formSubmission() {
		contact.directedToForm();
		contact.formSubmittion();
		contact.verifyErrorMessage();
	}

	@AfterSuite
	public void tearDown() {
		driver.close();
	}
}
