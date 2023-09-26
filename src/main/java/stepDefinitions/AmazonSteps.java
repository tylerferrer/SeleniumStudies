package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.hooks;
import pages.homePage;

public class AmazonSteps extends hooks {
    private WebDriver driver;
    private homePage homePage;

    @Test
    @Given("that i open the 'amazon.com' main page")
    public void thatIOpenAmazonMainPage() {
        homePage = new homePage(driver);
        homePage.open();
    }

    @When("i see the text {string}")
    public void i_see_the_text(String string) {
        Assert.assertTrue(homePage.isHelloSignInTextDisplayed());
    }

    @Then("i click in the search bar")
    public void i_click_in_the_search_bar() {
        homePage.clickSearchBar();
    }
}