package pages.base;

import io.qameta.allure.Allure;
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

    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driverChrome, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
