package pages;

import constants.Names;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.util.logging.Level;

public class CatalogPage extends BasePage {

    public CatalogPage(WebDriver driverChrome) {
        super(driverChrome);
    }

    private final By catalogRadiobuttonStatusEnabled = By.cssSelector("input[data-type='toggle'][value='1']");
    private final By catalogInputName = By.cssSelector("input[name='name[en]']");

    private final String name = "Name" + randomNumber;

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
