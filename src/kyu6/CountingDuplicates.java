package kyu6;

import java.util.HashMap;

/**
 * Подсчет дубликатов
 * <p>
 * Подсчитайте количество дубликатов
 * Напишите функцию, которая будет возвращать
 * количество различных буквенных символов и числовых цифр,
 * не зависящих от регистра,
 * которые встречаются во входной строке более одного раза.
 * <p>
 * Можно предположить, что входная строка содержит только буквы алфавита
 * (как прописные, так и строчные) и числовые цифры.
 * <p>
 * Example
 * "abcde" -> 0 # no characters repeats more than once
 * "aabbcde" -> 2 # 'a' and 'b'
 * "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
 * "indivisibility" -> 1 # 'i' occurs six times
 * "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
 * "aA11" -> 2 # 'a' and '1'
 * "ABBA" -> 2 # 'A' and 'B' each occur twice
 */
public class CountingDuplicates {
    public static void main(String[] args) {
        System.out.println(duplicateCount("abcde"));
        System.out.println(duplicateCount("aabbcde"));
        System.out.println(duplicateCount("aabBcde"));
        System.out.println(duplicateCount("indivisibility"));
        System.out.println(duplicateCount("Indivisibilities"));
        System.out.println(duplicateCount("aA11"));
        System.out.println(duplicateCount("ABBA"));
    }

    public static int duplicateCount(String text) {
        var map = getMap(text);

        return (int) map.values().stream()
                .filter(item -> item > 1)
                .count();
    }

    private static HashMap<Character, Integer> getMap(String text) {
        var map = new HashMap<Character, Integer>();

        for (char item : text.toLowerCase().toCharArray()) {
            int counter = 1;

            if (map.containsKey(item)) {
                map.put(item, counter++);
            }

            map.put(item, counter);
        }

        return map;
    }
}
