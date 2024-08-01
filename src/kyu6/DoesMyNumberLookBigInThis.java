package kyu6;

/**
 * ��� ����� �������� ����� �������?
 * <p>
 * �������������� ����� (��� ����� ����������) � ��� ������������� �����,
 * ������� ������������ ����� ����� ����� ����,
 * ������ �� ������� ��������� � ������� ���������� ���� � ������ ���������.
 * � ���� ���� �� ����������� ���������� �������� ��������� (��������� 10).
 * <p>
 * ��������, ������� 153 (3 �����), ������� �������� ��������������:
 * 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
 * <p>
 * � 1652 (4 �����), ��� �� ��������:
 * 1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938
 * ������������:
 * <p>
 * ��� ��� ������ ���������� ������ ��� ����
 * � ����������� �� ����, �������� �� ������ ����� �������������� ������
 * �� ��������� 10.
 */
public class DoesMyNumberLookBigInThis {
    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));
        System.out.println(isNarcissistic(1634));
        System.out.println(isNarcissistic(112));
        System.out.println(isNarcissistic(1652));
    }

    public static boolean isNarcissistic(int number) {
        int temp = number;
        int result = 0;
        var length = String.valueOf(number).length();

        while (number > 0) {
            result += (int) Math.pow(number % 10, length);
            number /= 10;
        }

        return temp == result;
    }
}
