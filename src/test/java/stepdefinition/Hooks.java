package stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import base.MainBase;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends MainBase{
	
	private MainBase base;
	
	@Before
	public void launchApplication() {
		System.out.println("Application is Launch");
    	System.setProperty("webdriver.chrome.driver", "C:/chromedrivernik/chromedriver.exe");
        MainBase.driver = new ChromeDriver();
	}
	
	@AfterStep
	public void takeScreenShot(Scenario scenario) {
		System.out.println("TakeScreenshot Method is Executed");
		if(scenario.isFailed()) {
			byte[] src=((TakesScreenshot)MainBase.driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "screenshot");
			
		}
		System.out.println("Scenario is not failed");
		
	}
	
	
	@After
	public void tearDown() {
		System.out.println("Closing the Browser");
		MainBase.driver.quit();
	}
	
	

}
