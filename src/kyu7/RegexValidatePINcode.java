package kyu7;

/**
 * Регулярное выражение проверяет PIN-код
 * <p>
 * Банкоматы допускают использование 4- или 6-значных PIN-кодов,
 * а PIN-коды не могут содержать ничего, кроме 4- или 6-значных цифр.
 * <p>
 * Если функции передана действительная строка PIN-кода, верните значение true,
 * в противном случае верните значение false.
 */
public class RegexValidatePINcode {
    public static boolean validatePin(String pin) {
        return pin.matches("^\\d{4}$|^\\d{6}$");
    }
}
