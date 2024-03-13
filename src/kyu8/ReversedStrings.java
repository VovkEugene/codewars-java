package kyu8;

/**
 * Перевернутые строки
 * <p>
 * Завершите решение так, чтобы оно изменило переданную в него строку на противоположную.
 */

public class ReversedStrings {

    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
