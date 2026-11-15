package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static constants.Settings.IMPLICIT_WAIT;

public class CommonActions {
    /**
     * Создание экземпляра драйвера и его базовая настройка
     */
    public static WebDriver createDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driverChrome = new ChromeDriver();

        driverChrome.manage().window().maximize();
        driverChrome.manage().timeouts().implicitlyWait(IMPLICIT_WAIT);
        return driverChrome;
    }
}