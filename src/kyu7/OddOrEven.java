package kyu7;

import java.util.Arrays;

/**
 * „етное или нечетное
 * <p>
 * ƒан список целых чисел, определите, €вл€етс€ ли сумма его элементов нечетной или четной.
 * ”кажите свой ответ в виде строки, соответствующей "нечетному" или "четному" значению.
 * ≈сли входной массив пуст, рассмотрите его как: [0] (массив с нулем).
 * -----------------
 * Examples:
 * Input: [0]
 * Output: "even"
 * <p>
 * Input: [0, 1, 4]
 * Output: "odd"
 * <p>
 * Input: [0, -1, -5]
 * Output: "even"
 */

public class OddOrEven {
    public static String oddOrEven(int[] array) {
        return sum(array) % 2 == 0
                ? "even"
                : "odd";
    }

    private static int sum(int[] array) {
        return Arrays.stream(array)
                .reduce(Integer::sum)
                .orElse(0);
    }
}
