package kyu7;

/**
 * Дана строка s, ваша задача — вернуть другую строку,
 * в которой символы строки s с четным и нечетным индексом будут сгруппированы,
 * а группы разделены пробелами.
 * Первой идет группа с четным индексом,
 * за ней следует пробел, а затем часть с нечетным индексом.
 * <p>
 * Примеры
 * input: "CodeWars" => "CdWr oeas"
 * ||||||||      |||| ||||
 * индексы: 01234567 0246 1357
 * Чётные индексы 0, 2, 4, 6, поэтому первой группой является «CdWr».
 * Нечетные индексы — 1, 3, 5, 7, поэтому вторая группа — «oeas».
 * И последняя возвращаемая строка: «Cdwr oeas».
 */
public class OddEvenStringSort {
    public static void main(String[] args) {
        System.out.println(sortMyString("CodeWars"));
    }

    public static String sortMyString(String s) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                even.append(array[i]);
            } else {
                odd.append(array[i]);
            }
        }
        return even + " " + odd;
    }
}
