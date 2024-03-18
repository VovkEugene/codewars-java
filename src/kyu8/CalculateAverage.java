package kyu8;

import java.util.Arrays;

/**
 * Вычислить среднее значение
 *
 * Напишите функцию, которая вычисляет среднее значение чисел в заданном списке.
 * Примечание: Пустые массивы должны возвращать 0.
 */
public class CalculateAverage {
    public static double find_average(int[] array) {
        return Arrays.stream(array).average().orElse(0);
    }
}
