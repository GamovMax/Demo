package pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class BasePage {
    protected WebDriver driverChrome;

    protected Random random = new Random();
    protected int randomNumber = random.nextInt(1000000000);

    public BasePage(WebDriver driverChrome) {
        this.driverChrome = driverChrome;
    }

    /**
     * Вернуться на предыдущую страницу.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public BasePage returnToPreviousPage() {
        Allure.step("Вернуться на предыдущую страницу", () -> driverChrome.navigate().back());
        return this;
    }

    /**
     * Кликнуть на ссылку с текстом.
     *
     * @param linkText текст ссылки
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public BasePage clickOnLinkWithText(String linkText) {
        Allure.step("Кликнуть на ссылку с текстом '" + linkText + "'", () -> {
            WebElement element = driverChrome.findElement(By.linkText(linkText));

            element.isDisplayed();
            element.isEnabled();
            element.click();
        });
        return this;
    }

    /**
     * Открыть необходимую страницу по её URL.
     *
     * @param url url открываемой страницы
     */
    public void open(String url) {
        Allure.step("Открыть страницу по ее URL (" + url + ")", () -> driverChrome.get(url));
    }

    /**
     * Кликнуть на элемент с атрибутом 'name'.
     *
     * @param attributeName атрибут 'name'
     */
    public void clickOnElementWithAttributeName(String attributeName) {
        Allure.step("Кликнуть на элемент с атрибутом name = " + attributeName, () -> {
            WebElement element = driverChrome.findElement(By.name(attributeName));

            element.isDisplayed();
            element.isEnabled();
            element.click();
        });
    }

    /**
     * Ввести текст в элемент с атрибутом 'name'.
     *
     * @param attributeName атрибут 'name'
     * @param text          текст, который нужно ввести
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public BasePage inputInElementWithAttributeName(String attributeName, String text) {
        Allure.step("Ввести текст '" + text + "' в элемент с атрибутом name = " +
                attributeName, () -> {
            clickOnElementWithAttributeName(attributeName);

            WebElement element = driverChrome.findElement(By.name(attributeName));

            element.isDisplayed();
            element.isEnabled();
            element.sendKeys(text);
        });
        return this;
    }
}
