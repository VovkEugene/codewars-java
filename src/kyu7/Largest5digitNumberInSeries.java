package kyu7;

import java.util.ArrayList;

/**
 * ����� ������� 5-������� ����� � �����
 * ----------------------------------------------------
 * � ��������� 6-������� ������:
 * 283910
 * 91 - ��� ���������� ������������������ �� 2 ���������������� ����.
 * ----------------------------------------------------
 * � ��������� 10-������� �����:
 * 1234567890
 * 67890 - ��� ���������� ������������������ �� 5 ���������������� ����.
 * ----------------------------------------------------
 * ��������� ������� ���, ����� ��� ���������� ���������� ������������������
 * �� ���� ���������������� ����, ��������� � �������� ��������� �����.
 * ����� ����� �������� � ���� ������, ��������� ������ �� ����.
 * ��� ������ ���������� ����� ����� �� ���� ����.
 * ���������� ����� ����� ��������� �� 1000 ����.
 */
public class Largest5digitNumberInSeries {
    public static int solve(final String digits) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb;
        int start = 0;
        int end = 5;

        while (start < digits.length()) {
            sb = new StringBuilder();

            for (int i = start; i < digits.length(); i++) {
                if (sb.length() == end) {
                    break;
                }

                sb.append(digits.charAt(i));
            }

            list.add(sb.toString());

            start++;
        }

        return Integer.parseInt(
                list.stream()
                        .filter(item -> item.length() == 5)
                        .max(String::compareTo)
                        .get()
        );
    }
}
