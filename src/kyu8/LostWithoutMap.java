package kyu8;

import java.util.Arrays;

/**
 * Заблудился без карты
 * <p>
 * Дан массив целых чисел, верните новый массив, в котором каждое значение удваивается.
 * <p>
 * For example:
 * [1, 2, 3] --> [2, 4, 6]
 */
public class LostWithoutMap {
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(item -> item << 1).toArray();
    }
}
