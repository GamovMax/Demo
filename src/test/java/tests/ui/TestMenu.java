package tests.ui;

import constants.UITextElements;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Settings.URL_LOGIN;
import static constants.Settings.URL_TRANSLATE_YANDEX;

public class TestMenu extends BaseTest {

    @Test(description = "Проверка 'Яндекс Переводчика'")
    @Severity(SeverityLevel.NORMAL)
    @Link(name = "TASK 1590620", url = "https://example.ru")
    @Link(name = "TestCase", url = "https://example.ru")
    @TmsLink("166957")
    public void testTranslateYandexMenu() {
        Allure.step("Шаг 1", () -> basePage.open(URL_TRANSLATE_YANDEX));

        Allure.step("Шаг 2", () -> translateYandexPage
                .clickTranslateExamples()
                .findDocuments()
                .findWebsiteTranslation()
                .findPictures()
                .findTextEditor());
    }

    @Test(description = "Проверка меню на странице админки")
    @Severity(SeverityLevel.CRITICAL)
    @Link(name = "TASK 1590621", url = "https://example.ru")
    @Link(name = "TestCase", url = "https://example.ru")
    @TmsLink("166958")
    public void testAdminPageMenu() {
        Allure.step("Шаг 1", () -> basePage.open(URL_LOGIN));

        Allure.step("Шаг 2", () -> loginPage.authentication());

        Allure.step("Шаг 3", () -> adminPage
                .clickOnLinkWithTextInMenu(UITextElements.APPEARENCE)
                .clickOnLinkWithTextInMenu(UITextElements.LOGOTYPE)
                .clickOnLinkWithTextInMenu(UITextElements.CATALOG)
                .clickOnLinkWithTextInMenu(UITextElements.PRODUCT_GROUPS)
                .clickOnLinkWithTextInMenu(UITextElements.OPTION_GROUPS)
                .clickOnLinkWithTextInMenu(UITextElements.MANUFACTURERS)
                .clickOnLinkWithTextInMenu(UITextElements.SUPPLIERS)
                .clickOnLinkWithTextInMenu(UITextElements.DELIVERY_STATUSES)
                .clickOnLinkWithTextInMenu(UITextElements.SOLD_OUT_STATUSES)
                .clickOnLinkWithTextInMenu(UITextElements.QUANTITY_UNITS)
                .clickOnLinkWithTextInMenu(UITextElements.CSV_IMPORT_EXPORT)
                .clickOnLinkWithTextInMenu(UITextElements.COUNTRIES)
                .clickOnLinkWithTextInMenu(UITextElements.CURRENCIES)
                .clickOnLinkWithTextInMenu(UITextElements.CUSTOMERS)
                .clickOnLinkWithTextInMenu(UITextElements.CSV_IMPORT_EXPORT)
                .clickOnLinkWithTextInMenu(UITextElements.NEWSLETTER)
                .clickOnLinkWithTextInMenu(UITextElements.GEO_ZONES)
                .clickOnLinkWithTextInMenu(UITextElements.LANGUAGES)
                .clickOnLinkWithTextInMenu(UITextElements.STORAGE_ENCODING)
                .clickOnLinkWithTextInMenu(UITextElements.MODULES)
                .clickOnLinkWithTextInMenu(UITextElements.CUSTOMER)
                .clickOnLinkWithTextInMenu(UITextElements.SHIPPING)
                .clickOnLinkWithTextInMenu(UITextElements.PAYMENT)
                .clickOnLinkWithTextInMenu(UITextElements.ORDER_TOTAL)
                .clickOnLinkWithTextInMenu(UITextElements.ORDER_SUCCESS)
                .clickOnLinkWithTextInMenu(UITextElements.ORDER_ACTION)
                .clickOnLinkWithTextInMenu(UITextElements.ORDERS)
                .clickOnLinkWithTextInMenu(UITextElements.ORDER_STATUSES)
                .clickOnLinkWithTextInMenu(UITextElements.PAGES)
                .clickOnLinkWithTextInMenu(UITextElements.REPORTS)
                .clickOnLinkWithTextInMenu(UITextElements.MOST_SOLD_PRODUCTS)
                .clickOnLinkWithTextInMenu(UITextElements.MOST_SHOPPING_CUSTOMERS)
                .clickOnLinkWithTextInMenu(UITextElements.SETTINGS)
                .clickOnLinkWithTextInMenu(UITextElements.DEFAULTS)
                .clickOnLinkWithTextInMenu(UITextElements.GENERAL)
                .clickOnLinkWithTextInMenu(UITextElements.LISTINGS)
                .clickOnLinkWithTextInMenu(UITextElements.IMAGES)
                .clickOnLinkWithTextInMenu(UITextElements.CHECKOUT)
                .clickOnLinkWithTextInMenu(UITextElements.ADVANCED)
                .clickOnLinkWithTextInMenu(UITextElements.SECURITY)
                .clickOnLinkWithTextInMenu(UITextElements.SLIDES)
                .clickOnLinkWithTextInMenu(UITextElements.TAX)
                .clickOnLinkWithTextInMenu(UITextElements.TAX_RATES)
                .clickOnLinkWithTextInMenu(UITextElements.TRANSLATIONS)
                .clickOnLinkWithTextInMenu(UITextElements.SCAN_FILES)
                .clickOnLinkWithTextInMenu(UITextElements.CSV_IMPORT_EXPORT)
                .clickOnLinkWithTextInMenu(UITextElements.USERS)
                .clickOnLinkWithTextInMenu(UITextElements.V_QMODS));
    }
}
