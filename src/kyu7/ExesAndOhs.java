package kyu7;

import java.util.HashMap;

/**
 * Проверьте, содержит ли строка одинаковое количество символов "x" и "o".
 * Метод должен возвращать логическое значение и не учитывать регистр.
 * Строка может содержать любой символ.
 */
public class ExesAndOhs {
//    public static boolean getXO(String str) {
//        int charX = 0;
//        int charO = 0;
//
//        char[] chars = str.toLowerCase().toCharArray();
//
//        for (char ch : chars) {
//            if (ch == 'x') {
//                charX++;
//            }
//            if (ch == 'o') {
//                charO++;
//            }
//        }
//
//        return charX == charO;
//    }

    public static boolean getXO(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        char[] chars = str.toLowerCase().toCharArray();

        for (char ch : chars) {
            if (ch == 'x' || ch == 'o') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        return map.getOrDefault('x', 0)
                .equals(map.getOrDefault('o', 0));
    }

//    static boolean getXO(String str) {
//        final Integer sum = str.chars()
//                .map(ch -> switch (Character.toLowerCase(ch)) {
//                    case 'x' -> 1;
//                    case 'o' -> -1;
//                    default -> 0;
//                })
//                .sum();
//        return sum.equals(0);
//    }
}
