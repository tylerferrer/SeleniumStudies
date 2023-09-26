package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BasePage {

	
	@Before
	public static void OpenDriver() {
        DriverFactory.getDriver().get("file:///" + System.getProperty("user.dir") + "chromedriver.exe");

}
	@After
	public void quit() {	 
        DriverFactory.killDriver();
	}
	
}