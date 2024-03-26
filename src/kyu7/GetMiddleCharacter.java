package kyu7;

/**
 * Получите средний символ
 * <p>
 * Вам будет дано слово.
 * Ваша задача - вернуть средний символ слова.
 * Если длина слова нечетная, верните средний символ.
 * Если длина слова четная, верните 2 средних символа.
 * <p>
 * #Examples:
 * Kata.getMiddle("test") should return "es"
 * Kata.getMiddle("testing") should return "t"
 * Kata.getMiddle("middle") should return "dd"
 * Kata.getMiddle("A") should return "A"
 */
public class GetMiddleCharacter {
    public static String getMiddle(String word) {
        int halfLength = word.length() / 2;

        if (word.length() % 2 == 0) {
            return word.substring(halfLength - 1, halfLength + 1);
        }

        return String.valueOf(word.charAt(halfLength));
    }
}
