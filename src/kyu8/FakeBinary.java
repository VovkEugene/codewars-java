package kyu8;

/**
 * Дана строка цифр, вы должны заменить любую цифру ниже 5 на "0",
 * а любую цифру от 5 и выше на "1".
 * Верните результирующую строку.
 * <p>
 * Примечание: ввод никогда не будет пустой строкой
 */
public class FakeBinary {
    public static String fakeBin(String numberString) {
        StringBuilder sb = new StringBuilder();
        int len = numberString.length();

        for (int i = 0; i < len; i++) {
            if (numberString.charAt(i) < '5') {
                sb.append("0");
            } else {
                sb.append("1");
            }
        }

        return sb.toString();
    }
}
