package stepdefs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import org.openqa.selenium.NoSuchElementException;
import io.cucumber.java.en.When;
public class AddToCartStepDef {
	
	WebDriver driver = Hooks.driver;
	
	@When("I click on the Product name as {string}")
	public void i_click_on_the_Product_name_as(String string) throws InterruptedException
	{
		
		Thread.sleep(2000);
		WebElement ProductName = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")); 
		ProductName.click();
		Thread.sleep(2000);
	}
	@When("I click on the Add to cart Button")
	public void i_click_on_the_Add_to_cart_Button() throws InterruptedException 
	{
		    
			WebElement addToCartButton = driver.findElement(By.xpath("//button[text()='Add to cart']"));
			addToCartButton.click();
			Thread.sleep(2000);
	}
	 
	@When("I click on Shopping cart link")
	public void i_click_on_the_shopping_cart() throws InterruptedException
	{
		WebElement shoppingcart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		shoppingcart.click();
		Thread.sleep(2000);
	}
	
	@Then("I verify the item on the cart page")
	public void i_check_on_the_cart_page() throws InterruptedException
	{
		WebElement Pagetitle = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
			String actualtitle = Pagetitle.getText();
		   String expectedtitle = "Sauce Labs Backpack";
		   Assert.assertEquals(actualtitle, expectedtitle);
		  
}
}

