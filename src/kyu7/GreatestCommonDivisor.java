package kyu7;

import java.util.stream.IntStream;

import static java.lang.Math.min;

/**
 * ���������� ����� ��������
 * <p>
 * ������� ���������� ����� �������� ���� ����� ������������� �����.
 * ����� ����� ����� ���� ��������, ������� ��� ����� ����� ����� �������.
 * <p>
 * ������� ������ x � y ������ ������ ��� ����� 1,
 * ������� ���������� ����� �������� ������ ����� ����� ������,
 * ������� ����� ������ ��� ����� 1.
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(compute(30, 12));
        System.out.println(compute(8, 9));
//        System.out.println(compute(1, 1));
    }

    public static int compute(int x, int y) {
        return IntStream.rangeClosed(1, min(x, y))
                .filter(i -> x % i == 0 && y % i == 0)
                .max()
                .orElse(1);
    }


    //public static int compute(int x, int y) {
    //        return x % y == 0 ? y : compute(y, x % y);
    //    }
}
