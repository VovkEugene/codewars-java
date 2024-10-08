package kyu7;

/**
 * ���� ������, ��������� �� ���� a, b �/��� c,
 * ��������� ������� ����� a � b (�������� a �� b � ��������).
 * �������� ����� ������ c �����������.
 * Example:
 * 'acb' --> 'bca'
 * 'aabacbaa' --> 'bbabcabb'
 */
public class Switcheroo {
    public static String switcheroo(String x) {
        StringBuilder sb = new StringBuilder();
        char[] chars = x.toCharArray();
        for (char letter : chars) {
            if (letter == 'a') {
                sb.append('b');
            } else if (letter == 'b') {
                sb.append('a');
            } else {
                sb.append(letter);
            }
        }
        return sb.toString();
    }
}
