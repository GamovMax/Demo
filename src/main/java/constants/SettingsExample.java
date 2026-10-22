package constants;

import java.time.Duration;

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
     * URL админки сервиса.
     */
    public static final String URL_ADMIN = "";
    /**
     * URL страницы с формой авторизации.
     */
    public static final String URL_LOGIN = "";
    /**
     * URL для 'Яндекс Переводчика'.
     */
    public static final String URL_TRANSLATE_YANDEX = "";
    /**
     * URL для swapi.
     */
    public static final String STAR_WARS_API = "";
    /**
     * URL для jsonplaceholder.
     */
    public static final String JSON_PLACE_HOLDER = "";

    /**
     * Длительность неявного ожидания в секундах.
     */
    public static final int IMPLICIT_WAIT = 4;
    /**
     * Длительность явного ожидания в секундах.
     */
    public static final Duration EXPLICIT_WAIT = Duration.ofSeconds(10);
}
