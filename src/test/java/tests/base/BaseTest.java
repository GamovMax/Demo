package tests.base;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import pages.AdminPage;
import pages.BasePage;
import pages.CatalogPage;
import pages.ClientPage;
import pages.CreateAccountPage;
import pages.LoginPage;
import pages.TranslateYandexPage;

import static common.Config.CLEAR_COOKIES_AND_STORAGE;
import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {

    //    public WebDriver driverChrome = new ChromeDriver();
    protected static WebDriver driverChrome = CommonActions.createDriver();

    protected TranslateYandexPage translateYandexPage = new TranslateYandexPage(driverChrome);
    protected LoginPage loginPage = new LoginPage(driverChrome);
    protected CatalogPage catalogPage = new CatalogPage(driverChrome);
    protected ClientPage clientPage = new ClientPage(driverChrome);
    protected AdminPage adminPage = new AdminPage(driverChrome);
    protected BasePage basePage = new BasePage(driverChrome);
    protected CreateAccountPage createAccountPage = new CreateAccountPage(driverChrome);

    @AfterMethod
    public void tearDown() {
        if (CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driverChrome;
            driverChrome.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterClass
    public static void tearDownAfterClass() {
        if (!HOLD_BROWSER_OPEN) {
            driverChrome.quit();
        }
    }

    @AfterSuite
    public static void tearDownAfterSuite() {
        driverChrome.quit();
    }
}

