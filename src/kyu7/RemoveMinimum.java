package kyu7;

import static java.util.Arrays.stream;

/**
 * ������� �����������
 * ------------------------------------------------------------------------
 * ����� ���������� ������� ����� ����� ���������� �� ��������� ����������.
 * ������, ���������� �� ����������, ����������� ����, ��� ������ ����� ������� ���������.
 * ��� ���������� �� �������, � ����� ������� ���, � �������� ����� ������ �������.
 * ������, ��� ������ ��� ��������� ��������� ��� ���������, ��� ����������� �� ������ ��������,
 * ������� ��� ������ ��� �������� ���������, ������� �������� �� �� ������ ����������
 * ����� �������� ������ ������� �� ���. �����������.
 * ------------------------------------------------------------------------
 * ������:
 * ��� ������ ����� �����, ������� ���������� ��������.
 * �� ��������� �������� ������/������.
 * ���� ���� ��������� ��������� � ���������� ���������, ������� ���, � �������� ���������� ������.
 * ���� �� ��������� ������ ������/������, ������� ������ ������/������.
 * ------------------------------------------------------------------------
 * �� ������� ������� ������������ ���������� ���������.
 * Examples
 * * Input: [1,2,3,4,5], output = [2,3,4,5]
 * * Input: [5,3,2,1,4], output = [5,3,2,4]
 * * Input: [2,2,1,2,1], output = [2,2,2,1]
 */
public class RemoveMinimum {
    public static int[] removeSmallest(int[] numbers) {
        if (numbers.length == 0) {
            return numbers;
        }

        int numberSmallest = findIndex(numbers, min(numbers));

        return removeElementFromArray(numbers, numberSmallest);
    }

    private static int min(int[] array) {
        return stream(array)
                .reduce(Integer::min)
                .orElse(0);
    }

    private static int findIndex(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }

    private static int[] removeElementFromArray(int[] array, int element) {
        int[] temp = new int[array.length - 1];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == element) {
                continue;
            }

            temp[index++] = array[i];
        }

        return temp;
    }
}
