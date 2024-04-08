package kyu7;

/**
 * ����� �����
 * 
 * ���� ��� ����� ����� a � b, ������� ����� ���� �������������� ��� ��������������,
 * ������� ����� ���� ����� ����� ���� � ������� ��, � ������� ��.
 * ���� ��� ����� �����, ������� a ��� b.
 * �������� ��������: a � b �� �����������!
 * Examples (a, b) --> output (explanation)
 * (1, 0) --> 1 (1 + 0 = 1)
 * (1, 2) --> 3 (1 + 2 = 3)
 * (0, 1) --> 1 (0 + 1 = 1)
 * (1, 1) --> 1 (1 since both are same)
 * (-1, 0) --> -1 (-1 + 0 = -1)
 * (-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
 */
public class SumOfNumbers {
    static public int GetSum(int a, int b) {
        return a > b ? sum(b, a) : sum(a, b);
    }

    static int sum(int a, int b) {
        int result = 0;

        for (int i = a; i <= b; i++) {
            result += i;

        }

        return result;
    }
}
