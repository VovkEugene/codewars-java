package kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * ������� ��������� ��������, ���� �� ����������� ����� n ���.
 * <p>
 * ����� � ��� ���� � �������.
 * ��� ��� ������� ����� ���������� ����, ��� ��������,
 * � ������ ��� ����� �������� ����� ��� ���� ���������.
 * ������ ����� �� �������� ����� ������, ��������� ����� ������ �����������.
 * ��� �� �������� ������ �������� ����� 40 ���.
 * �� ������� ��, ��� ����� �� ����� ������ � ��� ������,
 * ���� ��� ������� ���� � ��� �� ����� �� ����� N ���.
 * � �������, ����� � ��� ����� ������������ ����� � ���� �����.
 * ������ �� �� ������ �� ������� ����� ���,
 * ����� �� ������ �������� ������ ����� ������ �� N ���, �� ����� �������?
 * <p>
 * ������:
 * ��� ������ � �����,
 * ������� ����� ������, ������� ����� ��������� ������ ����� ������ �� ����� N ���,
 * ��� �������.
 * <p>
 * ��������, ���� ��������� ����� ����� 2,
 * � ������ �����: [1,2,3,1,2,1,2,3],
 * �� ������ [1,2,3,1,2],
 * ��������� ��������� [1,2],
 * ��� ��� ��� �������� � ����, ��� 1 � 2 �������� � ���������� 3 ����,
 * � ����� ������� 3, ��� �������� � [1,2,3,1,2,3].
 * �� ������� [20,37,20,21] � ������� 1 ����������� ����� [20,37,21].
 */
public class DeleteOccurrencesOfElement {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(deleteNth(new int[]{1, 1, 3, 3, 7, 2, 2, 2, 2}, 3)));
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        int counter;
        var map = new HashMap<Integer, Integer>();
        var resultList = new ArrayList<Integer>();

        for (int item : elements) {
            counter = map.getOrDefault(item, 0);
            if (counter < maxOccurrences) {
                resultList.add(item);
                map.put(item, counter + 1);
            }
        }

        return resultList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
