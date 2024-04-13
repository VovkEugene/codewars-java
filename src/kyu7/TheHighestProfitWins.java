package kyu7;

import static java.util.Arrays.stream;

/**
 * ���������� ���, ��� ������� ���������� �������!
 * ----------------------------------------------
 * �������:
 * � ���� ���� ����� ������� ����, ��� �������� ��������� �������:
 * �� �������� ���-�� � ����� �������.
 * �������, ��� �� �������� �� ��� ������� �������,
 * ���� �� �� ������ ������� � �������� ��� �� ����� � ��� �� ����.
 * ������ ����� �� ���������� ������ ��� �� ��� ����� ����� ������ ���� � ������� �� ����� �������.
 * ----------------------------------------------
 * ������:
 * �������� �������, ������� ���������� ��� �����������, ��� � ������������ �����
 * �� ��������� ������/�������.
 * ----------------------------------------------
 * Examples (Input --> Output)
 * [1,2,3,4,5] --> [1,5]
 * [2334454,5] --> [5,2334454]
 * [1]         --> [1,1]
 * ----------------------------------------------
 * ���������:
 * ��� ������� ��� ������ ������ ����� ��������� ���� �� ���� �������,
 * ������� ��� �� ����� ��������� �����.
 * ����� ����, ���� ������� ������ ����� �������� ������ ��� ������,
 * ��� �� ����� ��������� ������� null, undefined ��� �������� ���������.
 */
public class TheHighestProfitWins {
    public static int[] minMax(int[] arr) {
        return new int[]{min(arr), max(arr)};
    }

    private static int min(int[] array) {
        return stream(array).min().orElse(0);
    }

    private static int max(int[] array) {
        return stream(array).max().orElse(0);
    }
}