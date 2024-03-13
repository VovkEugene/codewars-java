package kyu8;

import java.util.Arrays;

/**
 * Сумма положительных
 * <p>
 * Вы получаете массив чисел, возвращаете сумму всех положительных значений.
 * Пример [1,-4,7,12] => 1 + 7 + 12 = 20
 * Примечание: если суммировать нечего, сумма по умолчанию равна 0.
 */
public class SumOfPositive {
    public static int sum(int[] arr) {
        return Arrays.stream(arr)
                .filter(item -> item > 0)
                .sum();
    }
}
