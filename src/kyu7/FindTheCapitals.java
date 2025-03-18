package kyu7;

import java.util.stream.IntStream;

/**
 * Напишите функцию, которая принимает в качестве аргумента единственную непустую строку,
 * состоящую только из lowercase и uppercase букв ascii (word),
 * и возвращает упорядоченный список, содержащий индексы всех uppercase букв в строке.
 * ---
 * "CodEWaRs" --> [0,3,4,6]
 */
public class FindTheCapitals {

    public static int[] capitals(String str) {
        return IntStream.range(0, str.length())
                .filter(i -> Character.isUpperCase(str.charAt(i)))
                .toArray();
    }
}
