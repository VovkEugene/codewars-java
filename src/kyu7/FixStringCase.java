package kyu7;

import java.util.HashMap;

/**
 * ������� ������� �����
 * <p>
 * � ���� ���� ��� ����� ���� ������, � ������� ����� ���� ������� ��������� � �������� �����,
 * � ���� ������ - ������������� ��� ������ ���� � ��������, ���� � ��������� �����, ����������� ��:
 * 1. ������� ��� ����� ������ ���������.
 * 2. ���� ������ �������� ������ ���������� ��������� � �������� ����,
 * ������������ ������ � ������ �������.
 */
public class FixStringCase {
    public static String solve(final String str) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("lowercase", 0);
        map.put("uppercase", 0);

        for (char letter : str.toCharArray()) {
            if (Character.isUpperCase(letter)) {
                map.compute("uppercase", (k, v) -> v + 1);
            } else {
                map.compute("lowercase", (k, v) -> v + 1);
            }
        }

        return map.get("lowercase") >= map.get("uppercase")
                ? str.toLowerCase()
                : str.toUpperCase();
    }
}
