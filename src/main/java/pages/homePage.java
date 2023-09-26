package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
    private WebDriver driver;

    @FindBy(id = "nav-search")
    private WebElement searchBar;

    @FindBy(css = "#nav-link-accountList-nav-line-1")
    private WebElement helloSignInText;

    public homePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get("https://www.amazon.com/");
    }

    public boolean isHelloSignInTextDisplayed() {
        return helloSignInText.isDisplayed();
    }

    public void clickSearchBar() {
        searchBar.click();
    }
}