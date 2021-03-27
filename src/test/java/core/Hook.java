package core;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Hook {
    static WebDriver driver;
    Scenario scenario;

    @Before
    public void before(Scenario scenario){
        // JOGAR SCENARIO.GETID NA VARIAVEL DO SHARED CONTEXT
        this.scenario = scenario;
        System.out.println(scenario.getId());
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "driver" + File.separator + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void after() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
