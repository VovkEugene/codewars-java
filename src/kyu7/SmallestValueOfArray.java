package kyu7;

import java.util.Arrays;

/**
 * Наименьшее значение массива
 * <p>
 * Напишите функцию, которая может возвращать наименьшее значение массива или индекс этого значения.
 * Второй параметр функции скажет, должна ли она возвращать значение или индекс.
 * <p>
 * Предположим, что первый параметр всегда будет массивом, заполненным как минимум одним числом и без дубликатов.
 * Предположим, что второй параметр будет строкой, содержащей одно из двух значений: «значение» и «индекс».
 * <p>
 * Несколько примеров:
 * ([1,2,3,4,5], "value") should return 1
 * ([1,2,3,4,5], "index") should return 0
 */
public class SmallestValueOfArray {
    public static void main(String[] args) {

        findSmallest(new int[] {1, 2, 3, 4, 5}, "value");
        findSmallest(new int[] {1, 2, 3, 4, 5}, "index");
    }

    public static int findSmallest(int[] numbers, String mode) {
        int result;
        switch (mode) {
            case "value" -> result = findSmallestValue(numbers);
            case "index" -> result = findSmallestIndex(numbers);
            default -> throw new IllegalArgumentException("Something went wrong");
        }
        return result;
    }

    public static int findSmallestValue(int[] numbers) {
        return Arrays.stream(numbers).min().orElseThrow();
    }

    public static int findSmallestIndex(int[] numbers) {
        int result = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[result]) {
                result = i;
            }
        }
        return result;
    }
}
