package kyu7;

import java.util.HashMap;

/**
 * Исправь регистр строк
 * <p>
 * В этом ката вам будет дана строка, в которой могут быть смешаны заглавные и строчные буквы,
 * и ваша задача - преобразовать эту строку либо в строчные, либо в заглавные буквы, основываясь на:
 * 1. Внесите как можно меньше изменений.
 * 2. Если строка содержит равное количество прописных и строчных букв,
 * преобразуйте строку в нижний регистр.
 */
public class FixStringCase {
    public static String solve(final String str) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("lowercase", 0);
        map.put("uppercase", 0);

        for (char letter : str.toCharArray()) {
            if (Character.isUpperCase(letter)) {
                map.compute("uppercase", (k, v) -> v + 1);
            } else {
                map.compute("lowercase", (k, v) -> v + 1);
            }
        }

        return map.get("lowercase") >= map.get("uppercase")
                ? str.toLowerCase()
                : str.toUpperCase();
    }
}
