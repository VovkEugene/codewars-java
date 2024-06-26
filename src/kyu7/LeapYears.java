package kyu7;

/**
 * ���������� ����
 * ------------------------------------------------------
 * � ���� ���� �� ������ ������ ����������, �������� �� ������ ��� ���������� ��� ���.
 * ���� �� �� ������ ������, ��� ���:
 * - ����, ������� 4, �������� �����������,
 * - �� ����, ������� 100, �� �������� �����������,
 * - � ����, ������� 400, �������� ����������� ������.
 * ------------------------------------------------------
 * ����������� ���� ��������� � ��������� 1600 ? ��� ? 4000.
 */
public class LeapYears {
    public static boolean isLeapYear(int year) {
        return year % 4 == 0
                && (year % 100 != 0 || year % 400 == 0);
    }
}
