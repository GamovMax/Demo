package tests.ui;


import constants.Names;
import constants.TestInputs;
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
                .inputInElementWithAttributeName(Names.FIRST_NAME, TestInputs.FIRST_NAME, true, false)
                .inputInElementWithAttributeName(Names.LAST_NAME, TestInputs.LAST_NAME, true, false)
                .inputInElementWithAttributeName(Names.ADDRESS_1, TestInputs.ADDRESS, true, false)
                .inputInElementWithAttributeName(Names.POSTCODE, TestInputs.POSTCODE, false, false)
                .inputInElementWithAttributeName(Names.CITY, TestInputs.CITY, true, false)
                .inputCountry()
                .inputInElementWithAttributeName(Names.EMAIL, TestInputs.GMAIL_COM, true, true)
                .inputInElementWithAttributeName(Names.PHONE, TestInputs.PHONE, false, false)
                .inputInElementWithAttributeName(Names.PASSWORD, TestInputs.PASSWORD, true, false)
                .inputInElementWithAttributeName(Names.CONFIRMED_PASSWORD, TestInputs.PASSWORD, true, false)
                .clickOnElementWithAttributeName(Names.CREATE_ACCOUNT)
                .clickLogoutLink()
                .inputInElementWithAttributeName(Names.EMAIL, TestInputs.GMAIL_COM, true, true)
                .inputInElementWithAttributeName(Names.PASSWORD, TestInputs.PASSWORD, true, false)
                .clickOnElementWithAttributeName(Names.LOGIN)
                .clickLogoutLink());
    }
}
