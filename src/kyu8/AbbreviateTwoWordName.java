package kyu8;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Сократите название из двух слов
 * <p>
 * Напишите функцию для преобразования имени в инициалы.
 * Это ката строго состоит из двух слов с одним пробелом между ними.
 * <p>
 * На выходе должны быть две заглавные буквы с разделяющей их точкой. *
 * Это должно выглядеть так:
 * Sam Harris => S.H
 * patrick feeney => P.F
 */
public class AbbreviateTwoWordName {
    public static String abbrevName(String name) {

        String[] array = name.split(" ");

        StringBuilder sb = new StringBuilder();

        for (String letter : array) {
            sb.append(letter.charAt(0));
            sb.append('.');
        }

        sb.deleteCharAt(sb.length() - 1);

        return sb.toString().toUpperCase();
    }
}
