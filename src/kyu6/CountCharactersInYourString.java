package kyu6;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * ������� �������� � ������
 * <p>
 * �������� ���� ������� � �������� ���� ������������� �������� � ������.
 * ���� � ��� ���� ������ ���� aba, �� ����������� ������ ���� {'a': 2, 'b': 1}.
 * <p>
 * ��� ������, ���� ������ �����? ����� ����������� ������ ���� ������ ������� ������� {}.
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
