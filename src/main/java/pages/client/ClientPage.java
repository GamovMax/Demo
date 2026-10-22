package pages.client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class ClientPage extends BasePage {

    public ClientPage(WebDriver driverChrome) {
        super(driverChrome);
    }

    private final By createAccount = By.cssSelector
            ("form[name='login_form'] > table > tbody > tr:nth-child(5) > td > a");

    public void checkStickers() {
        //    public static final String BOX_MOST_POPULAR = "//div[@id=\"box-most-popular\"]/div/ul/li";
        String boxMostPopular = "//div[@id=\"box-most-popular\"]/div/ul/li";
        for (byte i = 1; i <= 10; i++)
            driverChrome.findElement(By.xpath(boxMostPopular + "[" + i + "]/a[1]/div[1]/div"));
    }

    public void clickCreateAccount() {
        driverChrome.findElement(createAccount).click();
    }
}