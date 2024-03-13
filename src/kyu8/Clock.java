package kyu8;

/**
 * Часы
 *
 * Часы показывают h часов, m минут и s секунд после полуночи. *
 * Ваша задача - написать функцию, которая возвращает время с полуночи в миллисекундах.
 *
 * Example:
 * h = 0
 * m = 1
 * s = 1
 * result = 61000
 */
public class Clock {
    public static int Past(int h, int m, int s) {
        return h * 3600_000 + m * 60_000 + s * 1000;
    }
}
