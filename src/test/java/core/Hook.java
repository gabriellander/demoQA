package core;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Hook {
    static WebDriver driver;

    @Before
    public void before(){
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
