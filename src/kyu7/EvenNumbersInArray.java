package kyu7;

import java.util.ArrayList;
import java.util.List;

/**
 * Дан массив чисел, верните новый массив длины number,
 * содержащий последние четные числа из исходного массива (в том же порядке).
 * Исходный массив не будет пустым и будет содержать по крайней мере четные числа "number".
 * ---
 * ([1, 2, 3, 4, 5, 6, 7, 8, 9], 3) => [4, 6, 8]
 * ([-22, 5, 3, 11, 26, -6, -7, -8, -9, -8, 26], 2) => [-8, 26]
 * ([6, -25, 3, 7, 5, 5, 7, -3, 23], 1) => [6]
 */
public class EvenNumbersInArray {
    public static int[] evenNumbers(int[] array, int n) {
        List<Integer> result = new ArrayList<>();
        for (int number : array) {
            if (number % 2 == 0) {
                result.add(number);
            }
        }
        return result.stream()
                .skip(result.size() - n)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
