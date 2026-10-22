package pages.catalog;

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

    private final By catalogButtonAddNewProduct = By.partialLinkText("dd New Produc");
    private final By catalogRadiobuttonStatusEnabled = By.cssSelector("input[data-type=\"toggle\"][value=\"1\"]");
    private final By catalogInputName = By.cssSelector("input[name='name[en]']");
    private final By catalogMenuInformation = By.linkText("Information");
    private final By catalogInputKeywords = By.name("keywords");
    private final By catalogMenuPrices = By.linkText("Prices");
    private final By catalogInputPriceInclTaxUsd = By.name("gross_prices[USD]");
    private final By catalogButtonSave = By.name("save");
    private final By catalogFolderRubberDucks = By.xpath("//a[contains(text(), 'Rubber Ducks')]");
    private final By catalogBlueDuckLink = By.linkText("Blue Duck");
    private final By catalogGreenDuckLink = By.linkText("Green Duck");
    private final By catalogPurpleDuckLink = By.linkText("Purple Duck");
    private final By catalogRedDuckLink = By.linkText("Red Duck");
    private final By catalogYellowDuckLink = By.linkText("Yellow Duck");

    private final String name = "Name" + randomNumber;

    public CatalogPage clickButtonAddNewProduct() {
        driverChrome.findElement(catalogButtonAddNewProduct).click();
        return this;
    }

    public CatalogPage clickRadiobuttonStatusEnabled() {
        driverChrome.findElement(catalogRadiobuttonStatusEnabled).click();
        return this;
    }

    public CatalogPage inputRandomName() {
        driverChrome.findElement(catalogInputName).click();
        driverChrome.findElement(catalogInputName).sendKeys(name);
        return this;
    }

    public CatalogPage clickMenuInformation() {
        driverChrome.findElement(catalogMenuInformation).click();
        return this;
    }

    public CatalogPage inputKeyword() {
        driverChrome.findElement(catalogInputKeywords).click();
        driverChrome.findElement(catalogInputKeywords).sendKeys(name);
        return this;
    }

    public CatalogPage clickMenuPrices() {
        driverChrome.findElement(catalogMenuPrices).click();
        return this;
    }

    public CatalogPage inputUsd() {
        driverChrome.findElement(catalogInputPriceInclTaxUsd).click();
        driverChrome.findElement(catalogInputPriceInclTaxUsd).sendKeys("1");
        return this;
    }

    public CatalogPage clickFolderRubberDucksLink() {
        driverChrome.findElement(catalogFolderRubberDucks).click();
        return this;
    }

    public CatalogPage returnToCatalog() {
        driverChrome.navigate().back();
        return this;
    }

    public CatalogPage clickBlueDuckLink() {
        driverChrome.findElement(catalogBlueDuckLink).click();
        return this;
    }

    public CatalogPage clickGreenDuckLink() {
        driverChrome.findElement(catalogGreenDuckLink).click();
        return this;
    }

    public CatalogPage clickPurpleDuckLink() {
        driverChrome.findElement(catalogPurpleDuckLink).click();
        return this;
    }

    public CatalogPage clickRedDuckLink() {
        driverChrome.findElement(catalogRedDuckLink).click();
        return this;
    }

    public CatalogPage clickYellowDuckLink() {
        driverChrome.findElement(catalogYellowDuckLink).click();
        return this;
    }

    public void clickButtonSave() {
        driverChrome.findElement(catalogButtonSave).click();
    }

    public void getAndCheckLogs() {
        // Получить логи браузера определенного типа (например, LogType.BROWSER)
        LogEntries logs = driverChrome.manage().logs().get(LogType.BROWSER);

        // Проверить, что в логах отсутствуют сообщения указанного уровня (например, WARNING)
        for (LogEntry entry : logs) {

            if (entry.getLevel().toString().equals("DEBUG")) {
                System.out.println("В логе найдено сообщение, используемое для отладки: " + entry.getMessage());
            }
            else if (entry.getLevel().toString().equals("INFO")) {
                System.out.println("В логе найдено информационное сообщение: " + entry.getMessage());
            }
            else if (entry.getLevel().toString().equals("WARNING")) {
                System.out.println("Найдено предупреждение в логе: " + entry.getMessage());
            }
            else if (entry.getLevel().toString().equals("ERROR")) {
                System.out.println("В логе найдено сообщение об ошибке: " + entry.getMessage());
            }
            else if (entry.getLevel().toString().equals("CRITICAL")) {
                System.out.println("В логе найдена критическая ошибка: " + entry.getMessage());
            }
            else if (entry.getLevel().toString().equals("FATAL")) {
                System.out.println("В логе найдена критическая ошибка, которая приводит к аварийному завершению " +
                        "работы программы: " + entry.getMessage());
            }
            else if (entry.getLevel().equals(Level.SEVERE)) {
                System.out.println("Обнаружено сообщение уровня SEVERE в логе браузера: " + entry.getMessage());
                // Здесь можно добавить соответствующие действия в случае обнаружения сообщения заданного уровня
            }
            else if (entry.getLevel().equals("WARNING")) {
                System.out.println("WARNING log found: " + entry.getMessage());
                // Дополнительные действия при нахождении WARNING в логе
            }

        }

    }
}
