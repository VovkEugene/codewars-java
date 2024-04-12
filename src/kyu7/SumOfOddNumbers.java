package kyu7;

/**
 * ����� �������� �����
 * <p>
 * ��� ����������� �� ���������������� �������� �����:
 * -------------1------------
 * ----------3-----5---------
 * -------7-----9----11------
 * ---13----15----17----19---
 * 21----23----25----27----29
 * ...
 * ��������� ����� ����� � n-� ������ ����� ������������ (������� � ������� 1), ��������:
 * 1 -->  1
 * 2 --> 3 + 5 = 8
 */
public class SumOfOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int count = 1;
        int result = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {

                if (i == n) {
                    result += count;
                }

                count += 2;
            }
        }

        return result;
    }
}
