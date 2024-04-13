package kyu7;

import java.util.Arrays;

/**
 * ������ ��� ��������
 * <p>
 * ��� ������ ����� �����, ����������, �������� �� ����� ��� ��������� �������� ��� ������.
 * ������� ���� ����� � ���� ������, ��������������� "���������" ��� "�������" ��������.
 * ���� ������� ������ ����, ����������� ��� ���: [0] (������ � �����).
 * -----------------
 * Examples:
 * Input: [0]
 * Output: "even"
 * <p>
 * Input: [0, 1, 4]
 * Output: "odd"
 * <p>
 * Input: [0, -1, -5]
 * Output: "even"
 */

public class OddOrEven {
    public static String oddOrEven(int[] array) {
        return sum(array) % 2 == 0
                ? "even"
                : "odd";
    }

    private static int sum(int[] array) {
        return Arrays.stream(array)
                .reduce(Integer::sum)
                .orElse(0);
    }
}
