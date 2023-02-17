package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.By;

public class LoginPage {
    By email = By.id("user-name");
    By password = By.id("password");
    By login = By.id("login-button");






    public By getEmail() {
        return email;
    }

    public By getLogin() {
        return login;
    }

    public By getPassword() {
        return password;
    }
}
