package kyu6;

import java.util.HashMap;

/**
 * ������� ���������� �����
 * <p>
 * ������� ������ � ���������� �������.
 * ��� ����� �����, ����� ������. ���������� ����� ���!
 * <p>
 * Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
 * Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
 * �������������, ��� ������ �������� �� ����� 3 �����.
 * <p>
 * ����� �������� ����� �������� �������, ������� ��������� � ������������������.
 */
public class FindUniqueNumber {
    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));
        System.out.println(findUniq(new double[]{0, 0, 0.55, 0, 0}));
        System.out.println(findUniq(new double[]{0, 1, 0}));
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));
    }

    public static double findUniq(double arr[]) {
        var map = getMap(arr);

        return getKey(map);
    }

    private static HashMap<Double, Integer> getMap(double[] arr) {
        var map = new HashMap<Double, Integer>();

        for (var item : arr) {
            int counter = 0;

            if (map.containsKey(item)) {
                counter++;
            }

            map.put(item, counter);
        }

        return map;
    }

    private static Double getKey(HashMap<Double, Integer> map) {
        for (var item : map.entrySet()) {
            if (item.getValue() == 0) {
                return item.getKey();
            }
        }

        return null;
    }
}
