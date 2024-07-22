package kyu7;

/**
 * ���� ����
 * <p>
 * ��������� ������� power_of_two/powerOfTwo (��� �� ����������, � ����������� �� ������ �����),
 * ������� ����������, �������� �� ������ ��������������� ����� ����� �������� ������.
 * <p>
 * �� ��������������� ������ � ���������:
 * --- ������� ������ � ��� ����� ���� 2n, ��� n � ����� �����,
 * --- �. �. ��������� ���������� � ������� � ������ ��� � �������� ���������
 * --- � ����� ������ n � �������� ���������� �������.
 * <p>
 * �� ������ ������������, ��� ���� ������ ������������.
 * <p>
 * ������������� ������������ ������� ������� - ��������, 1 �������� �������� 2,
 * ��������� 2^0 = 1, � 0 �� �������� �������� 2.
 */
public class PowerOfTwo {
    public static boolean isPowerOfTwo(long n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(PowerOfTwo.isPowerOfTwo(1024));
        System.out.println(PowerOfTwo.isPowerOfTwo(4096));
        System.out.println(PowerOfTwo.isPowerOfTwo(333));
        System.out.println(PowerOfTwo.isPowerOfTwo(0));
        System.out.println(PowerOfTwo.isPowerOfTwo(1));
    }
}
