package kyu7;

import java.util.stream.Collectors;

import static java.util.Arrays.stream;

/**
 * ����������� �����������
 * -----------------------------------------------------------
 * ��� ������ ����, ������� ���������� �����, ������� ����� ���� ������������ �� ���� ����,
 * ��������� ����� ������ ���� ��� (����������� ���������).
 */
public class FormMinimum {
    public static int minValue(int[] values) {
        return Integer.parseInt(
                stream(values)
                        .distinct()
                        .sorted()
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(""))
        );
    }
}
