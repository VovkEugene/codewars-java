package kyu6;

import java.util.Arrays;

/**
 * �������� �����, ������� ��������� ������ ����� (����� ����� ��� ������) � ������� �����.
 * �� ������ ����� � ������� ��� ������ ��������, ������� ��� �������� ���� ������� ��������.
 * ������� ���� ��������� ����� ������ ���� ���������� � ������ ��������� �������:
 * (������1, ������2).
 * <p>
 * ��� ����� ������� ���� ��������� ����� ����� ����� ��������� �������;
 * ����� �������������� ������� ����� �������.
 * <p>
 * ���� ������ ����� �������������� (����� ����� ������������ ����� ������ ������ 2 ��� ������,
 * � ��� �������� ����� �������;
 * ���� ������ ����� ������ ���� ������ ��������� �� ����� �������).
 */
public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3}, 4)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int lengthArray = numbers.length;

        for (int i = 0; i < lengthArray; i++) {
            for (int j = 0; j < lengthArray; j++) {
                if (i != j && numbers[i] + numbers[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }
}
