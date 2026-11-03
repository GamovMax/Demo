package pages.base;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

import static constants.Settings.EXPLICIT_WAIT;

public class BasePage {
    protected WebDriver driverChrome;

    protected Random random = new Random();
    protected int randomNumber = random.nextInt(1000000000);

    public BasePage(WebDriver driverChrome) {
        this.driverChrome = driverChrome;
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
     * @param AttributeName атрибут 'name'
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public BasePage clickOnElementWithAttributeName(String AttributeName) {
        Allure.step("Кликнуть на элемент с атрибутом name = " + AttributeName, () -> driverChrome
                .findElement(By.name(AttributeName))
                .click());
        return this;
    }

    /**
     * Ввести текст в элемент с атрибутом 'name'.
     *
     * @param attributeName атрибут 'name'
     * @param text          текст, который нужно ввести
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public BasePage inputInElementWithAttributeName(String attributeName, String text) {
        Allure.step("Ввести текст (" + text + ") в элемент с атрибутом name = " +
                attributeName, () -> {
            driverChrome.findElement(By.name(attributeName)).click();
            driverChrome.findElement(By.name(attributeName)).sendKeys(text);
        });
        return this;
    }

    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driverChrome, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
