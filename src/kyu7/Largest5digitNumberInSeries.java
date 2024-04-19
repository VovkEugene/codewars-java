package kyu7;

import java.util.ArrayList;

/**
 * Самое большое 5-значное число в серии
 * ----------------------------------------------------
 * В следующем 6-значном номере:
 * 283910
 * 91 - это наибольшая последовательность из 2 последовательных цифр.
 * ----------------------------------------------------
 * В следующем 10-значном числе:
 * 1234567890
 * 67890 - это наибольшая последовательность из 5 последовательных цифр.
 * ----------------------------------------------------
 * Завершите решение так, чтобы оно возвращало наибольшую последовательность
 * из пяти последовательных цифр, найденных в пределах заданного числа.
 * Число будет передано в виде строки, состоящей только из цифр.
 * Оно должно возвращать целое число из пяти цифр.
 * Переданное число может содержать до 1000 цифр.
 */
public class Largest5digitNumberInSeries {
    public static int solve(final String digits) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb;
        int start = 0;
        int end = 5;

        while (start < digits.length()) {
            sb = new StringBuilder();

            for (int i = start; i < digits.length(); i++) {
                if (sb.length() == end) {
                    break;
                }

                sb.append(digits.charAt(i));
            }

            list.add(sb.toString());

            start++;
        }

        return Integer.parseInt(
                list.stream()
                        .filter(item -> item.length() == 5)
                        .max(String::compareTo)
                        .get()
        );
    }
}
