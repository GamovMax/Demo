package pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientPage extends BasePage {

    public ClientPage(WebDriver driverChrome) {
        super(driverChrome);
    }

    private final By createAccount = By.cssSelector
            ("form[name='login_form'] tr:nth-child(5)");

    /**
     * Проверить стикеры в каталоге.
     */
    public void checkStickers() {
        String boxMostPopular = "//div[@id='box-most-popular']//li";
        Allure.step("Проверить стикеры в каталоге.", () -> {
            for (byte i = 1; i <= 5; i++) {
                WebElement element = driverChrome
                        .findElement(By.xpath(boxMostPopular + "[" + i + "]//div[1]/div"));

                element.isDisplayed();
                element.isEnabled();
            }
        });
    }

    /**
     * Кликнуть на кнопку 'Create account'.
     */
    public void clickCreateAccount() {
        Allure.step("Кликнуть на кнопку 'Create account'", () -> {
            WebElement element = driverChrome.findElement(createAccount);

            element.isDisplayed();
            element.isEnabled();
            element.click();
        });
    }
}
