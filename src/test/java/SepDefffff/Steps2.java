package SepDefffff;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Steps2 {
	
	WebDriver driver;
	
	
	
	
	@Then("^Verify fogate password text$")
	public void verify_fogate_password_text() throws Throwable {
	    boolean forgatepass = driver.findElement(By.xpath("//a[text()='Forgot Password?']")).isDisplayed();
	    
	    Assert.assertTrue(forgatepass);
		
	    
	    Thread.sleep(5000);
	    
	   
	}

}
