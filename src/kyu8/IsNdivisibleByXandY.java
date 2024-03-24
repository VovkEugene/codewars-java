package kyu8;

/**
 * Делится ли n на x и y
 * 
 * Создайте функцию, которая проверяет, делится ли число n на два числа x И y.
 * Все входные данные являются положительными, ненулевыми числами.
 */
public class IsNdivisibleByXandY {
    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }
}
