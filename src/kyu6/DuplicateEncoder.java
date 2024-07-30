package kyu6;

import java.util.HashSet;

import static java.util.stream.Collectors.joining;

/**
 * �������� �����������
 * <p>
 * ���� ����� ���������� � ������������� ������ � ����� ������,
 * ��� ������ ������ � ����� ������ ����� �(�,
 * ���� ���� ������ ����������� � �������� ������ ������ ���� ���, ��� �)�,
 * ���� ���� ������ ����������� � �������� ������ ����� ������ ����. ������������ ������.
 * <p>
 * ����������� ��������� ����� ��� ����������� ����, �������� �� ������ ����������.
 * <p>
 * Examples
 * "din"      =>  "((("
 * "recede"   =>  "()()()"
 * "Success"  =>  ")())())"
 * "(( @"     =>  "))(("
 */
public class DuplicateEncoder {
    public static void main(String[] args) {
        System.out.println(encode("din"));
        System.out.println(encode("recede"));
        System.out.println(encode("Success"));
        System.out.println(encode("(( @"));
        System.out.println(encode("Prespecialized"));
        System.out.println(encode("   ()(   "));
    }

    static String encode(String word) {
        word = word.toLowerCase();
        var duplicate = getDuplicate(word);

        return getEncodeString(word, duplicate);
    }

    private static String getEncodeString(String word, String duplicate) {
        var result = new StringBuilder();

        for (String item : word.split("")) {
            if (duplicate.contains(item)) {
                result.append(')');
            } else {
                result.append('(');
            }
        }

        return result.toString();
    }

    private static String getDuplicate(String word) {
        var set = new HashSet<Character>();
        var duplicate = new HashSet<Character>();

        for (char item : word.toCharArray()) {
            if (set.contains(item)) {
                duplicate.add(item);
            }

            set.add(item);
        }

        return getString(duplicate);
    }

    private static String getString(HashSet<Character> duplicate) {
        return duplicate.stream()
                .map(String::valueOf)
                .collect(joining(""));
    }
}
