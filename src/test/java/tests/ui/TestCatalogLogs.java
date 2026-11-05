package tests.ui;


import constants.UITextElements;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Settings.URL_LOGIN;


public class TestCatalogLogs extends BaseTest {
    @Test(description = "Проверить логи")
    @Severity(SeverityLevel.CRITICAL)
    @Link(name = "TASK 1590626", url = "https://example.ru")
    @Link(name = "TestCase", url = "https://example.ru")
    @TmsLink("166963")
    public void testCatalogLogs() {
        Allure.step("Шаг 1", () -> basePage.open(URL_LOGIN));

        Allure.step("Шаг 2", () -> loginPage.authentication());

        Allure.step("Шаг 3", () -> adminPage
                .clickOnLinkWithTextInMenu(UITextElements.APPEARENCE)
                .clickOnLinkWithTextInMenu(UITextElements.CATALOG));

        Allure.step("Шаг 4", () -> catalogPage
                .clickOnLinkWithText(UITextElements.RUBBER_DUCKS)
                .clickOnLinkWithText(UITextElements.BLUE_DUCK)
                .returnToPreviousPage()
                .clickOnLinkWithText(UITextElements.GREEN_DUCK)
                .returnToPreviousPage()
                .clickOnLinkWithText(UITextElements.PURPLE_DUCK)
                .returnToPreviousPage()
                .clickOnLinkWithText(UITextElements.RED_DUCK)
                .returnToPreviousPage()
                .clickOnLinkWithText(UITextElements.YELLOW_DUCK)
                .returnToPreviousPage());

        Allure.step("Шаг 5", () -> catalogPage.getAndCheckLogs());
    }
}
