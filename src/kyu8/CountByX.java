package kyu8;

/**
 * Подсчитайте по X
 *
 * Создайте функцию с двумя аргументами, которая вернет массив из первых n кратных x.
 * Предположим, что и заданное число, и количество раз для подсчета будут положительными числами,
 * большими 0.
 *
 * Верните результаты в виде массива или списка (в зависимости от языка).
 */
public class CountByX {
    public static int[] countBy(int x, int n) {
        int[] array = new int[n];
        int index = 0;
        int count = 1;

        while (index < n) {
            if (count % x == 0) {
                array[index++] = count;
            }

            count++;
        }

        return array;
    }
}
