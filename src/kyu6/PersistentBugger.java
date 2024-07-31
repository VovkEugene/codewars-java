package kyu6;

/**
 * ����������� ��������
 * <p>
 * �������� ������� persistence, ������� ��������� ������������� �������� num
 * � ���������� ��� ����������������� ������������,
 * ������� ������������ ����� ���������� ���,
 * ������� �� ������ �������� ����� � num, ���� �� ���������� ����� �����.
 * <p>
 * For example (Input --> Output):
 * <p>
 * 39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 � 4 ����� ������ ���� �����, ���� 3 ���������)
 * 999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, �, �������, 1*2 = 2, ���� 4 ���������)
 * 4 --> 0 (��������� 4 � ��� ��� ����������� �����, ��������� ���.)
 */
public class PersistentBugger {
    private static int COUNTER = 0;

    public static int persistence(long n) {
        if (n < 9) {
            int tempCounter = COUNTER;
            COUNTER = 0;

            return tempCounter;
        }

        long temp = getTemp(n);

        return persistence(temp);
    }

    private static long getTemp(long n) {
        long temp = n % 10;

        while (n > 9) {
            n /= 10;
            temp *= (n % 10);
        }

        COUNTER++;

        return temp;
    }

    public static void main(String[] args) {
        System.out.println(persistence(39));
        System.out.println(persistence(4));
        System.out.println(persistence(25));
        System.out.println(persistence(999));
    }
}
