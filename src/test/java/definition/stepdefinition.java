package definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition {
	WebDriver driver; 
	@Given("^user is on Home page$")
	    public void user_is_on_login_page() throws Throwable {
		 System.out.println("user is on home page");
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\srika\\Downloads\\chromedriver_win32 (2)\\\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("http://zero.webappsecurity.com/index.html");
	    }

	@When("^user login to application by entering username \"([^\"]*)\" and password \"([^\"]*)\" $")
	    public void user_login_to_application_by_entering_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	    	driver.findElement(By.id("signin_button")).click();
			Thread.sleep(400);
			System.out.println(strArg1);
			driver.findElement(By.xpath("//input[@id=\"user_login\"]")).sendKeys(strArg1);
			Thread.sleep(400);
			System.out.println(strArg2);
			driver.findElement(By.xpath("//input[@id=\"user_password\"]")).sendKeys(strArg2);
			Thread.sleep(400);
			driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
	    }

	@Then("^home page is displayed$")
	    public void home_page_is_displayed() throws Throwable {
	        System.out.println("bank site openend");
	    }

	@And("^all the cards are displayed \"([^\"]*)\"$")
    public void all_the_cards_are_displayed_something(String strArg1) throws Throwable {
	    	System.out.println(strArg1);
	    }
	 @When("^user login to application by entering username (.+) and password (.+)$")
	    public void user_login_to_application_by_entering_username_and_password(String username, String password) throws Throwable {
		 driver.findElement(By.id("signin_button")).click();
			Thread.sleep(400);
			System.out.println(username);
			driver.findElement(By.xpath("//input[@id=\"user_login\"]")).sendKeys(username);
			Thread.sleep(400);
			System.out.println(password);
			driver.findElement(By.xpath("//input[@id=\"user_password\"]")).sendKeys(password);
			Thread.sleep(400);
			driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
	    }
	 

}
