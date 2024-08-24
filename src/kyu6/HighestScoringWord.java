package kyu6;

/**
 * —лово с самым высоким рейтингом
 * <p>
 * ”читыва€ строку слов, вам нужно найти слово с наибольшим количеством очков.
 * <p>
 *  ажда€ буква слова набирает очки в соответствии со своей позицией в алфавите: a = 1, b = 2, c = 3 и т. д.
 * <p>
 * Ќапример, оценка абада равна 8 (1+2+1+4).
 * <p>
 * ¬ам необходимо вернуть слово с наибольшим количеством баллов в виде строки.
 * <p>
 * ≈сли два слова имеют одинаковую оценку, верните слово, которое встречаетс€ первым в исходной строке.
 * <p>
 * ¬се буквы будут строчными, и все введенные данные будут действительными.
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
