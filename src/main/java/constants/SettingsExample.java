package constants;

import java.time.Duration;

/**
 * Константы базовых настроек.
 */
public class SettingsExample {
    /**
     * Логин для авторизации.
     */
    public static final String LOGIN = "";
    /**
     * Пароль для авторизации.
     */
    public static final String PASSWORD = "";

    /**
     * URL главной клиентской страницы сервиса
     */
    public static final String URL_CLIENT = "";
    /**
     * URL страницы с формой авторизации.
     */
    public static final String URL_LOGIN = "";
    /**
     * URL для 'Яндекс Переводчика'.
     */
    public static final String URL_TRANSLATE_YANDEX = "";
    /**
     * Длительность неявного ожидания в секундах.
     */
    public static final Duration IMPLICIT_WAIT = Duration.ofSeconds(5);
}
