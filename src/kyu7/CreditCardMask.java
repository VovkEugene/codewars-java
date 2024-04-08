package kyu7;

/**
 * ����� ��������� �����
 * <p>
 * ������, ����� �� ���-�� ���������, ��� ����������, ����� �� ����� ����� ��������� �����,
 * ����� �������� ��� ����� �� ��� ����� ��������� ������.
 * ������, ��������� ���-�� ����� ��������� ��� ����� �����, �� �� ������,
 * ����� ��� ������������ �� ����� ������. ������ ����� �� ��������� ���.
 * <p>
 * ���� ������ - �������� ������� maskify, ������� �������� ��� �������,
 * ����� ��������� �������, �� "#".
 * <p>
 * Examples
 * "4556364607935616" --> "############5616"
 * "64607935616" -->      "#######5616"
 * "1" -->                "1"
 * "" -->                 ""
 * <p>
 * // "What was the name of your first pet?"
 * "Skippy" --> "##ippy"
 * "Nananananananananananananananana Batman!" --> "####################################man!"
 */
public class CreditCardMask {
    public static String maskify(String str) {
        if (str.length() <= 4) {
            return str;
        }

        StringBuilder sb = new StringBuilder();

        return sb.append("#".repeat(Math.max(0, str.length() - 4)))
                .append(str.substring(str.length() - 4))
                .toString();
    }
}
