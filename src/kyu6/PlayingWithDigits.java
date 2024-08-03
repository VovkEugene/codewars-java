package kyu6;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;
import static java.lang.String.valueOf;

/**
 * ���� � �������.
 * <p>
 * ��������� ����� ����� �������� ��������. ��������:
 * <p>
 * 89 --> 8? + 9? = 89 * 1
 * 695 --> 6? + 9? + 5? = 1390 = 695 * 2
 * 46288 --> 4? + 6?+ 2? + 8? + 8? = 2360688 = 46288 * 51
 * �������� ��� ������������� ����� ����� n � p,
 * �� ����� ����� ����� ������������� ����� k,
 * ���� ��� ����������, �����, ��� ����� ���� n,
 * ����������� � ���������������� �������, ������� � p, ����� k * n.
 * <p>
 * ������� �������, ������� ���������������� ����� n ��� a, b, c, d ...,
 * ���������� �� ����� ����� k �����, ���:
 * <p>
 * � ���� ������ �� ������ k, ���� ���, ������ -1.
 * <p>
 * ����������: n � p ������ ����� ������ �������������� ������ �������.
 */
public class PlayingWithDigits {
    public static void main(String[] args) {
        System.out.println(digPow(89, 1));
        System.out.println(digPow(92, 1));
        System.out.println(digPow(46288, 3));
    }

    public static long digPow(int n, int p) {
        var value = valueOf(n).split("");
        var sum = 0;

        for (String item : value) {
            sum += pow(parseInt(item), p++);
        }

        if (sum % n == 0) {
            return sum / n;
        }

        return -1;
    }
}
