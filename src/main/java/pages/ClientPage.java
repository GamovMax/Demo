package pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
            for (byte i = 1; i <= 5; i++)
                driverChrome.findElement(By.xpath(boxMostPopular + "[" + i + "]//div[1]/div"));
        });
    }

    /**
     * Кликнуть на кнопку 'Create account'.
     */
    public void clickCreateAccount() {
        Allure.step("Кликнуть на кнопку 'Create account'", () -> driverChrome.findElement(createAccount).click());
    }
}
