package kyu7;

/**
 * Дана строка str, переверните ее не включая все неалфавитные символы.
 */
public class ReverseLetter {
    public static String reverseLetter(final String str) {
        char[] letters = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char letter : letters) {
            if (Character.isLetter(letter)) {
                sb.append(letter);
            }
        }

        return sb.reverse().toString();
    }
}
