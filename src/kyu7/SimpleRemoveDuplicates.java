package kyu7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Удалите дубликаты из списка целых чисел,
 * сохранив последнее (крайнее правое) вхождение каждого элемента.
 * Example:
 * For input: [3, 4, 4, 3, 6, 3]
 * remove the 3 at index 0
 * remove the 4 at index 1
 * remove the 3 at index 3
 * Expected output: [4, 6, 3]
 */
public class SimpleRemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{3, 4, 4, 3, 6, 3})));
    }

    public static int[] solve(int[] arr) {
        List<Integer> list = Arrays.stream(arr)
                .boxed()
                .collect(toList());
        Collections.reverse(list);
        list = list.stream()
                .distinct()
                .collect(toList());
        Collections.reverse(list);
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
