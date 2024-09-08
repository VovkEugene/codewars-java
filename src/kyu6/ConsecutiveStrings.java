package kyu6;

/**
 * Последовательные строки
 * Вам дан массив (список) строк и целое число k.
 * Ваша задача — вернуть первую самую длинную строку,
 * состоящую из k последовательных строк, взятых в массиве.
 * <p>
 * n — длина массива строк, если n = 0 или k > n или k <= 0,
 * возвращает "".
 * <p>
 * Примечание
 * последовательные строки: следуют друг за другом без перерыва
 */
public class ConsecutiveStrings {
    public static void main(String[] args) {
        String[] strings = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};

        System.out.println(longestConsec(strings, 2));
    }

    public static String longestConsec(String[] strarr, int k) {
        int n = strarr.length;
        if (n == 0 || k > n || k <= 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= n - k; i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < k; j++) {
                temp.append(strarr[i + j]);
            }
            if (temp.length() > result.length()) {
                result = temp;
            }
        }

        return result.toString();
    }
}
