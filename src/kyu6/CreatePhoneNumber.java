package kyu6;

/**
 * ������� ����� ��������
 * <p>
 * �������� �������, ������� ��������� ������ �� 10 ����� ����� (�� 0 �� 9),
 * � ���������� ������ ���� ���� � ���� ������ ��������.
 * <p>
 * Example
 * Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
 * The returned format must be correct in order to complete this challenge.
 * <p>
 * �� �������� ��������� ������ ����� ����������� ������!
 */
public class CreatePhoneNumber {
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                numbers[0],
                numbers[1],
                numbers[2],
                numbers[3],
                numbers[4],
                numbers[5],
                numbers[6],
                numbers[7],
                numbers[8],
                numbers[9]
        );
    }

//    public static String createPhoneNumber(int[] numbers) {
//        String mask = "(xxx) xxx-xxxx";
//
//        for (int number : numbers) {
//            mask = mask.replaceFirst("x", Integer.toString(number));
//        }
//
//        return mask;
//    }
}
