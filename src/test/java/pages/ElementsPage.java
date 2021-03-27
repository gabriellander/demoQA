package pages;

import core.BasePage;
import io.cucumber.plugin.event.Node;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ElementsPage extends BasePage {

    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//span[text()='Text Box']")
    protected WebElement textBox;

    @FindBy(how = How.XPATH, using = "//span[text()='Check Box']")
    protected WebElement checkBox;

    public void clickTextBox(){
        click(textBox);
    }

    public void clickCheckBox() {
        click(checkBox);
    }
}
