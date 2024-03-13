package kyu8;

/**
 * Возврат отрицательный
 * <p>
 * В этом простом задании вам дается число, и вы должны сделать его отрицательным.
 * Но, может быть, число уже отрицательное?
 * Examples
 * Kata.makeNegative(1);   return -1
 * Kata.makeNegative(-5);  return -5
 * Kata.makeNegative(0);   return 0
 */
public class ReturnNegative {
    public static int makeNegative(final int x) {
        return x <= 0 ? x : x * -1;
    }
}
