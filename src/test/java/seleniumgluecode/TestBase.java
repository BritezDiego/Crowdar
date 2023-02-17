package seleniumgluecode;

import org.openqa.selenium.chrome.ChromeDriver;
import pom.*;

public class TestBase {

    protected ChromeDriver driver = Hooks.getDriver();

    protected LoginPage loginPage = new LoginPage();
    protected MainPage mainPage = new MainPage();

}
