package kyu7;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * ����� �������� �����
 * <p>
 * ������, ���� ������ �� ����, ������� ������ �������� �����.
 * ������ ������� �� ����� ������, � ��� �� ����� ��������� ������ ���� ������.
 */
public class ShortestWord_v2 {
    public static String findShort(String s) {

        String[] words = s.split(" ");

        ArrayList<Integer> wordLengths = fillList(words);

        int min = minValue(wordLengths);

        return words[wordLengths.indexOf(min)];
    }


    static ArrayList<Integer> fillList(String[] array) {
        ArrayList<Integer> list = new ArrayList<>(array.length);

        for (String word : array) {
            list.add(word.length());
        }

        return list;
    }

    static int minValue(ArrayList<Integer> integers) {
        return integers
                .stream()
                .min(Comparator.comparingInt(a -> a))
                .orElse(0);
    }


    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
        System.out.println(findShort("turns out random test cases are easier than writing out basic ones"));
        System.out.println(findShort("Let's travel abroad shall we"));
    }
}
