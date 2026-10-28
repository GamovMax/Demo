package tests.ui;


import io.qameta.allure.*;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Settings.URL_CLIENT;

public class TestCreateAccount extends BaseTest {

    @Test(description = "Создать аккаунт")
    @Severity(SeverityLevel.CRITICAL)
    @Link(name = "TASK 1590627", url = "https://example.ru")
    @Link(name = "TestCase", url = "https://example.ru")
    @TmsLink("166964")
    public void testCreateAccount() {
        Allure.step("Шаг 1", () -> basePage.open(URL_CLIENT));

        Allure.step("Шаг 2", () -> clientPage.clickCreateAccount());

        Allure.step("Шаг 3", () -> createAccountPage
                .inputFirstName()
                .inputLastName()
                .inputAddress()
                .inputPostcode()
                .inputCity()
                .inputCountry()
                .inputEmail()
                .inputPhone()
                .inputPassword()
                .inputConfirmedPassword()
                .clickButtonCreateAccount()
                .clickLogoutLink()
                .inputEmail()
                .inputPassword()
                .clickLoginButton()
                .clickLogoutLink());
    }
}
