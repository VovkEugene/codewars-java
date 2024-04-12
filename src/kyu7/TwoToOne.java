package kyu7;

import java.util.Set;
import java.util.TreeSet;

/**
 * ���� ������ ������
 * <p>
 * ������� 2 ������ s1 � s2, ���������� ������ ����� �� a �� z.
 * ������ ����� ��������������� ������,
 * ��� ����� ����� �������, ���������� ��������� �����,
 * ������ �� ������� ������� ������ ���� ���, ������� � s1 ��� s2.
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
