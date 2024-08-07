package kyu6;

import static java.util.Arrays.stream;

/**
 * ������ ������� �������
 * <p>
 * ��������, ��� ��� ������ {1,2,3,4,3,2,1}:
 * ���� ������� ������ ������ 3,
 * ��������� � ������� ������� ������� ����� ����� ����� ������� ({1,2,3})
 * � ����� ������ ����� ������� ({3,2,1}) ��� ����� 6.
 * <p>
 * ������� ��������� �� ��� ����.
 * ��� ��� ������ {1,100,50,-51,1,1}:
 * ���� ������� ������ ������ 1,
 * ��������� � ������ ������� ������� ����� ����� ����� ������� ({1})
 * � ����� ������ ����� ������� ({50,-51,1, 1}) ��� ����� 1.
 * <p>
 * ���������:
 * ��� ��� ������ {20,10,-80,10,10,15,35}
 * � ������� 0 ����� ����� ����� {}
 * ������ ����� � {10,-80,10,10,15,35}.
 * ��� ��� ��� �������� ����� 0. (������ ������� � ���� ������ ����� 0)
 * ������ 0 � ��� �����, ��� ����� � ������ ������� �����.
 * <p>
 * ����������. �������, ��� � ����������� ������ ������ ������� ���������� � 0.
 * <p>
 * ����
 * ������������� ������ ������ 0 < arr < 1000.
 * ����� � ������� ����� ���� ������
 * ������ �������������� ��� �������������� �������.
 * <p>
 * �����
 * ���������� ������ N, ��� ������� ������� ����� �� N ����� ������� ������ �� N.
 * ���� �� �� ������� ������, ��������������� ���� ��������, �� ������� -1.
 * <p>
 * ����������
 * ���� ��� ��� ������ � ����������� ��������, ������� ���������� ���������� ������.
 */
public class EqualSidesOfArray {
    public static void main(String[] args) {
        System.out.println(findEvenIndex(new int[]{1, 2, 3, 4, 3, 2, 1}));
        System.out.println(findEvenIndex(new int[]{1, 100, 50, -51, 1, 1}));
        System.out.println(findEvenIndex(new int[]{1, 2, 3, 4, 5, 6}));
        System.out.println(findEvenIndex(new int[]{20, 10, 30, 10, 10, 15, 35}));
        System.out.println(findEvenIndex(new int[]{-8505, -5130, 1926, -9026}));
        System.out.println(findEvenIndex(new int[]{2824, 1774, -1490, -9084, -9696, 23094}));
        System.out.println(findEvenIndex(new int[]{4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
    }

    public static int findEvenIndex(int[] arr) {
        int sum = stream(arr).sum();
        int counterSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (counterSum == sum - arr[i]) {
                return i;
            }

            counterSum += arr[i];
            sum -= arr[i];
        }

        return -1;
    }
}
