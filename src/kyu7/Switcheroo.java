package kyu7;

/**
 * Дана строка, состоящую из букв a, b и/или c,
 * поменяйте местами буквы a и b (измените a на b и наоборот).
 * Оставьте любые случаи c нетронутыми.
 * Example:
 * 'acb' --> 'bca'
 * 'aabacbaa' --> 'bbabcabb'
 */
public class Switcheroo {
    public static String switcheroo(String x) {
        StringBuilder sb = new StringBuilder();
        char[] chars = x.toCharArray();
        for (char letter : chars) {
            if (letter == 'a') {
                sb.append('b');
            } else if (letter == 'b') {
                sb.append('a');
            } else {
                sb.append(letter);
            }
        }
        return sb.toString();
    }
}
