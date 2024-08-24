package kyu6;

import java.util.Arrays;

/**
 * Сортируйте лишнее
 * <p>
 * Вам будет предоставлен массив чисел.
 * Вам нужно отсортировать нечетные числа в порядке возрастания,
 * оставив четные числа на исходных позициях.
 */
public class SortOdd {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{7, 1})));
        System.out.println(Arrays.toString(sortArray(new int[]{5, 8, 6, 3, 4})));
        System.out.println(Arrays.toString(sortArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})));
        System.out.println(Arrays.toString(sortArray(new int[]{5, 3, 2, 8, 1, 4})));
        System.out.println(Arrays.toString(sortArray(new int[]{5, 3, 1, 8, 0})));
        System.out.println(Arrays.toString(sortArray(new int[]{})));

    }

    public static int[] sortArray(int[] array) {
        int index = 0;
        int arrayLength = array.length;
        int[] oddSortArray = getOddSortArray(array);

        for (int i = 0; i < arrayLength; i++) {
            if (isOdd(array[i])) {
                array[i] = oddSortArray[index++];
            }
        }

        return array;
    }

    private static int[] getOddSortArray(int[] array) {
        return Arrays.stream(array)
                .filter(item -> isOdd(item))
                .sorted()
                .toArray();
    }

    private static boolean isOdd(int a) {
        return a % 2 != 0;
    }
}


