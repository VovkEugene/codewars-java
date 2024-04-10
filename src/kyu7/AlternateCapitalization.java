package kyu7;

/**
 * јльтернативна€ капитализаци€
 * <p>
 * ¬ заданной строке введите заглавными буквами буквы, которые занимают четные и нечетные индексы,
 * отдельно и верните, как показано ниже. »ндекс 0 будет считатьс€ четным.
 * <p>
 * Ќапример, заглавными буквами("abcdef") = ["AbCdEf", "aBcDeF"].
 * <p>
 * ¬водимыми данными будут строки в нижнем регистре без пробелов.
 */
public class AlternateCapitalization {
    public static String[] capitalize(String s) {
        String[] strings = new String[2];
        StringBuilder sb = new StringBuilder();

        strings[0] = evenCapitalLetters(s, sb);
        strings[1] = oddCapitalLetters(s, sb);

        return strings;
    }

    static String evenCapitalLetters(String s, StringBuilder sb) {
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                sb.append(String.valueOf(s.charAt(i)).toUpperCase());
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    static String oddCapitalLetters(String s, StringBuilder sb) {
        sb.delete(0, s.length());

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                sb.append(String.valueOf(s.charAt(i)).toUpperCase());
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(capitalize("abcdef"));
    }
}
