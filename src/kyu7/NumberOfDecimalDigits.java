package kyu7;

/**
 * ���������� ���������� ��������
 * -------------------------------------------------
 * ���������� ����� ���������� ���� � ����� ����� (n>=0),
 * �������� � �������� ������� ������ ��� �������.
 * ��������, 9 - ��� ��������� �����, 66 ������� �� 2 ����, � 128685 - �� 6 ����.
 * ������ ���������, ����� �������� overflows/underflows.
 */
public class NumberOfDecimalDigits {
    public static int Digits(long n) {
        int count = 0;

        String number = String.valueOf(n);

        for (int i = 0; i < number.length(); i++) {
            if(Character.isDigit(number.charAt(i))){
                count++;
            }
        }

        return count;
    }
}
