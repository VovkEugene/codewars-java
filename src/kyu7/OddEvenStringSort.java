package kyu7;

/**
 * ���� ������ s, ���� ������ � ������� ������ ������,
 * � ������� ������� ������ s � ������ � �������� �������� ����� �������������,
 * � ������ ��������� ���������.
 * ������ ���� ������ � ������ ��������,
 * �� ��� ������� ������, � ����� ����� � �������� ��������.
 * <p>
 * �������
 * input: "CodeWars" => "CdWr oeas"
 * ||||||||      |||| ||||
 * �������: 01234567 0246 1357
 * ׸���� ������� 0, 2, 4, 6, ������� ������ ������� �������� �CdWr�.
 * �������� ������� � 1, 3, 5, 7, ������� ������ ������ � �oeas�.
 * � ��������� ������������ ������: �Cdwr oeas�.
 */
public class OddEvenStringSort {
    public static void main(String[] args) {
        System.out.println(sortMyString("CodeWars"));
    }

    public static String sortMyString(String s) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                even.append(array[i]);
            } else {
                odd.append(array[i]);
            }
        }
        return even + " " + odd;
    }
}
