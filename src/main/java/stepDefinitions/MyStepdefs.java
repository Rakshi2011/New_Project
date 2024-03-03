package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.GenericPage;
import pageObjects.HomePage;
import pageObjects.MobilePage;

public class MyStepdefs {
    private GenericPage genericPage;
    private HomePage homePage;
    private MobilePage mobilePage;

    public MyStepdefs() {
        genericPage = new GenericPage();
        homePage = new HomePage();
        mobilePage = new MobilePage();
    }

   @Given("^Login to \"([^\"]*)\" Application$")
    public void loginToApplication(String appName)  {
        genericPage.loginToApplication(appName);
    }

    @When("User open {string} page")
    public void userOpenPage(String pageName) throws InterruptedException {
        homePage.openPage(pageName);
    }

    @Then("User validates page title as {string}")
    public void userValidatesPageTitleAs(String expectedTitle) {
        genericPage.verifyPageTitle(expectedTitle);
    }


    @When("User close the Browser")
    public void userCloseTheBrowser() {
       GenericPage.driver.quit();
    }

    @Then("User click on {string}")
    public void userClickOn(String value) {
        genericPage.clickOnPage(value);
    }
}
