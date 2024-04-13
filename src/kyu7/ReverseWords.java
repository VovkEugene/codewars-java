package kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Обратные слова
 * <p>
 * Выполните функцию, которая принимает строковый параметр
 * и изменяет каждое слово в строке на противоположное.
 * Все пробелы в строке должны быть сохранены.
 * Examples
 * "This is an example!" ==> "sihT si na !elpmaxe"
 * "double  spaces"      ==> "elbuod  secaps"
 */
public class ReverseWords {
    public static String reverseWords(final String original) {
        if (original.isBlank()) {
            return original;
        }

        String[] words = original.split(" ");

        return Arrays.stream(words)
                .map(word -> new StringBuilder()
                        .append(word)
                        .reverse())
                .collect(Collectors.joining(" "));
    }
}
