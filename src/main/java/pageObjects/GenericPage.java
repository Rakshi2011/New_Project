package pageObjects;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.temporal.WeekFields;

public class GenericPage {
    public static WebDriver driver;
 public GenericPage() {
 }




    public void loginToApplication(String appName) {
        switch (appName) {
            case "Flipkart":
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
                driver.manage().window().maximize();
                //TODO hardcoded value to be removed
                driver.get("https://www.flipkart.com/");
                //TODO user name and password if required
                break;
            case "Amazon":
                driver.get("https://www.amazon.in/");
                break;
        }
    }

    public void verifyPageTitle(String expectedTitle) {
        Assert.assertEquals("Page Title not matched\n Actual Title: "+GenericPage.driver.getTitle()+"\n " +
                        "Expected Title: Mobile Phones Online at Best Prices in India", "Mobile Phones Online at Best Prices in India",
                        GenericPage.driver.getTitle());
    }
}
