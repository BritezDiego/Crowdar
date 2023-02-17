package seleniumgluecode;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Test extends TestBase {


    //LOGIN
    @Given("The username and password are entered correctly")
    public void the_username_and_password_are_entered_correctly() {
        WebElement email = driver.findElement(loginPage.getEmail());
        WebElement password = driver.findElement(loginPage.getPassword());
        email.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
    }
    @When("Click in log in button")
    public void click_in_log_in_button() {
        WebElement login = driver.findElement(loginPage.getLogin());
        login.click();
    }
    @Then("Login successfully")
    public void login_successfully() {
        WebElement navbar = driver.findElement(mainPage.getHeaderContaineer());
        navbar.isDisplayed();
    }



    @Given("El nombre de usuario es invalido")
    public void el_nombre_de_usuario_es_invalido() {
        WebElement email = driver.findElement(loginPage.getEmail());
        email.isDisplayed();
        email.click();
        email.sendKeys("Userwrong");
        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys("secret_sauce");
    }
    @When("clickeo en el boton de login")
    public void clickeo_en_el_boton_de_login() {
        WebElement login = driver.findElement(loginPage.getLogin());
        login.click();
    }
    @Then("obtengo un mensaje de error")
    public void obtengo_un_mensaje_de_error() {
        WebElement errorMessage = driver.findElement(mainPage.getErrorMessage());
        String error = errorMessage.getText();

        Assert.assertEquals(error, "Epic sadface: Username and password do not match any user in this service");
    }
    @Given("I add a item to the shop cart")
    public void i_add_a_item_to_the_shop_cart() {
        WebElement email = driver.findElement(loginPage.getEmail());
        WebElement password = driver.findElement(loginPage.getPassword());
        WebElement login = driver.findElement(loginPage.getLogin());
        email.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        login.click();
        WebElement addElement = driver.findElement(mainPage.getAddToCart());
        addElement.isDisplayed();
    }
    @When("i click on ADD TO CART button")
    public void i_click_on_add_to_cart_button() {
        WebElement addElement = driver.findElement(mainPage.getAddToCart());
        addElement.click();
    }
    @Then("the shopping cart must show the quantity correctly")
    public void the_shopping_cart_must_show_the_quantity_correctly() {
        WebElement shoppingCart = driver.findElement(mainPage.getShoppingCart());
        String counter = shoppingCart.getText();
        int countCart = Integer.parseInt(counter);

        Assert.assertEquals(countCart, 1);
    }


    @Given("I have one item in the shopping cart")
    public void i_have_one_item_in_the_shopping_cart() {
        WebElement email = driver.findElement(loginPage.getEmail());
        WebElement password = driver.findElement(loginPage.getPassword());
        WebElement login = driver.findElement(loginPage.getLogin());
        email.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        login.click();
        WebElement addElement = driver.findElement(mainPage.getAddToCart());
        addElement.isDisplayed();
    }
    @When("i click on REMOVE button")
    public void i_click_on_remove_button() {
        WebElement addElement = driver.findElement(mainPage.getAddToCart());
        addElement.click();
        WebElement removeElement = driver.findElement(mainPage.getRemoveFromCart());
        removeElement.click();
    }
    @Then("the shopping cart must show one item less")
    public void the_shopping_cart_must_show_one_item_less() {
        WebElement shoppingCart = driver.findElement(mainPage.getShoppingCart());
        String counter = shoppingCart.getText();
        int countCart = Integer.parseInt(counter);

        Assert.assertEquals(countCart, 1);


    }



}
