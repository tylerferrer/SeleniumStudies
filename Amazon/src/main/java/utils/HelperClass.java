package utils;

import org.openqa.selenium.By;


public class HelperClass {

	
//	textField
	
	public void write(String id_campo, String texto) {
		DriverFactory.getDriver().findElement(By.id(id_campo)).sendKeys(texto);
	}
}
