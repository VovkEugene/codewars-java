package kyu7;

import java.util.Arrays;

/**
 * ����������� ���� �������!
 * <p>
 * ��� ������� ������ ������������, ��������� ������� ����, � ����� ����� ������� ������� ���� �����!
 * <p>
 * � ����� ������ ����� ������� ������� ������� �� ��� �������!
 * <p>
 * ��������� ������ ��������, � ������� ���� ������ �� ����� ��������.
 * �������� ������ ����� ���� �� ����.
 * ������� �� ��� ������.
 * ��������� ���������� ������ �� ����������.
 * ��������� �� ���.
 * ������
 * PredictAge(65, 60, 75, 55, 60, 63, 64, 45) === 86
 * ����������: ��������� ���������� ��������� �� ���������� ������ �����.
 */
public class PredictYourAge {
    public static void main(String[] args) {
        System.out.println(predictAge(65, 60, 75, 55, 60, 63, 64, 45));
        System.out.println(predictAge(32, 54, 76, 65, 34, 63, 64, 45));
    }

    public static int predictAge(int... ages) {
        int sum = Arrays.stream(ages)
                .map(age -> age * age)
                .sum();

        return (int) Math.sqrt(sum) / 2;
    }
}
