package kyu7;

import java.util.stream.Collectors;

import static java.util.Arrays.stream;

/**
 * Сформируйте Минимальный
 * -----------------------------------------------------------
 * Дан список цифр, верните наименьшее число, которое может быть сформировано из этих цифр,
 * используя цифры только один раз (игнорируйте дубликаты).
 */
public class FormMinimum {
    public static int minValue(int[] values) {
        return Integer.parseInt(
                stream(values)
                        .distinct()
                        .sorted()
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(""))
        );
    }
}
