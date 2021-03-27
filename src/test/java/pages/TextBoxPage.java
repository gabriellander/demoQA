package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TextBoxPage extends BasePage {
    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//input[@id='userName']")
    protected WebElement inputUserName;

    @FindBy(how = How.XPATH, using = "//input[@id='userEmail']")
    protected WebElement inputUserEmail;

    @FindBy(how = How.XPATH, using = "//textArea[@id='currentAddress']")
    protected WebElement inputCurrentAddress;

    @FindBy(how = How.XPATH, using = "//textArea[@id='permanentAddress']")
    protected WebElement inputPermanentAddress;

    @FindBy(how = How.XPATH, using = "//button[@id='submit']")
    protected WebElement buttonSubmit;

    @FindBy(how = How.XPATH, using = "//p[@id='name']")
    protected WebElement pName;

    @FindBy(how = How.XPATH, using = "//p[@id='email']")
    protected WebElement pEmail;

    @FindBy(how = How.XPATH, using = "//p[@id='currentAddress']")
    protected WebElement pCurrentAddress;

    @FindBy(how = How.XPATH, using = "//p[@id='permanentAddress']")
    protected WebElement pPermanentAddress;

    public void preencherFormulario(String userName, String userEmail, String currentAddress, String permanentAddress){
        sendKeys(inputUserName, userName);
        sendKeys(inputUserEmail, userEmail);
        sendKeys(inputCurrentAddress, currentAddress);
        sendKeys(inputPermanentAddress, permanentAddress);
        click(buttonSubmit);
    }

    public void validateForms(){
        isVisible(pName);
        isVisible(pEmail);
        isVisible(pCurrentAddress);
        isVisible(pPermanentAddress);
    }





}
