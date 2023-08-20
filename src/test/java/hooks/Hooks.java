package hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;

public class Hooks {

    @Before
    public void createDriver(){
        WebDriverManager.chromedriver().setup();
       WebDriver driver = WebDriverManager.chromedriver().create();
        BasePage.setDriver(driver);
    }

    @After
    public void quiteDriver(){
        BasePage.getDriver().quit();
    }
}
