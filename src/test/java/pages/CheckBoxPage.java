package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckBoxPage extends BasePage {
    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//button[@title='Expand all']")
    protected WebElement buttonExpandAll;

    @FindBy(how = How.XPATH, using = "//span[text()='Home']")
    protected WebElement checkBoxHome;

    @FindBy(how = How.XPATH, using = "//span[text()='You have selected :']")
    protected WebElement spanYouHaveSelected;


    public void clicarCheckBox() {
        click(buttonExpandAll);
        click(checkBoxHome);
        isVisible(spanYouHaveSelected);
    }

}
