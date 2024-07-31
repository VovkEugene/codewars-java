package kyu6;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ��������� �������������� ��������
 * <p>
 * �� ������ � ������ ��������,
 * ��� ��� ������ ����������� � ��������� �����.
 * �� ������ �� ������� �� ������ ����� ������
 * � ������ ��������������� ������������ �����������.
 * ����� ������������� ����� ��������� ����������
 * ��� �������� ������ �� �� ��������� �
 * ������ ���, ����� �� ��������� ������,
 * ��� ���������� ��� ������ ������������� �����,
 * �������������� ����������� ��� ������ (��������, ['n', 's', 'w', '�']).
 * �� ������ ��������� ������ ���� ������� ��� ������ ����� (�����������),
 * � �� ������, ��� ����������� ������ ���������� �������� �������� � ��� ���� ������.
 * <p>
 * C������� �������, ������� ����� ���������� true,
 * ���� ��������, ������� ���������� ��� ����������,
 * ������ � ��� ����� ������ ����� (�� �� ������ �� ������, �� �����!)
 * �, ������� ��, ������ ��� � �������� �����.
 * � ��������� ������ ������� false.
 * <p>
 * ����������. �� ������ �������� �������������� ������,
 * ���������� ��������� ����� ���� ����������� (������ �n�, �s�, �e� ��� �w�).
 * �� ������� �� ������ ��� ������ ������ (��� �� ��������, ��� ������� �� �����!).
 */
public class TakeTenMinutesWalk {
    public static void main(String[] args) {
        System.out.println(isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        System.out.println(isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
        System.out.println(isValid(new char[]{'w'}));
        System.out.println(isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }

    public static boolean isValid(char[] walk) {
        int tenMinutes = 10;

        if (walk.length != tenMinutes) {
            return false;
        }

        var mapDirections = getMapDirections(walk);

        return Objects.equals(mapDirections.get('n'), mapDirections.get('s'))
                && Objects.equals(mapDirections.get('e'), mapDirections.get('w'));
    }

    private static HashMap<Character, Integer> getMapDirections(char[] walk) {
        var mapDirections = new HashMap<>(
                Map.of('n', 0, 's', 0, 'e', 0, 'w', 0));

        for (char direction : walk) {
            if (mapDirections.containsKey(direction)) {
                mapDirections.put(direction, mapDirections.get(direction) + 1);
            }
        }

        return mapDirections;
    }
}
