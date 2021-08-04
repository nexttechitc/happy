package SepDefffff;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdepppp {
	WebDriver driver;
	@Given("^LAUNCH FB URL$")
	public void LAUNCH_FB_URL() throws Throwable {
		//Setup Browser
		System.setProperty( "webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
	driver = new ChromeDriver();
		
		//launch URL
		driver.get("https://www.facebook.com/");
		//Maximize Window
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@Then("^ENTER INVlid USER AND PASSWORD$")
	public void enter_INVlid_USER_AND_PASSWORD() throws Throwable {
		Thread.sleep(5000);
	driver.findElement(By.id("email")).sendKeys("hjkhjhjkhk");
	driver.findElement(By.id("pass")).sendKeys("678676789");
	}

	@Then("^CLICK ON LOGIN$")
	public void click_ON_LOGIN() throws Throwable {
		Thread.sleep(5000);
	    driver.findElement(By.name("login")).click();
	}

	@Then("^VERIFY USER SHOULD NOT LOGIN$")
	public void verify_USER_SHOULD_NOT_LOGIN() throws Throwable {
	    boolean errormessage =driver.findElement(By.xpath("//h2[@class=\"uiHeaderTitle\"]")).isDisplayed();
	    Assert.assertTrue(errormessage);
	    
	    Thread.sleep(5000);
	    driver.close();
	}
	@Then("^Verify FB logo$")
	public void Verify_FB_logo() throws Throwable {
	    boolean logo = driver.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc."
	    		+ "php/y8/r/dF5SId3UHWd.svg']")).isDisplayed();
	    Assert.assertTrue(logo);
	}
	@Then("^text under logo$")
	public void text_under_logo() throws Throwable {
		boolean textlogo=  driver.findElement(By.xpath("//h2[text()='Connect with friends "
	    		+ "and the world around you on Facebook.']")).isDisplayed();
		Assert.assertTrue(textlogo);
		
		driver.close();
	}




}
