package kyu6;

import java.util.Objects;

import static java.lang.Character.isDigit;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

/**
 * ��� �����, ����������
 * <p>
 * ���� ������ � ������������� �������� ������.
 * ������ ����� � ������ ����� ��������� ���� �����.
 * ��� ����� ���������� �������, ������� ����� ������ �������� � ����������.
 * <p>
 * ����������. ����� ����� ���� �� 1 �� 9.
 * ����� �������, ������ ������ ����� 1 (� �� 0).
 * <p>
 * ���� ������� ������ �����, ������� ������ ������.
 * ����� �� ������� ������ ����� ��������� ������ ���������� ���������������� �����.
 * <p>
 * Examples
 * "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
 * "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
 * ""  -->  ""
 */
public class YourOrderPlease {
    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
    }

    public static String order(String words) {
        if (words.length() == 0) {
            return "";
        }

        String[] array = getSortedStringArray(words);

        return getString(array);
    }

    private static String[] getSortedStringArray(String words) {
        var array = new String[10];
        var strings = words.split(" ");
        int index = 0;

        for (String string : strings) {
            for (char item : string.toCharArray()) {
                if (isDigit(item)) {
                    index = parseInt(valueOf(item));
                }
            }

            array[index] = string;
        }
        return array;
    }

    private static String getString(String[] array) {
        return stream(array)
                .filter(Objects::nonNull)
                .collect(joining(" "));
    }
}
