package kyu7;

import java.util.Set;
import java.util.TreeSet;

/**
 * ƒвое против одного
 * <p>
 * ¬озьмем 2 строки s1 и s2, содержащие только буквы от a до z.
 * ¬ернем новую отсортированную строку,
 * как можно более длинную, содержащую отдельные буквы,
 * кажда€ из которых беретс€ только один раз, начина€ с s1 или s2.
 * <p>
 * Examples:
 * a = "xyaabbbccccdefww"
 * b = "xxxxyyyyabklmopq"
 * longest(a, b) -> "abcdefklmopqwxy"
 * <p>
 * a = "abcdefghijklmnopqrstuvwxyz"
 * longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
 */
public class TwoToOne {
    public static String longest(String s1, String s2) {
        TreeSet<String> set = new TreeSet<>();

        addSet(set, s1);
        addSet(set, s2);

        return setToString(set);
    }

    static void addSet(Set<String> set, String string) {
        for (char letter : string.toCharArray()) {
            set.add(String.valueOf(letter));
        }
    }

    static String setToString(Set<String> set) {
        StringBuilder sb = new StringBuilder(set.size());

        for (String letter : set) {
            sb.append(letter);
        }

        return sb.toString();
    }
}
