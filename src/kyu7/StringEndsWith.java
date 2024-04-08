package kyu7;

/**
 * Строка заканчивается на?
 * <p>
 * Завершите решение так, чтобы оно возвращало значение true,
 * если первый переданный аргумент (строка) заканчивается вторым аргументом (также строкой).
 */
public class StringEndsWith {
    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }
}
