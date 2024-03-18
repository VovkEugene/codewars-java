package kyu8;

import java.util.Arrays;

/**
 * Уменьшать, но расти
 * 
 * Дан непустой массив целых чисел, верните результат умножения значений по порядку.
 * Пример:
 * [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
 */
public class ReduceButGrow {
    public static int grow(int[] x) {
        return Arrays.stream(x).reduce((acc, value) -> acc * value).orElse(0);
    }
}
