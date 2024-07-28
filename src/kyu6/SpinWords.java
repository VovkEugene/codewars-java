package kyu6;

import java.util.LinkedList;

/**
 * Stop gninnipS My sdroW!
 * <p>
 * �������� �������, ������� ��������� ������ �� ������ ��� ���������� ����
 * � ���������� �� �� ������, �� �� ����� �������,
 * � ������� ���� ��� ����� ���� ����������� (����� ��� ��, ��� �������� ���� ����).
 * ������������ ������ ����� �������� ������ �� ���� � ��������.
 * ������� ����� �������� ������ � ��� ������, ���� ������������ ����� ������ �����.
 * <p>
 * Examples:
 * <p>
 * "Hey fellow warriors"  --> "Hey wollef sroirraw"
 * "This is a test        --> "This is a test"
 * "This is another test" --> "This is rehtona test"
 */
public class SpinWords {
    public static void main(String[] args) {
        System.out.println(spinWords("This is a test"));
        System.out.println(spinWords("Welcome"));
        System.out.println(spinWords("Hey fellow warriors"));
        System.out.println(spinWords("Just kidding there[ is ]still one more"));
    }

    public static String spinWords(String sentence) {
        var list = new LinkedList<String>();

        var words = sentence.split(" ");

        for (String word : words) {
            if (word.length() >= 5) {
                list.add(new StringBuilder()
                        .append(word)
                        .reverse()
                        .toString()
                );
            } else {
                list.add(word);
            }
        }

        return String.join(" ", list);
    }
}
