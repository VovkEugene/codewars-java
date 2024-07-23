package kyu7;

/**
 * ��� �����
 * <p>
 * ��������:
 * ��������� ������� ����� � ���, ������������ �� ��� �������.
 * ������ ������� ��������� � ������� 1, ������ � � ������� 2, ������ � � ������� 1 � ��� �����.
 * <p>
 * ������:
 * ��� ������ ������������� ����� ����� (���� �����),
 * ������� ����� ������ �� ���� ����� �����,
 * ��� ������ � ��� ����� ��� ������� 1,
 * � ������ � ����� ��� ������� 2.
 * <p>
 * ����������:
 * ������ ������� �� ����� 1.
 * ��� ����� ����� ��������������.
 * <p>
 * ���� >> ������� ������
 * rowWeights([13, 27, 49]) ==> return (62, 27)
 * ����������:
 * ������ ������� 62 � ��� ����� ��� ������� 1, � ������ ������� 27 � ����� ��� ������� 2.
 * <p>
 * rowWeights([50, 60, 70, 80]) ==> return (120, 140)
 * ����������:
 * ������ ������� 120 � ��� ����� ��� ������� 1, � ������ ������� 140 � ����� ��� ������� 2.
 * <p>
 * rowWeights([80]) ==> return (80, 0)
 * ����������:
 * ������ ������� 80 � ��� ����� ��� ������� 1, � ������ ������� 0 � ����� ��� ������� 2.
 */
public class RowWeights {

    public static int[] rowWeights(final int[] weights) {
        int firstTeam = 0;
        int secondTeam = 0;

        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                firstTeam += weights[i];
            } else {
                secondTeam += weights[i];
            }
        }

        return new int[]{firstTeam, secondTeam};
    }
}