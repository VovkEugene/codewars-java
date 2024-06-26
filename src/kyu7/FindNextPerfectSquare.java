package kyu7;

/**
 * ����� ��������� ��������� �������!
 * <p>
 * ��������, �� ������ ��������� �������� ������� ��������� ���������.
 * �� ��� ������ ����������?
 * ��������� ����� findNextSquare, ������� ������� ��������� ��������� �������
 * ����� ����������� � �������� ���������.
 * ��������, ��� ����� ��������� ��������� �������� ����� ����� n,
 * ��� ��� sqrt(n) ����� �������� ����� ������.
 * <p>
 * ���� �������� ��� �� ���� �� �������� ��������� ���������, �� ������� ���� -1,
 * ���� ������ ��������, �������� None ��� null, � ����������� �� ������ �����.
 * �� ������ ������������, ��� ���� �������� �������������.
 * Examples:
 * 121 --> 144
 * 625 --> 676
 * 114 --> -1 since 114 is not a perfect square
 */
public class FindNextPerfectSquare {
    public static long findNextSquare(long sq) {
        for (long i = 1; i <= sq; i++) {
            if (multiply(i) == sq) {
                ++i;

                return multiply(i);
            }
        }

        return -1;
    }

    static long multiply(long a) {
        return a * a;
    }
}
