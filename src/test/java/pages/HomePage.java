package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//h5[text()='Elements']")
    protected WebElement elements;

    @FindBy(how = How.XPATH, using = "//h5[text()='Forms']")
    protected WebElement forms;

    @FindBy(how = How.XPATH, using = "//h5[text()='Alerts, Frame & Windows']")
    protected WebElement alerts;

    @FindBy(how = How.XPATH, using = "//h5[text()='Widgets']")
    protected WebElement widgets;

    @FindBy(how = How.XPATH, using = "//h5[text()='Interactions']")
    protected WebElement interactions;

    @FindBy(how = How.XPATH, using = "//h5[text()='Book Store Application']")
    protected WebElement bookStore;


    public void chooseElements(String url){
        navigate(url);
        click(elements);
    }




}
