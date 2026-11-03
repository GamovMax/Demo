package pages.login;

import constants.Names;
import constants.Settings;
import io.qameta.allure.Allure;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driverChrome) {
        super(driverChrome);
    }

    /**
     * Залогиниться в админке.
     */
    public void authentication() {
        Allure.step("Залогиниться в админке", () -> {
            inputInElementWithAttributeName(Names.USERNAME, Settings.LOGIN);
            inputInElementWithAttributeName(Names.PASSWORD, Settings.PASSWORD);
            clickOnElementWithAttributeName(Names.LOGIN);
        });
    }
}
