package kyu8;

/**
 * Удалить первый и последний символ
 *
 * Ваша цель - создать функцию, которая удаляет первый и последний символы строки.
 * Вам задан один параметр - исходная строка.
 * Вам не нужно беспокоиться о строках, содержащих менее двух символов.
 */
public class RemoveFirstAndLastCharacter {
    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }
}
