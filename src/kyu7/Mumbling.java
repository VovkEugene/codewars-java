package kyu7;

/**
 * Бормотание
 * <p>
 * На этот раз без истории и теории.
 * В примерах ниже показано, как написать функцию накопления:
 * <p>
 * счет("abcd") -> "A-Bb-Ccc-Dddd"
 * счет("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * счет("cwAt") -> "C-Ww-Aaa-Tttt"
 * <p>
 * Параметр accum - это строка, которая содержит только буквы от a..z до A..Z.
 */
public class Mumbling {
    public static String accum(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.append(String.valueOf(s.charAt(i)).toUpperCase());
            sb.append(String.valueOf(s.charAt(i)).repeat(i).toLowerCase());

            if (i != s.length() - 1) {
                sb.append('-');
            }
        }

        return sb.toString();
    }
}
