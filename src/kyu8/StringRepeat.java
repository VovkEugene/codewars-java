package kyu8;

/**
 * Повторение строки
 * <p>
 * Напишите функцию, которая принимает целое число n и строку s в качестве параметров
 * и возвращает строку из s, повторенную ровно n раз.
 */
public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }
}
