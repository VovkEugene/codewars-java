package kyu8;

import java.util.Arrays;

/**
 * Преобразовать число в обратный массив цифр
 * 
 * Дано случайное неотрицательное число,
 * вы должны вернуть цифры этого числа в массиве в обратном порядке.
 *
 * Example(Input => Output):
 * 35231 => [1,3,2,5,3]
 * 0 => [0]
 */
public class ConvertNumberToReversedArrayOfDigits {
    public static int[] digitize(long n) {
        String str = String.valueOf(n);

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        String[] array = sb.toString().split("");

        return Arrays.stream(array).mapToInt(Integer::parseInt).toArray();
    }
}
