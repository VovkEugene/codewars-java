package kyu7;

/**
 * Количество гласных
 * <p>
 * Возвращает количество гласных в данной строке.
 * Мы будем рассматривать a, e, i, o, u в качестве гласных для этого ката (но не y).
 * Входная строка будет состоять только из строчных букв и/или пробелов.
 */
public class VowelCount {
    public static int getCount(String str) {
        return str.replaceAll("[^aeiou]", "").length();
    }
}
