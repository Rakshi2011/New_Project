package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    public HomePage() {

    }

    public By getPageLocator (String pageName) {
        return By.xpath("//a[text()='"+pageName+"'] | //span[text()='"+pageName+"']");
    }







    public void openPage(String pageName) throws InterruptedException {
        GenericPage.driver.findElement(getPageLocator(pageName)).click();
        Thread.sleep(1000);
    }
}
