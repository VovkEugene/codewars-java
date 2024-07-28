package kyu6;

import static java.util.stream.IntStream.range;

/**
 * ������� 3 ��� 5
 * <p>
 * ���� �� ���������� ��� ����������� ����� �� 10,
 * ������� 3 ��� 5, �� ������� 3, 5, 6 � 9.
 * ����� ���� ������� ����� 23.
 * <p>
 * ��������� ������� ���,
 * ����� ��� ���������� ����� ���� ������� 3 ��� 5 ���� ���������� �����.
 * <p>
 * ����������. ���� ����� ������ 3 � 5, ���������� ��� ������ ���� ���.
 */
public class MultiplesOfThreeOrFive {
    public static void main(String[] args) {
        System.out.println(solution(100));
    }

//    public static int solution(int number) {
//        int result = 0;
//
//        for (int i = 1; i < number; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                result += i;
//            } else if (i % 3 == 0 || i % 5 == 0) {
//                result += i;
//            }
//        }
//
//        return result;
//    }

    public static int solution(int number) {
        return range(3, number)
                .filter(item -> item % 3 == 0 || item % 5 == 0)
                .sum();
    }
}
