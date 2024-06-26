package kyu7;

/**
 * ���� ����������� ���������
 * <p>
 * � ��������� ������ ����������� ��������� �� ������ ���� ���������� p0 = 1000 �������.
 * ��������� ��������� ������������� �� 2% � ���, �, ����� ����,
 * � ����� �������� ��������� 50 ����� �������.
 * ������� ��� ����� ������, ����� ��� ��������� ��������� ��� ����� ������ p = 1200 �������?
 * ------------------------------------------------------------------------------
 * � ����� ������� ���� �����:
 * 1000 + 1000 * 0.02 + 50 => 1070 �������
 * <p>
 * � ����� ������� ���� �����:
 * 1070 + 1070 * 0.02 + 50 => 1141 ������� (** ���������� ������� - ����� ����� **)
 * <p>
 * � ����� 3-�� ����� �����:
 * 1141 + 1141 * 0.02 + 50 => 1213
 * <p>
 * �� ��� ����� ����� 3 ����.
 * ------------------------------------------------------------------------------
 * ����� ����� ���������:
 * p0, �������, aug (���������� �������, ����������� ��� ��������� ������ ���),
 * p (����������� ���������, ������ ��� �������������)
 * <p>
 * ������� nb_year ������ ���������� n ����� ���,
 * ����������� ��� ��������� ����������� ���������, ������� ��� ������ p.
 * <p>
 * aug - ��� ����� �����,
 * percent - ������������� ��� ������� ����� � ��������� �������,
 * p0 � p - ������������� ����� ����� (> 0).
 * <p>
 * �������:
 * nb_���(1500, 5, 100, 5000) -> 15
 * nb_���(1500000, 2.5, 10000, 2000000) -> 10
 * <p>
 * ����������:
 * �� �������� ������������� �������� percent � ��������� � ���� ����� �������:
 * ���� �������� ��������� percent ����� 2, �� ������ ������������� ��� � 0,02.
 * <p>
 * ����� ��� ����� �����. � ����� ������� ���� ����������� ��������� ���������� ����� �����:
 * 252,8 ��������, ����������� �� 252 �������.
 */
public class GrowthOfPopulation {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int numberOfYears = 0;
        percent = percent / 100;

        while (p0 < p) {
            p0 += p0 * percent + aug;

            numberOfYears++;
        }

        return numberOfYears;
    }
}
