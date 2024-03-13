package kyu8;

import java.util.Arrays;

/**
 * Найдите наименьшее целое число в массиве
 * <p>
 * Дан массив целых чисел, ваше решение должно найти наименьшее целое число.
 * Например:
 * Дано [34, 15, 88, 2], ваше решение вернет 2
 * Дано [34, -345, -1, 100], ваше решение вернет -345
 * Вы можете предположить, для целей этого ката, что предоставленный массив не будет пустым.
 */
public class FindSmallestIntegerInArray {
    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args)
                .min()
                .orElseThrow(() -> new RuntimeException("int[] is empty"));
    }
}
