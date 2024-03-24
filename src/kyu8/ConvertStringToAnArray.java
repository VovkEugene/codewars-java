package kyu8;

import java.util.Arrays;

/**
 * Преобразовать строку в массив
 *
 * Напишите функцию для разделения строки и преобразования ее в массив слов.
 */
public class ConvertStringToAnArray {
    public static String[] stringToArray(String s) {
        return s.split("\s");
    }
}
