package kyu7;

import java.util.Arrays;

/**
 * Максимальная разница в длине
 * ---------------------------------------------------------------------
 * Вам даны два массива строк a1 и a2.
 * Каждая строка состоит из букв от a до z.
 * Пусть x - любая строка в первом массиве, а y - любая строка во втором массиве.
 * Найдите max(abs(длина(x) ? длина(y)))
 * ---------------------------------------------------------------------
 * Если a1 и/или a2 пусты, верните значение -1.
 * Example:
 * a1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt",
 * "znnnnfqknaz", "qqquuhii", "dvvvwz"]
 * a2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
 * mxdiflg(a1, a2) --> 13
 */
public class MaximumLengthDifference {
    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }

        int max = 0;

        for (String str1 : a1) {
            for (String str2 : a2) {
                int temp = Math.abs(str1.length() - str2.length());

                if (max < temp) {
                    max = temp;
                }
            }
        }

        return max;
    }
}
