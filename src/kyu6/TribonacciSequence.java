package kyu6;

import java.util.Arrays;

import static java.util.Arrays.copyOf;

/**
 * ������������������ ����������
 * <p>
 * ���������, �� �������� ��������� 3 (������ 2)
 * ����� ������������������ ��� ��������� ���������.
 * <p>
 * ����, ���� �� ����� ������ ���� ������������������ ���������� � [1, 1, 1]
 * � �������� ���������� �����, � ��� ����� ����� ������������������:
 * [1, 1, 1, 3, 5, 9, 17, 31, ...]
 * <p>
 * �� ���, ���� �� ������ � [0, 0, 1] � �������� �������?
 * ��������� ������ � [0, 1] ������ [1, 1]
 * �� �������� �������� ������� ������������������ ��������� �� ���� �������,
 * � ��� ����� ���������� ������� ��������,
 * ��� �� ������� �� �� ������������������, ��������� �� 2 �������,
 * �� ��� �� ���, � �� �������:
 * [0, 0, 1, 1, 2, 4, 7, 13, 24, ...]
 * <p>
 * ��� �, ��, ��������, ��� ����������, �� ����� ������ �������:
 * ��� ����� ������� ������� ���������,
 * �������, �������� ������,
 * ���������� ������ n ��������� - ���������� �������
 * � ���������� ����� ������� ������������������.
 * <p>
 * ������� ������ ����� �������� �� 3 ����;
 * n ������ ����� ��������������� ������;
 * ���� n == 0, �� ������� ������ ������
 * � ������ ������ �� �����, ��� ���� �� �������;)
 */
public class TribonacciSequence {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(tribonacci(new double[]{1, 1, 1}, 10)));
        System.out.println(Arrays.toString(tribonacci(new double[]{0, 0, 1}, 10)));
        System.out.println(Arrays.toString(tribonacci(new double[]{0, 1, 1}, 10)));

        System.out.println(Arrays.toString(tribonacci(new double[]{9.0, 3.0, 19.0}, 8)));
        System.out.println(Arrays.toString(tribonacci(new double[]{9.0, 10.0, 0.0}, 37)));
        System.out.println(Arrays.toString(tribonacci(new double[]{6.0, 4.0, 10.0}, 16)));
        System.out.println(Arrays.toString(tribonacci(new double[]{3.0, 2.0, 0.0}, 10)));
        System.out.println(Arrays.toString(tribonacci(new double[]{16.0, 17.0, 2.0}, 34)));
        System.out.println(Arrays.toString(tribonacci(new double[]{7.0, 7.0, 2.0}, 21)));
        System.out.println(Arrays.toString(tribonacci(new double[]{2.0, 2.0, 15.0}, 1)));

        System.out.println(Arrays.toString(tribonacci(new double[]{4.0, 5.0, 12.0}, 0)));
        System.out.println(Arrays.toString(tribonacci(new double[]{4.0, 5.0, 12.0}, 3)));
        System.out.println(Arrays.toString(tribonacci(new double[]{4.0, 5.0, 12.0}, 2)));
        System.out.println(Arrays.toString(tribonacci(new double[]{4.0, 5.0, 12.0}, 1)));
    }

    public static double[] tribonacci(double[] s, int n) {
        var result = copyOf(s, n);

        for (int i = s.length; i < result.length; i++) {
            result[i] = result[i - 3]
                    + result[i - 2]
                    + result[i - 1];
        }

        return result;
    }

//    public static double[] tribonacci(double[] s, int n) {
//        if (n == 0) {
//            return new double[0];
//        }
//
//        var result = getDoubleList(s);
//
//        for (int i = 3; i < n; i++) {
//            double sumOfThree = result.get(i - 3)
//                    + result.get(i - 2)
//                    + result.get(i - 1);
//            result.add(sumOfThree);
//        }
//
//        return getDoubleArray(result);
//    }
//
//    private static ArrayList<Double> getDoubleList(double[] s) {
//        return new ArrayList<>(DoubleStream.of(s)
//                .boxed()
//                .toList());
//    }
//
//    private static double[] getDoubleArray(ArrayList<Double> result) {
//        return result.stream()
//                .mapToDouble(item -> item)
//                .toArray();
//    }
}
