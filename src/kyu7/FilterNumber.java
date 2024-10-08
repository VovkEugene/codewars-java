package kyu7;

/**
 * Фильтровать номер
 * О, нет! Номер перепутался с текстом.
 * Ваша цель — извлечь число из текста.
 * Сможете ли вы вернуть число в исходное состояние?
 * Задача
 * Ваша задача — вернуть число из строки.
 * Подробности
 * Вам будет предоставлена строка из перепутанных цифр и букв.
 * Вам нужно будет вернуть все цифры в этой строке в том порядке,
 * в котором они встречаются.
 */
public class FilterNumber {
    public static long filterString(final String value) {
        StringBuilder sb = new StringBuilder();
        char[] chars = value.toCharArray();
        for (char letter : chars) {
            if (Character.isDigit(letter)) {
                sb.append(letter);
            }
        }
        return Long.parseLong(sb.toString());
    }

    public static long filterString2(final String value) {
        return Long.parseLong(value.replaceAll("//D", ""));
    }
}
