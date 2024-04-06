package kyu7;

/**
 * ����������
 * <p>
 * �� ���� ��� ��� ������� � ������.
 * � �������� ���� ��������, ��� �������� ������� ����������:
 * <p>
 * ����("abcd") -> "A-Bb-Ccc-Dddd"
 * ����("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * ����("cwAt") -> "C-Ww-Aaa-Tttt"
 * <p>
 * �������� accum - ��� ������, ������� �������� ������ ����� �� a..z �� A..Z.
 */
public class Mumbling {
    public static String accum(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.append(String.valueOf(s.charAt(i)).toUpperCase());
            sb.append(String.valueOf(s.charAt(i)).repeat(i).toLowerCase());

            if (i != s.length() - 1) {
                sb.append('-');
            }
        }

        return sb.toString();
    }
}
