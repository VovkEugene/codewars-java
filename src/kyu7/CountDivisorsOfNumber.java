package kyu7;

/**
 * Подсчитайте делители числа
 * --------------------------------------------------------------
 * Подсчитайте количество делителей целого положительного числа n.
 * Количество случайных тестов может достигать n = 500000.
 * Examples:
 * 4 --> 3 // we have 3 divisors - 1, 2 and 4
 * 5 --> 2 // we have 2 divisors - 1 and 5
 * 12 --> 6 // we have 6 divisors - 1, 2, 3, 4, 6 and 12
 * 30 --> 8 // we have 8 divisors - 1, 2, 3, 5, 6, 10, 15 and 30
 * --------------------------------------------------------------
 * Обратите внимание, что вы должны возвращать только число, количество делителей.
 * Числа в круглых скобках указаны только для того, чтобы вы могли видеть,
 * какие числа учитываются в каждом конкретном случае.
 */
public class CountDivisorsOfNumber {
    public long numberOfDivisors(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (isDivisor(n, i)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isDivisor(int divisor, int number) {
        return divisor % number == 0;
    }
}
