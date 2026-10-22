package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static constants.Settings.IMPLICIT_WAIT;

public class CommonActions {
    public static WebDriver createDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driverChrome = new ChromeDriver();

        driverChrome.manage().window().maximize();
        driverChrome.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driverChrome;
    }
}