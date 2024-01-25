package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginStepDef {
	
	WebDriver driver = Hooks.driver;
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	   
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String usernameVal)  throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys(usernameVal);	
		}

	@When("I enter password as {string}")
	public void i_enter_password_as(String passwordval) throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(passwordval);
	}

	@When("I click on Login button")
	public void i_click_on_Login_button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginBtn.click();
	}

	@Then("I should land to the home page")
	public void i_should_land_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		String homepagetitle = driver.getTitle();	
		System.out.println(homepagetitle);
		   String expectedtitle = "Swag Labs";
		   Assert.assertEquals(homepagetitle, expectedtitle);
		   System.out.println(expectedtitle);
		  System.out.println("Login done");
		  
		 
		
	}
	 
	@Then("I should get the error message as {string}")
	public void i_should_get_the_error_message_as(String expectedError)throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		WebElement error = driver.findElement(By.xpath("//*[@data-test='error']"));
		Thread.sleep(3000);
		String actualError = error.getText();
		Assert.assertEquals(expectedError, actualError);
		

	}

	
}


	



