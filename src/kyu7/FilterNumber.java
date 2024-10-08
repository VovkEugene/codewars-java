package kyu7;

/**
 * ����������� �����
 * �, ���! ����� ����������� � �������.
 * ���� ���� � ������� ����� �� ������.
 * ������� �� �� ������� ����� � �������� ���������?
 * ������
 * ���� ������ � ������� ����� �� ������.
 * �����������
 * ��� ����� ������������� ������ �� ������������ ���� � ����.
 * ��� ����� ����� ������� ��� ����� � ���� ������ � ��� �������,
 * � ������� ��� �����������.
 */
public class FilterNumber {
    public static long filterString(final String value) {
        StringBuilder sb = new StringBuilder();
        char[] chars = value.toCharArray();
        for (char letter : chars) {
            if (Character.isDigit(letter)) {
                sb.append(letter);
            }
        }
        return Long.parseLong(sb.toString());
    }

    public static long filterString2(final String value) {
        return Long.parseLong(value.replaceAll("//D", ""));
    }
}
