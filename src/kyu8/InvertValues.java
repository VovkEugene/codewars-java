package kyu8;

import java.util.Arrays;

/**
 * Инвертировать значения
 * <p>
 * Дан набор чисел, верните аддитивное значение, обратное каждому.
 * Каждое положительное значение становится отрицательным,
 * а отрицательные значения становятся положительными.
 * <p>
 * invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
 * invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
 * invert([]) == []
 */
public class InvertValues {
    public static int[] invert(int[] array) {
        return Arrays.stream(array).map(item -> item * -1).toArray();
    }
}
