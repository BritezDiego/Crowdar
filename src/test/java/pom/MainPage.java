package pom;

import org.openqa.selenium.By;


public class MainPage {

    By addToCart = By.id("add-to-cart-sauce-labs-backpack");
    By shoppingCart = By.id("shopping_cart_container");
    By headerContaineer = By.id("header_container");
    By errorMessage = By.cssSelector("[data-test='error']");
    By removeFromCart = By.id("remove-sauce-labs-backpack");





    public By getHeaderContaineer() {
        return headerContaineer;
    }
    public By getErrorMessage() {
        return errorMessage;
    }

    public By getAddToCart (){
        return addToCart;
    }

    public By getShoppingCart (){
        return shoppingCart;
    }

    public By getRemoveFromCart(){
        return removeFromCart;
    }



}