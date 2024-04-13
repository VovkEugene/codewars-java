package kyu7;

import java.util.HashMap;
import java.util.Map;

/**
 * Найдите случайный номер
 * ----------------------------------
 * Дан массив целых чисел нечетной длины, в котором все они одинаковы,
 * за исключением одного единственного числа.
 * Выполните метод, который принимает такой массив
 * и возвращает это единственное другое число.
 * ----------------------------------
 * Входной массив всегда будет действительным! (нечетная длина >= 3)
 * Examples
 * [1, 1, 2] ==> 2
 * [17, 17, 3, 17, 17, 17, 17] ==> 3
 */
public class FindStrayNumber {
    static int stray(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        final int duplicate = 2;
        final int notDuplicate = 1;
        int result = 0;

        for (int number : numbers) {
            if (map.containsKey(number)) {
                map.put(number, duplicate);
            } else {
                map.put(number, notDuplicate);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) == notDuplicate) {
                result = key;
            }
        }

        return result;
    }
}
