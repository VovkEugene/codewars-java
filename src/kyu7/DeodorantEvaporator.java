package kyu7;

/**
 * ����������-����������
 *
 * ��� ��������� ��������� ���� ������ ����������, ����������� ���.
 *
 * �� ����� ���������� ���������� (����� - content � ��),
 * ������� ���� ��� ����, �������� ������ ���� (evap_per_day)
 * � ����� (threshold) � ���������, �� ������� ���������� ������ �� �������.
 * ��� ����� ������ �������������.
 *
 * ��������� �������� n-� ���� (� ���� ������ �����), � ������� ���������� ������ �� �����.
 *
 * ������:
 * evaporator(10, 10, 5) -> 29
 * 
 * ����������:
 * ���������� � ���� ������� "����������" �� ����� ���� �� �����������,
 * �� ������ ������������ ��� ��� �� ������������ �� ������ ����������.
 * ��������� ���� ������������ ���������� � ������� ����������, ������ � ������ � ����������.
 * ������ ���, �� �� ������ ��������� ��� ��� ��������,
 * ��������� � ������ �� ������������ � �������� ���������.
 */
public class DeodorantEvaporator {

    public static int evaporator(double content, double evap_per_day, double threshold) {
        int counter = 0;
        threshold = getPercent(content, threshold);

        while (content > threshold) {
            content = content - getPercent(content, evap_per_day);
            counter++;
        }

        return counter;
    }

    private static double getPercent(double content, double percentValue) {
        return (content / 100) * percentValue;
    }

    public static void main(String[] args) {
        System.out.println(evaporator(10, 10, 5));
        System.out.println(evaporator(10, 10, 10));
    }
}
