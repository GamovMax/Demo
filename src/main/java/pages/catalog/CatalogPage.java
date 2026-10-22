package pages.catalog;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class CatalogPage extends BasePage {

    public CatalogPage(WebDriver driverChrome) {
        super(driverChrome);
    }

    private final By catalogButtonAddNewProduct = By.linkText("Add New Product");
    private final By catalogRadiobuttonStatusEnabled = By.cssSelector("input[data-type='toggle'][value='1']");
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
            driverChrome.findElement(catalogInputKeywords).click();
            driverChrome.findElement(catalogInputKeywords).sendKeys(name);
        });
        return this;
    }

    /**
     * Кликнуть на вкладку меню 'Prices'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CatalogPage clickOnMenuPrices() {
        Allure.step("Кликнуть на вкладку меню 'Prices'", () -> driverChrome
                .findElement(catalogMenuPrices)
                .click());
        return this;
    }

    /**
     * Ввести цену.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CatalogPage typeUsd() {
        Allure.step("Ввести цену", () -> {
            driverChrome.findElement(catalogInputPriceInclTaxUsd).click();
            driverChrome.findElement(catalogInputPriceInclTaxUsd).sendKeys("1");
        });
        return this;
    }

    /**
     * Кликнуть на кнопку 'Save'.
     */
    public void clickOnButtonSave() {
        Allure.step("Кликнуть на кнопку 'Save'", () -> driverChrome.findElement(catalogButtonSave).click());
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
}
