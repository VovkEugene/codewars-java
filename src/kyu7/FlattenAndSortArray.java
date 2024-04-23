package kyu7;

import static java.util.Arrays.stream;

/**
 * ����������� � ���������� �������
 * ---------------------------------------------------------
 * ��� ��������� ������ ����� �����, ������� ���������� ������ ������� �� ����� ������ �������
 * � ��������������� (�� �����������) �������.
 * ---------------------------------------------------------
 * Example:
 * Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]],
 * your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9].
 */
public class FlattenAndSortArray {
    public static int[] flattenAndSort(int[][] array) {
        return stream(array)
                .flatMapToInt(ints -> stream(ints))
                .sorted()
                .toArray();
    }
}
