package tests.ui;


import io.qameta.allure.Allure;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Settings.URL_CLIENT;

public class TestCreateAccount extends BaseTest {

    @Test
    public void testCreateAccount() {
        // TODO добавить к методам в третьем шаге докстринги и степы

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
