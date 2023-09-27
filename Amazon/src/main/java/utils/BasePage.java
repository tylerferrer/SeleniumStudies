package utils;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import io.cucumber.java.AfterStep;

public class BasePage {

	
	@BeforeAll
	public static void OpenDriver() {
        DriverFactory.getDriver().get("file:///" + System.getProperty("user.dir") + "chromedriver.exe");

}
	
//	@AfterStep
//	public void afterStep() {
//	    
//	    takeScreenshot();
//	}
	
	@AfterAll
	public void quit() {	 
        DriverFactory.killDriver();
	}
	
}
