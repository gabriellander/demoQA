package steps;

import core.Hook;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CheckBoxPage;
import pages.ElementsPage;
import pages.HomePage;
import pages.TextBoxPage;

public class Elements {
    HomePage homePage;
    ElementsPage elementsPage;
    TextBoxPage textBoxPage;
    CheckBoxPage checkBoxPage;

    public Elements() {
        homePage = new HomePage(Hook.getDriver());
        elementsPage = new ElementsPage(Hook.getDriver());
        textBoxPage = new TextBoxPage(Hook.getDriver());
        checkBoxPage = new CheckBoxPage(Hook.getDriver());
    }

    @Dado("que estou na pagina Elements")
    public void queEstouNoTextBox() {
        homePage.chooseElements("https://demoqa.com");
    }

    @Quando("eu entro no Text Box")
    public void euPreenchoOFormulario() {
        elementsPage.clickTextBox();
        textBoxPage.preencherFormulario("username", "useremail@test.com", "current address", "permanent address");
    }

    @Entao("eu preencho o formulario")
    public void euVejoOResultadoFinal() {
        textBoxPage.validateForms();
    }

    @Quando("eu entro no Check Box")
    public void euEntroNoCheckBox() {
        elementsPage.clickCheckBox();
    }

    @Entao("eu seleciono o Check Box")
    public void euSelecionoOCheckBox() {
        checkBoxPage.clicarCheckBox();
    }
}
