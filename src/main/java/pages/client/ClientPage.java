package pages.client;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class ClientPage extends BasePage {

    public ClientPage(WebDriver driverChrome) {
        super(driverChrome);
    }

    private final By createAccount = By.cssSelector
            ("form[name='login_form'] > table > tbody > tr:nth-child(5) > td > a");

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

    public void clickCreateAccount() {
        driverChrome.findElement(createAccount).click();
    }
}
