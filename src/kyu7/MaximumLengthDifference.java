package kyu7;

import java.util.Arrays;

/**
 * ������������ ������� � �����
 * ---------------------------------------------------------------------
 * ��� ���� ��� ������� ����� a1 � a2.
 * ������ ������ ������� �� ���� �� a �� z.
 * ����� x - ����� ������ � ������ �������, � y - ����� ������ �� ������ �������.
 * ������� max(abs(�����(x) ? �����(y)))
 * ---------------------------------------------------------------------
 * ���� a1 �/��� a2 �����, ������� �������� -1.
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
