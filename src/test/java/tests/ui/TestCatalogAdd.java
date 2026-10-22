package tests.ui;

import constants.UITextElements;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Settings.URL_LOGIN;

public class TestCatalogAdd extends BaseTest {

    @Test(description = "Добавить новый товар")
    @Severity(SeverityLevel.CRITICAL)
    @Link(name = "TASK 1590624", url = "https://example.ru")
    @Link(name = "TestCase", url = "https://example.ru")
    @TmsLink("166961")
    public void testCatalogAdd() {

        Allure.step("Шаг 1", () -> basePage.open(URL_LOGIN));

        Allure.step("Шаг 2", () -> loginPage.authentication());

        Allure.step("Шаг 3", () -> adminPage
                .clickOnLinkWithTextInMenu(UITextElements.APPEARENCE)
                .clickOnLinkWithTextInMenu(UITextElements.CATALOG));

        Allure.step("Шаг 4", () -> catalogPage
                .clickOnButtonAddNewProduct()
                .clickOnRadiobuttonStatusEnabled()
                .typeRandomName()
                .clickOnMenuInformation()
                .typeKeyword()
                .clickOnMenuPrices()
                .typeUsd()
                .clickOnButtonSave());
    }
}