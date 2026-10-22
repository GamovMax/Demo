package pages.create_account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class CreateAccountPage extends BasePage {

    public CreateAccountPage(WebDriver driverChrome) {
        super(driverChrome);
    }

    private final By accountInputFirstName = By.cssSelector("input[name='firstname']");
    private final By accountInputLastName = By.cssSelector("input[name='lastname']");
    private final By accountInputAddress = By.cssSelector("input[name='address1']");
    private final By accountInputPostcode = By.cssSelector("input[name='postcode']");
    private final By accountInputCity = By.cssSelector("input[name='city']");
    private final By accountCountrySelection = By.className("selection");
    private final By accountInputCountry = By.className("select2-search__field");
    private final By selectResultsOptionHighlighted = By.className("select2-results__option--highlighted");
    private final By accountInputEmail = By.cssSelector("input[name='email']");
    private final By accountInputPhone = By.cssSelector("input[name='phone']");
    private final By accountInputPassword = By.cssSelector("input[name='password']");
    private final By accountInputConfirmedPassword = By.cssSelector("input[name='confirmed_password']");
    private final By buttonCreateAccount = By.cssSelector("button[name='create_account']");
    private final By LogoutLink = By.cssSelector("div > ul.list-vertical > li:nth-child(4) > a");
    private final By LoginButton = By.cssSelector("button[name='login']");

    private final String email = randomNumber + "@gmail.com";
    private final String firstName = "First Name " + randomNumber;
    private final String lastName = "Last Name " + randomNumber;
    private final String address = "Address " + randomNumber;
    private final String city = "City " + randomNumber;
    private final String password = "P@$$w0rd" + randomNumber;

    public CreateAccountPage inputFirstName() {
        driverChrome.findElement(accountInputFirstName).click();
        driverChrome.findElement(accountInputFirstName).sendKeys(firstName);
        return this;
    }

    public CreateAccountPage inputLastName() {
        driverChrome.findElement(accountInputLastName).click();
        driverChrome.findElement(accountInputLastName).sendKeys(lastName);
        return this;
    }

    public CreateAccountPage inputAddress() {
        driverChrome.findElement(accountInputAddress).click();
        driverChrome.findElement(accountInputAddress).sendKeys(address);
        return this;
    }

    public CreateAccountPage inputPostcode() {
        String postcode = "36601";

        driverChrome.findElement(accountInputPostcode).click();
        driverChrome.findElement(accountInputPostcode).sendKeys(postcode);
        return this;
    }

    public CreateAccountPage inputCity() {
        driverChrome.findElement(accountInputCity).click();
        driverChrome.findElement(accountInputCity).sendKeys(city);
        return this;
    }

    public CreateAccountPage inputCountry() {
        String country = "United States";

        driverChrome.findElement(accountCountrySelection).click();
        driverChrome.findElement(accountInputCountry).click();
        driverChrome.findElement(accountInputCountry).sendKeys(country);
        driverChrome.findElement(selectResultsOptionHighlighted).click();
        return this;
    }

    public CreateAccountPage inputEmail() {
        driverChrome.findElement(accountInputEmail).click();
        driverChrome.findElement(accountInputEmail).sendKeys(email);
        return this;
    }

    public CreateAccountPage inputPhone() {
        String phone = "+79023455621";

        driverChrome.findElement(accountInputPhone).click();
        driverChrome.findElement(accountInputPhone).sendKeys(phone);
        return this;
    }

    public CreateAccountPage inputPassword() {
        driverChrome.findElement(accountInputPassword).click();
        driverChrome.findElement(accountInputPassword).sendKeys(password);
        return this;
    }

    public CreateAccountPage inputConfirmedPassword() {
        driverChrome.findElement(accountInputConfirmedPassword).click();
        driverChrome.findElement(accountInputConfirmedPassword).sendKeys(password);
        return this;
    }

    public CreateAccountPage clickButtonCreateAccount() {
        driverChrome.findElement(buttonCreateAccount).click();
        return this;
    }

    public CreateAccountPage clickLogoutLink() {
        driverChrome.findElement(LogoutLink).click();
        return this;
    }

    public CreateAccountPage clickLoginButton() {
        driverChrome.findElement(LoginButton).click();
        return this;
    }

}