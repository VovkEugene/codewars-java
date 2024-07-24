package kyu7;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

/**
 * ���������� ����������� ����
 * <p>
 * ������� ����������� �������� ����� Elf ���������� ������ ������������� �� 26 ��������,
 * �������� ������� ������� ���������� ���������� ������.
 * ����� ����, ��� ������� ������� ��� �������� ��������,
 * ����������� �������� ���� ��������� ����������, ����� ������������ ��� ������ �������.
 * <p>
 * ����� �������� ������ ������������ ����������� ���������� � ���������� �������,
 * �� ���� �����, ���� ������� ����� �������� �������� � ��������!
 * ������� �� �� ��� ������?
 * <p>
 * ���������� ����������� ����
 * �������� ������� sortGiftCode/sort_gift_code/SortGiftCode,
 * ������� ��������� ������, ���������� �� 26 ���������� ��������� ��������,
 * � ���������� ������, ���������� �� �� ������� � ���������� �������.
 * <p>
 * Examples (Input -- => Output):
 * "abcdef"                      -- => "abcdef"
 * "pqksuvy"                     -- => "kpqsuvy"
 * "zyxwvutsrqponmlkjihgfedcba"  -- => "abcdefghijklmnopqrstuvwxyz"
 */
public class SortGiftCode {
    public static void main(String[] args) {
        System.out.println(sortGiftCode("fedcba"));
        System.out.println(sortGiftCode("zyxwvutsrqponmlkjihgfedcba"));
    }

    public static String sortGiftCode(String code) {
        return stream(code.split(""))
                .sorted()
                .collect(joining());
    }
}
