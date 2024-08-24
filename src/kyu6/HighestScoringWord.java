package kyu6;

/**
 * ����� � ����� ������� ���������
 * <p>
 * �������� ������ ����, ��� ����� ����� ����� � ���������� ����������� �����.
 * <p>
 * ������ ����� ����� �������� ���� � ������������ �� ����� �������� � ��������: a = 1, b = 2, c = 3 � �. �.
 * <p>
 * ��������, ������ ����� ����� 8 (1+2+1+4).
 * <p>
 * ��� ���������� ������� ����� � ���������� ����������� ������ � ���� ������.
 * <p>
 * ���� ��� ����� ����� ���������� ������, ������� �����, ������� ����������� ������ � �������� ������.
 * <p>
 * ��� ����� ����� ���������, � ��� ��������� ������ ����� ���������������.
 */
public class HighestScoringWord {
    public static void main(String[] args) {
//        System.out.println(high("what time are we climbing up to the volcano"));
//        System.out.println(high("man i need a taxi up to ubud"));
//        System.out.println(high("take me to semynak"));

        System.out.println(high("aa b"));
        System.out.println(high("b aa"));
        System.out.println(high("bb d"));
        System.out.println(high("aa d"));
        System.out.println(high("d bb"));
        System.out.println(high("aaa b"));
    }

    public static String high(String str) {
        var alphabet = "abcdefghijklmnopqrstuvwxyz";
        var array = str.split(" ");
        var result = "";
        int counter;
        int max = 0;

        for (var word : array) {
            counter = 0;
            counter = getSum(word, alphabet, counter);

            if (max < counter) {
                max = counter;
                result = word;
            }
        }

        return result;
    }

    private static int getSum(String word, String alphabet, int counter) {
        for (var letter : word.split("")) {
            if (alphabet.contains(letter)) {
                counter += alphabet.indexOf(letter) + 1;
            }
        }

        return counter;
    }
}
