package pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountPage extends BasePage {

    public CreateAccountPage(WebDriver driverChrome) {
        super(driverChrome);
    }

    private final By accountInputCountry = By.className("select2-search__field");
    private final By selectResultsOptionHighlighted = By.className("select2-results__option--highlighted");
    private final By accountCountrySelection = By.className("selection");
    private final By LogoutLink = By.cssSelector("div ul.list-vertical li:nth-child(4) a");

    /**
     * Ввести текст в элемент с атрибутом 'name'.
     *
     * @param attributeName атрибут 'name'
     * @param text          текст, который нужно ввести
     * @param email         если true, то поле ввода для email'а
     * @param random        если true, то к тексту будет добавляться случайное число
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CreateAccountPage inputInElementWithAttributeName(
            String attributeName,
            String text,
            boolean random,
            boolean email
    ) {
        Allure.step("Ввести текст '" + text + "' без/со случайным числом в элемент с атрибутом name = " +
                attributeName, () -> {
            WebElement element = driverChrome.findElement(By.name(attributeName));

            element.isDisplayed();
            element.isEnabled();
            element.click();

            if (email)
                element.sendKeys(randomNumber + text);
            else if (random)
                element.sendKeys(text + randomNumber);
            else
                element.sendKeys(text);
        });
        return this;
    }

    /**
     * Ввести текст в input 'Country'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CreateAccountPage inputCountry() {
        String country = "United States";

        Allure.step("Ввести текст в input 'Country'", () -> {
            WebElement element = driverChrome.findElement(accountCountrySelection);
            element.isDisplayed();
            element.isEnabled();
            element.click();

            element = driverChrome.findElement(accountInputCountry);
            element.isDisplayed();
            element.isEnabled();
            element.click();
            element.sendKeys(country);

            element = driverChrome.findElement(selectResultsOptionHighlighted);
            element.isDisplayed();
            element.isEnabled();
            element.click();
        });
        return this;
    }

    /**
     * Кликнуть на ссылку 'Logout'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CreateAccountPage clickLogoutLink() {
        Allure.step("Кликнуть на ссылку 'Logout'", () -> {
            WebElement element = driverChrome.findElement(LogoutLink);

            element.isDisplayed();
            element.isEnabled();
            element.click();
        });
        return this;
    }
}
