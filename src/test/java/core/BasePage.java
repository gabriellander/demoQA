package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected void navigate(String url) {
        driver.get(url);
    }

    protected void click(WebElement webElement){
        webElement.click();
    }

    protected void sendKeys(WebElement webElement, String value){
        webElement.sendKeys(value);
    }

    protected String getText(WebElement webElement){
        return webElement.getText();
    }

    protected void isVisible(WebElement webElement) {
        webElement.isDisplayed();
    }
}
