package kyu8;

import java.util.Arrays;

/**
 * Вам нужен только один
 *
 * Вам будет предоставлен массив a и значение x.
 * Все, что вам нужно сделать, это проверить, содержит ли предоставленный массив значение.
 * Массив может содержать числа или строки.
 * X может быть любым из них.
 * Верните true, если массив содержит значение или false, если нет.
 */
public class YouOnlyNeedOne {
    public static boolean check(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }
}
