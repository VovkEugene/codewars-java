package kyu8;

import java.util.Arrays;

/**
 * Количество положительных результатов / сумма отрицательных
 * <p>
 * Дан массив целых чисел.
 * Верните массив, где первый элемент - количество положительных чисел,
 * а второй элемент - сумма отрицательных чисел.
 * 0 не является ни положительным, ни отрицательным.
 * Если входные данные представляют собой пустой массив или равно null, верните пустой массив.
 */
public class CountOfPositivesAndSumOfNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }

        int[] result = new int[2];

        result[0] = (int) Arrays.stream(input).filter(item -> item > 0).count();
        result[1] = Arrays.stream(input).filter(item -> item < 0).sum();

        return result;
    }
}
