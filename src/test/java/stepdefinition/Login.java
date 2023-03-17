package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import base.MainBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends MainBase {
	public WebDriver driver;
	private MainBase base;
	
	
	@Given("Landed on landing page")
	public void landed_on_landing_page() {
//    	System.setProperty("webdriver.chrome.driver", "C:/chromedrivernik/chromedriver.exe");
//        driver = new ChromeDriver();
		  MainBase.driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/");

	}

	@When("Enter username and password")
	public void enter_username_and_password() {
		System.out.println("Enter username and password");
	    MainBase.driver.findElement(By.id("username")).sendKeys("Nikhil");
	    MainBase.driver.findElement(By.id("password")).sendKeys("learning");
	}

	@When("click on login button")
	public void click_on_login_button() {
		System.out.println("click on login button");
		MainBase.driver.findElement(By.id("terms")).click();
	   MainBase.driver.findElement(By.id("signInBtn")).click();
	}

	@Then("landed on home page")
	public void landed_on_home_page() {
	  System.out.println("I am on Landing Page");
	}

	

}
