package kyu7;

/**
 * ���������� ��������� ��������� PIN-���
 * <p>
 * ��������� ��������� ������������� 4- ��� 6-������� PIN-�����,
 * � PIN-���� �� ����� ��������� ������, ����� 4- ��� 6-������� ����.
 * <p>
 * ���� ������� �������� �������������� ������ PIN-����, ������� �������� true,
 * � ��������� ������ ������� �������� false.
 */
public class RegexValidatePINcode {
    public static boolean validatePin(String pin) {
        return pin.matches("^\\d{4}$|^\\d{6}$");
    }
}
