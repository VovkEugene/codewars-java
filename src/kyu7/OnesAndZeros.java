package kyu7;

import java.util.List;
import java.util.stream.Collectors;

/**
 * ������� � ����
 * <p>
 * ��� ������ �� ������ � �����, ������������ ������������� �������� �������� � ����� �����.
 * ��������: [0, 0, 0, 1] �������������� ��� 0001, ��� �������� �������� �������������� 1.
 * Examples:
 * Testing: [0, 0, 0, 1] ==> 1
 * Testing: [0, 0, 1, 0] ==> 2
 * Testing: [0, 1, 0, 1] ==> 5
 * Testing: [1, 0, 0, 1] ==> 9
 * Testing: [0, 0, 1, 0] ==> 2
 * Testing: [0, 1, 1, 0] ==> 6
 * Testing: [1, 1, 1, 1] ==> 15
 * Testing: [1, 0, 1, 1] ==> 11
 * ������ ������� ����� ����� ��������� �����, � �� �������������� ������ 4.
 */
public class OnesAndZeros {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String binaryString = binary
                .stream()
                .map(item -> item + "")
                .collect(Collectors.joining(""));

        return Integer.parseInt(binaryString, 2);
    }
}
