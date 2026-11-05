package pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
            driverChrome.findElement(By.name(attributeName)).click();

            if (email)
                driverChrome.findElement(By.name(attributeName)).sendKeys(randomNumber + text);
            else if (random)
                driverChrome.findElement(By.name(attributeName)).sendKeys(text + randomNumber);
            else
                driverChrome.findElement(By.name(attributeName)).sendKeys(text);
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
            driverChrome.findElement(accountCountrySelection).click();
            driverChrome.findElement(accountInputCountry).click();
            driverChrome.findElement(accountInputCountry).sendKeys(country);
            driverChrome.findElement(selectResultsOptionHighlighted).click();
        });
        return this;
    }

    /**
     * Кликнуть на ссылку 'Logout'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CreateAccountPage clickLogoutLink() {
        Allure.step("Кликнуть на ссылку 'Logout'", () -> driverChrome.findElement(LogoutLink).click());
        return this;
    }
}
