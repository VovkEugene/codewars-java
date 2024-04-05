package kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * ������� ����, ��� ����� �����, �������� ������� ����� �������,
 * ��� "������-��������" (2010) � "����� �����" (2013).
 * ������� ����� �������� ����� ����������, ������� �� �������� ����� Twitter.
 * ��������, ��� ��� ��������� ������� � Twitter �� ����� ������ ����� ������ ����� � ��������� �����.
 * ��� �������� ��� �������� ������ ������ ����� � ��������� �����,
 * ����������, ������ ������ ���� ���������� � ������� ����:
 * <p>
 * Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
 * Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
 * <p>
 * ���� ������ - ������������� ������ � ��, ��� ��� ���� �� �������� ��������� ������.
 * ��� ������ �������� ���������� �������� �� �������� �����,
 * �� ��� �������� � ��������� ����� �� ���, ��� �� ������ �� ����������.
 * <p>
 * �������� ��������, ��� ������ Java ������� ������������ �������� null ��� ������ ������
 * ��� �������� null.
 */
public class JadenCasingStrings {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }

        return Arrays.stream(phrase.split(" "))
                .map(item -> Character.toUpperCase(item.charAt(0)) + item.substring(1))
                .collect(Collectors.joining(" "));
    }
}
