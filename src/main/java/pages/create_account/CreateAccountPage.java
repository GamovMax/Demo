package pages.create_account;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class CreateAccountPage extends BasePage {

    public CreateAccountPage(WebDriver driverChrome) {
        super(driverChrome);
    }

    // TODO вынести значения в класс констант 'Names'
    private final By accountInputFirstName = By.cssSelector("input[name='firstname']");
    private final By accountInputLastName = By.cssSelector("input[name='lastname']");
    private final By accountInputAddress = By.cssSelector("input[name='address1']");
    private final By accountInputPostcode = By.cssSelector("input[name='postcode']");
    private final By accountInputCity = By.cssSelector("input[name='city']");
    private final By accountInputEmail = By.cssSelector("input[name='email']");
    private final By accountInputPhone = By.cssSelector("input[name='phone']");
    private final By accountInputPassword = By.cssSelector("input[name='password']");
    private final By buttonCreateAccount = By.cssSelector("button[name='create_account']");
    private final By LoginButton = By.cssSelector("button[name='login']");
    private final By accountInputConfirmedPassword = By.cssSelector("input[name='confirmed_password']");

    private final By accountInputCountry = By.className("select2-search__field");
    private final By selectResultsOptionHighlighted = By.className("select2-results__option--highlighted");
    private final By accountCountrySelection = By.className("selection");
    private final By LogoutLink = By.cssSelector("div ul.list-vertical li:nth-child(4) a");

    // TODO вынести значения в класс констант 'TestInputs'
    private final String email = randomNumber + "@gmail.com";
    private final String firstName = "First Name " + randomNumber;
    private final String lastName = "Last Name " + randomNumber;
    private final String address = "Address " + randomNumber;
    private final String city = "City " + randomNumber;
    private final String password = "P@$$w0rd" + randomNumber;

    /**
     * Ввести текст в input 'First Name'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CreateAccountPage inputFirstName() {
        Allure.step("Ввести текст в input 'First Name'", () -> {
            driverChrome.findElement(accountInputFirstName).click();
            driverChrome.findElement(accountInputFirstName).sendKeys(firstName);
        });
        return this;
    }

    /**
     * Ввести текст в input 'Last Name'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CreateAccountPage inputLastName() {
        Allure.step("Ввести текст в input 'Last Name'", () -> {
            driverChrome.findElement(accountInputLastName).click();
            driverChrome.findElement(accountInputLastName).sendKeys(lastName);
        });
        return this;
    }

    /**
     * Ввести текст в input 'Address 1'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CreateAccountPage inputAddress() {
        Allure.step("Ввести текст в input 'Address 1'", () -> {
            driverChrome.findElement(accountInputAddress).click();
            driverChrome.findElement(accountInputAddress).sendKeys(address);
        });
        return this;
    }

    /**
     * Ввести текст в input 'Postcode'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CreateAccountPage inputPostcode() {
        String postcode = "36601";

        Allure.step("Ввести текст в input 'Postcode'", () -> {
            driverChrome.findElement(accountInputPostcode).click();
            driverChrome.findElement(accountInputPostcode).sendKeys(postcode);
        });
        return this;
    }

    /**
     * Ввести текст в input 'City'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CreateAccountPage inputCity() {
        Allure.step("Ввести текст в input 'City'", () -> {
            driverChrome.findElement(accountInputCity).click();
            driverChrome.findElement(accountInputCity).sendKeys(city);
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
     * Ввести текст в input 'Email'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CreateAccountPage inputEmail() {
        Allure.step("Ввести текст в input 'Email'", () -> {
            driverChrome.findElement(accountInputEmail).click();
            driverChrome.findElement(accountInputEmail).sendKeys(email);
        });
        return this;
    }

    /**
     * Ввести текст в input 'Phone'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CreateAccountPage inputPhone() {
        String phone = "+79023455621";

        Allure.step("Ввести текст в input 'Phone'", () -> {
            driverChrome.findElement(accountInputPhone).click();
            driverChrome.findElement(accountInputPhone).sendKeys(phone);
        });
        return this;
    }

    /**
     * Ввести текст в input 'Password'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CreateAccountPage inputPassword() {
        Allure.step("Ввести текст в input 'Password'", () -> {
            driverChrome.findElement(accountInputPassword).click();
            driverChrome.findElement(accountInputPassword).sendKeys(password);
        });
        return this;
    }

    /**
     * Ввести текст в input 'Confirmed Password'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CreateAccountPage inputConfirmedPassword() {
        Allure.step("Ввести текст в input 'Confirmed Password'", () -> {
            driverChrome.findElement(accountInputConfirmedPassword).click();
            driverChrome.findElement(accountInputConfirmedPassword).sendKeys(password);
        });
        return this;
    }

    /**
     * Кликнуть на кнопку 'Create Account'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CreateAccountPage clickButtonCreateAccount() {
        Allure.step("Кликнуть на кнопку 'Create Account'", () -> driverChrome
                .findElement(buttonCreateAccount)
                .click());
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

    /**
     * Кликнуть на кнопку 'Login'.
     *
     * @return текущий объект страницы 'this' (для цепочки вызовов)
     */
    public CreateAccountPage clickLoginButton() {
        Allure.step("Кликнуть на кнопку 'Login'", () -> driverChrome.findElement(LoginButton).click());
        return this;
    }

}