package kyu7;

import java.util.HashSet;

/**
 * Изограммы
 *
 * Изограмма - это слово, в котором нет повторяющихся букв, последовательных или непоследовательных.
 * Реализуйте функцию, которая определяет, является ли строка, содержащая только буквы, изограммой.
 * Предположим, что пустая строка является изограммой. Игнорируйте регистр букв.
 * 
 * isIsogram "Dermatoglyphics" = true
 * isIsogram "moOse" = false
 * isIsogram "aba" = false
 */
public class Isograms {
    public static boolean isIsogram(String str) {
        HashSet<Character> set = new HashSet<>();

        char[] chars = str.toLowerCase().toCharArray();

        for (char ch : chars) {
            set.add(ch);
        }

        return set.size() == str.length();
//        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}
