package kyu7;

import java.util.HashMap;
import java.util.Map;

/**
 * ������� ��������� �����
 * ----------------------------------
 * ��� ������ ����� ����� �������� �����, � ������� ��� ��� ���������,
 * �� ����������� ������ ������������� �����.
 * ��������� �����, ������� ��������� ����� ������
 * � ���������� ��� ������������ ������ �����.
 * ----------------------------------
 * ������� ������ ������ ����� ��������������! (�������� ����� >= 3)
 * Examples
 * [1, 1, 2] ==> 2
 * [17, 17, 3, 17, 17, 17, 17] ==> 3
 */
public class FindStrayNumber {
    static int stray(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        final int duplicate = 2;
        final int notDuplicate = 1;
        int result = 0;

        for (int number : numbers) {
            if (map.containsKey(number)) {
                map.put(number, duplicate);
            } else {
                map.put(number, notDuplicate);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) == notDuplicate) {
                result = key;
            }
        }

        return result;
    }
}
