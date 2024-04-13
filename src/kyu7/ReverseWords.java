package kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * �������� �����
 * <p>
 * ��������� �������, ������� ��������� ��������� ��������
 * � �������� ������ ����� � ������ �� ���������������.
 * ��� ������� � ������ ������ ���� ���������.
 * Examples
 * "This is an example!" ==> "sihT si na !elpmaxe"
 * "double  spaces"      ==> "elbuod  secaps"
 */
public class ReverseWords {
    public static String reverseWords(final String original) {
        if (original.isBlank()) {
            return original;
        }

        String[] words = original.split(" ");

        return Arrays.stream(words)
                .map(word -> new StringBuilder()
                        .append(word)
                        .reverse())
                .collect(Collectors.joining(" "));
    }
}
