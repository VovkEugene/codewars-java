package kyu7;

import java.util.ArrayList;

/**
 * ������������ �������
 * <p>
 * ������
 * ��� ������ ����� �����.
 * ������� ������������ �������,
 * ���������� � ���������� ��������� ���� �������� ����� � �������.
 * <p>
 * ����������
 * ������ �������/������ �� ����� 2. *
 * ����� �������/������ ����� ������������ ����� �����
 * �������������, ������������� � �����.
 * <p>
 * Input >> Output Examples:
 * <p>
 * adjacentElementsProduct([1, 2, 3]); ==> return 6
 * Explanation:
 * ������������ ������� ���������� � ���������� ��������� 2 * 3 = 6, � ��� �������� ����� � �������.
 * <p>
 * adjacentElementsProduct([9, 5, 10, 2, 24, -1, -48]); ==> return 50
 * Explanation:
 * ������������ ������������, ���������� � ���������� ��������� 5 * 10 = 50.
 * <p>
 * adjacentElementsProduct([-23, 4, -5, 99, -27, 329, -2, 7, -921])  ==>  return -14
 * Explanation:
 * ������������ �������, ���������� � ���������� ��������� -2 * 7 = -14, � ��� �������� ����� � �������.
 */
public class MaximumProduct {
    public static void main(String[] args) {
        System.out.println(adjacentElementsProduct(new int[]{1, 2, 3}));
        System.out.println(adjacentElementsProduct(new int[]{-5, 8}));
    }

    public static int adjacentElementsProduct(int[] array) {
        var list = new ArrayList<Integer>();

        for (int i = 1; i < array.length; i++) {
            list.add(array[i - 1] * array[i]);
        }

        return list.stream()
                .reduce(Integer::max)
                .orElse(0);
    }

    //public int adjacentElementsProduct(int[] array) {    //
    //    return IntStream.range(1, array.length)
    //                    .map(i -> array[i - 1] * array[i])
    //                    .max()
    //                    .getAsInt();
    //  }
}
