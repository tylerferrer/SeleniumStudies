package utils;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BasePage {

	
	@BeforeAll
	public static void OpenDriver() {
        DriverFactory.getDriver().get("file:///" + System.getProperty("user.dir") + "chromedriver.exe");

}
	@AfterAll
	public void quit() {	 
        DriverFactory.killDriver();
	}
	
}
