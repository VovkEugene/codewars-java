package kyu7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ����������� �����.
 * --------------------------------------------------------------
 * ������� �� ����� ����� n (n >= 0) � ����� d (0 <= d <= 9).
 * ��������� ��� ����� k (0 <= k <= n) � ������� �� 0 �� n.
 * ����������� ���������� ���� d, �������������� ��� ��������� ���� k**2.
 * ���������� �������, ����������� n � d � �������� ���������� � ������������ ��� ����������.
 * �������� ��������, ��� ����� 121 ����� ������ ����� 1.
 */
public class CountDigit {
    public static int nbDig(int n, int d) {
        var numbers = squaredNumber(n);

        var strings = integerToString(numbers);

        var charsStrings = stringToCharsString(strings);

        return searchNumberForMatches(charsStrings, d);
    }

    static List<Integer> squaredNumber(int n) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            numbers.add(i * i);
        }

        return numbers;
    }

    static List<String> integerToString(List<Integer> numbers) {
        return numbers
                .stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
    }

    static List<String> stringToCharsString(List<String> strings) {
        List<String> characters = new ArrayList<>();

        for (String string : strings) {
            for (Character character : string.toCharArray()) {
                characters.add(character.toString());
            }
        }

        return characters;
    }

    static int searchNumberForMatches(List<String> characters, int requiredNumber) {
        int count = 0;

        for (String item : characters) {
            if (item.contains(String.valueOf(requiredNumber))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(nbDig(10, 1));
        System.out.println(nbDig(5750, 0));
        System.out.println(nbDig(11011, 2));
        System.out.println(nbDig(12224, 8));
        System.out.println(nbDig(11549, 1));


    }
}
