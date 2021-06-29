package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStepDefinitions {
	  WebDriver driver;
	  
	  @Given("^I want to launch the facebook in chrome browser$")
	    public void i_want_to_launch_the_facebook_in_chrome_browser() throws Throwable {
		  System.setProperty("webdriver.chrome.driver","C:\\workspace\\driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.facebook.com");
	  }
	  
	  @When("^I want to authenticate withe valid credentails$")
	    public void i_want_to_authenticate_withe_valid_credentails() throws Throwable {
		  driver.findElement(By.id("email")).sendKeys("username");
		  driver.findElement(By.id("pass")).sendKeys("password");
		  driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
	  }
	  
	  @Then("^I want to verify whether user navigated to home page or not$")
	    public void i_want_to_verify_whether_user_navigated_to_home_page_or_not() throws Throwable {
		  Assert.assertEquals(driver.getTitle(), "Home");
	    }

}