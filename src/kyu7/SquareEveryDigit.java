package kyu7;

/**
 * Возведите в квадрат каждую цифру
 * <p>
 * В этом ката вас просят возвести в квадрат каждую цифру числа и объединить их.
 * Примечание: Функция принимает целое число и возвращает целое число.
 */
public class SquareEveryDigit {
    public static int squareDigits(int n) {
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(n);

        for (char item : str.toCharArray()) {
            sb.append(
                    Character.getNumericValue(item)
                            * Character.getNumericValue(item)
            );
        }

        return Integer.parseInt(sb.toString());
    }
}
