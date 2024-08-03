package kyu6;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.String.valueOf;

/**
 * Разделение строк
 * <p>
 * Завершите решение так, чтобы строка разбивалась на пары по два символа.
 * Если строка содержит нечетное количество символов,
 * необходимо заменить отсутствующий второй символ последней пары подчеркиванием («_»).
 * <p>
 * Examples:
 * 'abc' =>  ['ab', 'c_']
 * 'abcdef' => ['ab', 'cd', 'ef']
 */
public class SplitStrings {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abc")));
        System.out.println(Arrays.toString(solution("abcdef")));
        System.out.println(Arrays.toString(solution("HelloWorld")));
        System.out.println(Arrays.toString(solution("abcde")));
        System.out.println(Arrays.toString(solution("LovePizza")));
    }

    public static String[] solution(String s) {
        var list = new ArrayList<String>();

        if (s.length() % 2 != 0) {
            s += "_";
        }

        for (int i = 0; i < s.length(); i += 2) {
            list.add(s.charAt(i)
                    + valueOf(s.charAt(i + 1)));
        }

        return list.toArray(new String[0]);
    }
}
