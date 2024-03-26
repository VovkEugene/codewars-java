package kyu7;

import java.util.Arrays;

/**
 * Порядок убывания
 * <p>
 * Ваша задача - создать функцию, которая может принимать любое неотрицательное целое число
 * в качестве аргумента и возвращать его с цифрами в порядке убывания.
 * По сути, переставьте цифры, чтобы получить максимально возможное число.
 */
public class DescendingOrder {
    public static int sortDesc(final int num) {
        char[] array = String.valueOf(num).toCharArray();

        Arrays.sort(array);

        return Integer.parseInt(
                new StringBuilder(String.valueOf(array))
                        .reverse()
                        .toString()
        );
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(42145));
        System.out.println(sortDesc(145263));
        System.out.println(sortDesc(123456789));
        ;
    }
}
