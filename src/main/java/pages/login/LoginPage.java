package pages.login;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static constants.Settings.LOGIN;
import static constants.Settings.PASSWORD;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driverChrome) {
        super(driverChrome);
    }

    private final By loginInput = By.name("username");
    private final By passwordInput = By.name("password");
    private final By loginButton = By.name("login");

    /**
     * Залогиниться в админке.
     */
    public void authentication() {
        Allure.step("Залогиниться в админке", () -> {
            driverChrome.findElement(loginInput).click();
            driverChrome.findElement(loginInput).sendKeys(LOGIN);
            driverChrome.findElement(passwordInput).click();
            driverChrome.findElement(passwordInput).sendKeys(PASSWORD);
            driverChrome.findElement(loginButton).click();
        });
    }
}
