package kyu8;

/**
 * Обратная последовательность
 *
 * Создайте функцию, которая возвращает массив целых чисел от n до 1, где n>0.
 *
 * Пример: n=5 --> [5,4,3,2,1]
 */
public class ReversedSequence {
    public static int[] reverse(int n) {
        int[] array = new int[n];

        for (int i = 1; i <= n; i++) {
            array[array.length - i] = i;
        }

        return array;
    }
}
