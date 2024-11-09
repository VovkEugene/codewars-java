package kyu7;

/**
 * Большинство цифр
 * Найдите число, в котором больше всего цифр.
 * Если два числа в массиве аргументов имеют одинаковое количество цифр,
 * возвращается первое число в массиве.
 */
public class MostDigits {
    public static void main(String[] args) {
        System.out.println(findLongest(new int[]{1, 10, 100}));
        System.out.println(findLongest(new int[]{9000, 8, 800}));
        System.out.println(findLongest(new int[]{8, -900, -500}));
    }

    public static int findLongest(int[] numbers) {
        int numberLength = 0;
        int result = 0;

        for (int number : numbers) {
            if (number < 0) {
                number = Math.abs(number);
                if (String.valueOf(number).length() > numberLength) {
                    numberLength = String.valueOf(number).length();
                    result = number * -1;
                }
            } else {
                if (String.valueOf(number).length() > numberLength) {
                    numberLength = String.valueOf(number).length();
                    result = number;
                }
            }
        }
        return result;
    }
}
