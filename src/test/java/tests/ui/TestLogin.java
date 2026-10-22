package tests.ui;

import constants.UITextElements;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Settings.URL_LOGIN;

public class TestLogin extends BaseTest {
    @Test(description = "Авторизация")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name = "TASK 1590622", url = "https://example.ru")
    @Link(name = "TestCase", url = "https://example.ru")
    @TmsLink("166959")
    public void testLogin() {
        Allure.step("Шаг 1", () -> basePage.open(URL_LOGIN));

        Allure.step("Шаг 2", () -> loginPage.authentication());

        Allure.step("Шаг 3", () -> adminPage.clickOnLinkWithTextInMenu(UITextElements.APPEARENCE));
    }
}
