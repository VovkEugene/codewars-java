package kyu7;

import java.util.List;

import static java.util.Arrays.stream;

/**
 * ����������� ���������
 * --------------------------------------------------------
 * ��������� - ��� ��������� ������������ ���� � ����� ��� ��������� ������ ����� (��. ���������).
 * ����������: � ���������� ������� �� �����������
 * --------------------------------------------------------
 * ��������� �������, ����� ������� �������� true,
 * ���� ��� ����������� ��������� �������� ����������� ���� �����;
 * � ��������� ������ ������� �������� false.
 * Examples
 * "foefet" is an anagram of "toffee"
 * "Buckethead" is an anagram of "DeathCubeK"
 */
public class AnagramDetection {
    public static boolean isAnagram(String test, String original) {
        return test(test).equals(test(original));
    }

    static List<String> test(String string) {
        return stream(string.toLowerCase().split(""))
                .sorted()
                .toList();
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("foefet", "toffee"));
        System.out.println(isAnagram("Buckethead", "DeathCubeK"));
        System.out.println(isAnagram("Twoo", "Woot"));
        System.out.println(isAnagram("apple", "pale"));
    }
}
