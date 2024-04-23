package kyu7;

/**
 * Количество десятичных разрядов
 * -------------------------------------------------
 * Определите общее количество цифр в целом числе (n>=0),
 * заданном в качестве входных данных для функции.
 * Например, 9 - это одиночная цифра, 66 состоит из 2 цифр, а 128685 - из 6 цифр.
 * Будьте осторожны, чтобы избежать overflows/underflows.
 */
public class NumberOfDecimalDigits {
    public static int Digits(long n) {
        int count = 0;

        String number = String.valueOf(n);

        for (int i = 0; i < number.length(); i++) {
            if(Character.isDigit(number.charAt(i))){
                count++;
            }
        }

        return count;
    }
}
