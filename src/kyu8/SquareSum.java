package kyu8;

import java.util.Arrays;

/**
 * Сумма квадратов(n)
 * <p>
 * Завершите функцию square sum таким образом,
 * чтобы она возводила в квадрат каждое переданное в нее число,
 * а затем суммировала результаты вместе.
 */

public class SquareSum {
    public static int squareSum(int[] n) {
        return Arrays.stream(n).map(item -> item * item).sum();
    }
}
