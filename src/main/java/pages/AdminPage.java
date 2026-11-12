package pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPage extends BasePage {

    public AdminPage(WebDriver driverChrome) {
        super(driverChrome);
    }

    /**
     * Кликнуть по ссылке с текстом в меню админки.
     *
     * @param linkText текст ссылки в меню админки
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public AdminPage clickOnLinkWithTextInMenu(String linkText) {
        Allure.step("Кликнуть по ссылке с текстом '" + linkText + "' в меню админки", () -> {
            WebElement element = driverChrome
                    .findElement(By.xpath("//a/span[text()='" + linkText + "']"));

            element.isDisplayed();
            element.isEnabled();
            element.click();
        });
        return this;
    }

    /**
     * Проверить наличие на странице заголовка первого уровня ('h1').
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public AdminPage checkFirstLevelHeader() {
        Allure.step("Проверить наличие на странице заголовка первого уровня ('h1')", () -> {
            WebElement element = driverChrome.findElement(By.cssSelector("h1"));

            element.isDisplayed();
            element.isEnabled();
        });
        return this;
    }
}