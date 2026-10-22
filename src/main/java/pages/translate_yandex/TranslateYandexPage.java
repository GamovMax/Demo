package pages.translate_yandex;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class TranslateYandexPage extends BasePage {

    public TranslateYandexPage(WebDriver driverChrome) {
        super(driverChrome);
    }

    private final By translationExamples = By.cssSelector(".verticalMenuNavItem:nth-child(2)");
    private final By websiteTranslation = By.cssSelector(".verticalMenuNavItem:nth-child(3)");
    private final By documents = By.cssSelector(".verticalMenuNavItem:nth-child(4)");
    private final By pictures = By.cssSelector(".verticalMenuNavItem:nth-child(5)");
    private final By textEditor = By.cssSelector(".verticalMenuNavItem:nth-child(6)");

    public TranslateYandexPage clickTranslateExamples() {
        Allure.step("Кликнуть по ссылке 'Примеры'", () -> driverChrome.findElement(translationExamples).click());
        return this;
    }

    public void findTextEditor() {
        Allure.step("Найти ссылку 'Подборки'", () -> driverChrome.findElement(textEditor));
    }

    public TranslateYandexPage findPictures() {
        Allure.step("Найти ссылку 'Картинки'", () -> driverChrome.findElement(pictures));
        return this;
    }

    public TranslateYandexPage findWebsiteTranslation() {
        Allure.step("Найти ссылку 'Сайты'", () -> driverChrome.findElement(websiteTranslation));
        return this;
    }

    public TranslateYandexPage findDocuments() {
        Allure.step("Найти ссылку 'Документы'", () -> driverChrome.findElement(documents));
        return this;
    }
}
