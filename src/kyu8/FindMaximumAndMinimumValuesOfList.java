package kyu8;

import java.util.Arrays;

/**
 * Найдите максимальное и минимальное значения в списке
 * <p>
 * Ваша задача состоит в том, чтобы создать две функции
 * (max и min, или maximum и minimum и т.д.),
 * которые получают список целых чисел в качестве входных данных
 * и возвращают наибольшее и наименьшее число в этом списке соответственно.
 */
public class FindMaximumAndMinimumValuesOfList {
    public int min(int[] list) {
        int min = list[0];

        for (int item : list) {
            if (item < min) {
                min = item;
            }
        }

        return min;
//        return Arrays.stream(list).min().getAsInt();
    }

    public int max(int[] list) {
        int max = list[0];

        for (int item : list) {
            if (item > max) {
                max = item;
            }
        }

        return max;
//        return Arrays.stream(list).max().getAsInt();
    }
}
