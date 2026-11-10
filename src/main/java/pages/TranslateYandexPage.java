package pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
        Allure.step("Кликнуть по ссылке 'Примеры'", () -> {
            WebElement element = driverChrome.findElement(translationExamples);

            element.isDisplayed();
            element.isEnabled();
            element.click();
        });
        return this;
    }

    public void findTextEditor() {
        Allure.step("Найти ссылку 'Подборки'", () -> {
            WebElement element = driverChrome.findElement(textEditor);

            element.isDisplayed();
            element.isEnabled();
        });
    }

    public TranslateYandexPage findPictures() {
        Allure.step("Найти ссылку 'Картинки'", () -> {
            WebElement element = driverChrome.findElement(pictures);

            element.isDisplayed();
            element.isEnabled();
        });
        return this;
    }

    public TranslateYandexPage findWebsiteTranslation() {
        Allure.step("Найти ссылку 'Сайты'", () -> {
            WebElement element = driverChrome.findElement(websiteTranslation);

            element.isDisplayed();
            element.isEnabled();
        });
        return this;
    }

    public TranslateYandexPage findDocuments() {
        Allure.step("Найти ссылку 'Документы'", () -> {
            WebElement element = driverChrome.findElement(documents);

            element.isDisplayed();
            element.isEnabled();
        });
        return this;
    }
}
