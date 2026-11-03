package pages.catalog;

import constants.Names;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import pages.base.BasePage;

import java.util.logging.Level;

public class CatalogPage extends BasePage {

    public CatalogPage(WebDriver driverChrome) {
        super(driverChrome);
    }

    private final By catalogButtonAddNewProduct = By.linkText("Add New Product");
    private final By catalogRadiobuttonStatusEnabled = By.cssSelector("input[data-type='toggle'][value='1']");
    private final By catalogInputName = By.cssSelector("input[name='name[en]']");
    private final By catalogMenuInformation = By.linkText("Information");
    private final By catalogMenuPrices = By.linkText("Prices");
    private final By catalogFolderRubberDucks = By.xpath("//a[contains(text(), 'Rubber Ducks')]");
    private final By catalogBlueDuckLink = By.linkText("Blue Duck");
    private final By catalogGreenDuckLink = By.linkText("Green Duck");
    private final By catalogPurpleDuckLink = By.linkText("Purple Duck");
    private final By catalogRedDuckLink = By.linkText("Red Duck");
    private final By catalogYellowDuckLink = By.linkText("Yellow Duck");

    private final String name = "Name" + randomNumber;

    /**
     * Кликнуть на кнопку 'AddNewProduct'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CatalogPage clickOnButtonAddNewProduct() {
        Allure.step("Кликнуть на кнопку 'Add New Product'", () -> driverChrome
                .findElement(catalogButtonAddNewProduct)
                .click());
        return this;
    }

    /**
     * Кликнуть на радиокнопку 'Enabled'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CatalogPage clickOnRadiobuttonStatusEnabled() {
        Allure.step("Кликнуть на радиокнопку 'Enabled'", () -> driverChrome
                .findElement(catalogRadiobuttonStatusEnabled)
                .click());
        return this;
    }

    /**
     * Ввести рандомное имя.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CatalogPage typeRandomName() {
        Allure.step("Ввести рандомное имя", () -> {
            driverChrome.findElement(catalogInputName).click();
            driverChrome.findElement(catalogInputName).sendKeys(name);
        });
        return this;
    }

    /**
     * Кликнуть на вкладку меню 'Information'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CatalogPage clickOnMenuInformation() {
        Allure.step("Кликнуть на вкладку меню 'Information'", () -> driverChrome
                .findElement(catalogMenuInformation)
                .click());
        return this;
    }

    /**
     * Ввести рандомное значение в поле 'Keyword'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CatalogPage typeKeyword() {
        Allure.step("Ввести рандомное значение в поле 'Keyword'", () -> {
            inputInElementWithAttributeName(Names.KEYWORDS, name);
        });
        return this;
    }

    /**
     * Кликнуть на вкладку меню 'Prices'.
     */
    public void clickOnMenuPrices() {
        Allure.step("Кликнуть на вкладку меню 'Prices'", () -> driverChrome
                .findElement(catalogMenuPrices)
                .click());
    }

    /**
     * Кликнуть на ссылку 'Rubber Ducks'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CatalogPage clickOnFolderRubberDucksLink() {
        Allure.step("Кликнуть на ссылку 'Rubber Ducks'", () -> driverChrome
                .findElement(catalogFolderRubberDucks)
                .click());
        return this;
    }

    /**
     * Вернуться на предыдущую страницу.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CatalogPage returnToPreviousPage() {
        Allure.step("Вернуться на предыдущую страницу", () -> driverChrome.navigate().back());
        return this;
    }

    /**
     * Кликнуть на ссылку 'Blue Duck'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CatalogPage clickOnBlueDuckLink() {
        Allure.step("Кликнуть на ссылку 'Blue Duck'", () -> driverChrome
                .findElement(catalogBlueDuckLink)
                .click());
        return this;
    }

    /**
     * Кликнуть на ссылку 'Green Duck'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CatalogPage clickOnGreenDuckLink() {
        Allure.step("Кликнуть на ссылку 'Green Duck'", () -> driverChrome
                .findElement(catalogGreenDuckLink)
                .click());
        return this;
    }

    /**
     * Кликнуть на ссылку 'Purple Duck'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CatalogPage clickOnPurpleDuckLink() {
        Allure.step("Кликнуть на ссылку 'Purple Duck'", () -> driverChrome
                .findElement(catalogPurpleDuckLink)
                .click());
        return this;
    }

    /**
     * Кликнуть на ссылку 'Red Duck'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CatalogPage clickOnRedDuckLink() {
        Allure.step("Кликнуть на ссылку 'Red Duck'", () -> driverChrome
                .findElement(catalogRedDuckLink)
                .click());
        return this;
    }

    /**
     * Кликнуть на ссылку 'Yellow Duck'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CatalogPage clickOnYellowDuckLink() {
        Allure.step("Кликнуть на ссылку 'Yellow Duck'", () -> driverChrome
                .findElement(catalogYellowDuckLink)
                .click());
        return this;
    }

    /**
     * Получить и проверить логи браузера.
     */
    public void getAndCheckLogs() {
        // Получить логи браузера определенного типа (например, LogType.BROWSER)
        LogEntries logs = driverChrome.manage().logs().get(LogType.BROWSER);

        // Проверить, что в логах отсутствуют сообщения указанного уровня (например, WARNING)
        Allure.step("Получить и проверить логи браузера", () -> {
            for (LogEntry entry : logs) {
                if (entry.getLevel().toString().equals("DEBUG")) {
                    System.out.println("В логе найдено сообщение, используемое для отладки: " + entry.getMessage());
                } else if (entry.getLevel().toString().equals("INFO")) {
                    System.out.println("В логе найдено информационное сообщение: " + entry.getMessage());
                } else if (entry.getLevel().toString().equals("WARNING")) {
                    System.out.println("Найдено предупреждение в логе: " + entry.getMessage());
                    // Дополнительные действия при нахождении WARNING в логе
                } else if (entry.getLevel().toString().equals("ERROR")) {
                    System.out.println("В логе найдено сообщение об ошибке: " + entry.getMessage());
                } else if (entry.getLevel().toString().equals("CRITICAL")) {
                    System.out.println("В логе найдена критическая ошибка: " + entry.getMessage());
                } else if (entry.getLevel().toString().equals("FATAL")) {
                    System.out.println("В логе найдена критическая ошибка, которая приводит к аварийному завершению " +
                            "работы программы: " + entry.getMessage());
                } else if (entry.getLevel().equals(Level.SEVERE)) {
                    System.out.println("Обнаружено сообщение уровня SEVERE в логе браузера: " + entry.getMessage());
                    // Здесь можно добавить соответствующие действия в случае обнаружения сообщения заданного уровня
                }
            }
        });
    }
}
