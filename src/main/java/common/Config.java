package common;

/**
 * Конфигурационный класс
 */
public class Config {
    /**
     * Очищать файлы cookie браузера после каждого автотеста, если значение true – очищать файлы cookie
     */
    public static final Boolean CLEAR_COOKIES_AND_STORAGE = true;

    /**
     * Чтобы браузер оставался открытым после прогона suite, если false – закрыть браузер
     */
    public static final Boolean HOLD_BROWSER_OPEN = true;
}