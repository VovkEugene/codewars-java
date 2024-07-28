package kyu6;

import java.util.HashMap;

/**
 * Найдите нечетное целое число
 * <p>
 * Учитывая массив целых чисел, найдите то, которое встречается нечетное количество раз.
 * <p>
 * Всегда будет только одно целое число, которое появляется нечетное количество раз.
 * <p>
 * Examples
 * [7] should return 7, because it occurs 1 time (which is odd).
 * [0] should return 0, because it occurs 1 time (which is odd).
 * [1,1,2] should return 2, because it occurs 1 time (which is odd).
 * [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
 * [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
 */
public class FindTheOddInt {
    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
        System.out.println(findIt(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}));
        System.out.println(findIt(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}));
        System.out.println(findIt(new int[]{10}));
        System.out.println(findIt(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}));
        System.out.println(findIt(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10}));
    }

    public static int findIt(int[] array) {
        var map = new HashMap<Integer, Integer>();

        for (int item : array) {
            if (!map.containsKey(item)) {
                map.put(item, 1);
            } else {
                map.put(item, map.get(item) + 1);
            }
        }

        for (var value : map.entrySet()) {
            if (value.getValue() % 2 != 0) {
                return value.getKey();
            }
        }

        return 0;
    }

    //public static int findIt(int[] arr) {
    //    return stream(arr).reduce(0, (x, y) -> x ^ y);
    //  }
}
