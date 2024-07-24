package kyu7;

/**
 * ������� ���� ������
 * <p>
 * ��� ������� ��������� ���������� ����� ����� ������ ����������.
 * ������� N ����� �����. ��������� �� ������������ ����, ����������� ���������� ������� �������.
 * <p>
 * b rr b rr b rr b rr b
 * <p>
 * ���������� countRedBeads(n) ���,
 * ����� �� ��������� ���������� ������� �������.
 * <p>
 * ���� ����� ������� ������ ����, ������� 0.
 */
public class SimpleBeadsCount {
    public static void main(String[] args) {
        System.out.println(countRedBeads(0));
        System.out.println(countRedBeads(1));
        System.out.println(countRedBeads(3));
        System.out.println(countRedBeads(5));
    }

    public static int countRedBeads(final int nBlue) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nBlue - 1; i++) {
            sb.append("@@");
        }

        return sb.length();
    }
}
