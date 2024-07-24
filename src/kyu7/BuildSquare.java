package kyu7;

/**
 * ��������� �������
 * <p>
 * � ��� ��� ����� �����.
 * ������� ��� ������ ����� �� ����� � ������, ��� ����� �����.
 * ����� ����� ����� ����� ������ �� 1 �� 50.
 * <p>
 * ������
 * n = 3, ������� � ������ ��������� �������� 3x3, ��� �������� ����, � ���� ������:
 * <p>
 * +++
 * +++
 * +++
 */
public class BuildSquare {
    public static void main(String[] args) {
        System.out.println(generateShape(3));
        System.out.println(generateShape(5));
        System.out.println(generateShape(8));
    }

    public static final String generateShape(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append("+".repeat(n));

            if (i != (n - 1)) {
                sb.append('\n');
            }
        }

        return sb.toString();
    }
}
