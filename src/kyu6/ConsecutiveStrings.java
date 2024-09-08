package kyu6;

/**
 * ���������������� ������
 * ��� ��� ������ (������) ����� � ����� ����� k.
 * ���� ������ � ������� ������ ����� ������� ������,
 * ��������� �� k ���������������� �����, ������ � �������.
 * <p>
 * n � ����� ������� �����, ���� n = 0 ��� k > n ��� k <= 0,
 * ���������� "".
 * <p>
 * ����������
 * ���������������� ������: ������� ���� �� ������ ��� ��������
 */
public class ConsecutiveStrings {
    public static void main(String[] args) {
        String[] strings = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};

        System.out.println(longestConsec(strings, 2));
    }

    public static String longestConsec(String[] strarr, int k) {
        int n = strarr.length;
        if (n == 0 || k > n || k <= 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= n - k; i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < k; j++) {
                temp.append(strarr[i + j]);
            }
            if (temp.length() > result.length()) {
                result = temp;
            }
        }

        return result.toString();
    }
}
