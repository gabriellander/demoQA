package steps;

import core.Hook;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.ElementsPage;
import pages.HomePage;
import pages.TextBoxPage;

public class Elements {
    HomePage homePage;
    ElementsPage elementsPage;
    TextBoxPage textBoxPage;

    public Elements() {
        homePage = new HomePage(Hook.getDriver());
        elementsPage = new ElementsPage(Hook.getDriver());
        textBoxPage = new TextBoxPage(Hook.getDriver());
    }

    @Dado("que estou no text box")
    public void queEstouNoTextBox() {
        homePage.enterWebSite("https://demoqa.com");
        homePage.chooseElements();
        elementsPage.clickTextBox();
    }

    @Quando("eu preencho o formulario")
    public void euPreenchoOFormulario() {
        textBoxPage.preencherFormulario("username", "useremail@test.com", "current address", "permanent address");
    }

    @Entao("eu vejo o resultado final")
    public void euVejoOResultadoFinal() {
        textBoxPage.validateForms();
    }
}
