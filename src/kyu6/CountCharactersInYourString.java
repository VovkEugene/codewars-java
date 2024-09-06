package kyu6;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Подсчет символов в строке
 * <p>
 * Основная идея состоит в подсчете всех встречающихся символов в строке.
 * Если у вас есть строка типа aba, то результатом должно быть {'a': 2, 'b': 1}.
 * <p>
 * Что делать, если строка пуста? Тогда результатом должен быть пустой литерал объекта {}.
 */
public class CountCharactersInYourString {
    public static void main(String[] args) {
        System.out.println(count("aba"));
        System.out.println(count(""));
        System.out.println(count("a"));
        System.out.println(count("aabbbac"));
        System.out.println(count("aaaaa"));
        System.out.println(count("aabb"));

    }


//    public static Map<Character, Integer> count(String str) {
//        var map = new HashMap<Character, Integer>();
//        var letters = str.toCharArray();
//        int one = 1;
//
//        for (var letter : letters) {
//            if (map.containsKey(letter)) {
//                map.put(letter, map.get(letter) + one);
//            } else {
//                map.put(letter, one);
//            }
//        }
//        return map;
//    }

    public static Map<Character, Integer> count(String str) {
        return str
                .chars()
                .mapToObj(character -> (char) character)
                .collect(Collectors.toMap(key -> key, value -> 1, Integer::sum));
    }
}
