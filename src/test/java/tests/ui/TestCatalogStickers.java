package tests.ui;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Settings.URL_CLIENT;

public class TestCatalogStickers extends BaseTest {
    @Test(description = "Проверить стикеры в каталоге")
    @Severity(SeverityLevel.CRITICAL)
    @Link(name = "TASK 1590625", url = "https://example.ru")
    @Link(name = "TestCase", url = "https://example.ru")
    @TmsLink("166962")
    public void testCatalogStickers() {
        Allure.step("Шаг 1", () -> basePage.open(URL_CLIENT));

        Allure.step("Шаг 2", () -> clientPage.checkStickers());
    }
}