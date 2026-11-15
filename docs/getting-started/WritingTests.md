# Написание теста

При написании новых автотестов следовать структуре:

```java
public class TestTitle extends BaseTest {
    @Test(description = "Название тест-кейса")
    @Severity(SeverityLevel.CRITICAL) // CRITICAL > NORMAL > MINOR > TRIVIAL
    @Link(name = "TASK 0000001", url = "URL-ссылка на задачу")
    @Link(name = "TestCase", url = "URL-ссылка на тест-кейс")
    @TmsLink("1111111") // Идентификатор тест-кейса
    public void testTitle() {
        Allure.step("Шаг 1", () -> {});

        Allure.step("Шаг 2", () -> {});
        
        Allure.step("Шаг 3", () -> {});
    }
}
```

---

- [Назад (Ссылки на документации)](Documentation.md)
- [Далее (Как выставлять версии для изменений в Autotests?)](Versions.md)