package seleniumgluecode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    private static ChromeDriver driver;

    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
//        driver.manage().window().maximize();
//        WebElement email = driver.findElement(By.id("user-name"));
//        WebElement password = driver.findElement(By.id("password"));
//        email.click();
//        email.sendKeys("standard_user");
//        password.click();
//        password.sendKeys("secret_sauce");
//        WebElement login = driver.findElement(By.id("login-button"));
//        login.click();

    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()) {
            try {
                TakesScreenshot ts = (TakesScreenshot) driver;
                byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "screenshot");
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

//        driver.quit();
    }

    public static ChromeDriver getDriver(){
        return driver;
    }

}
