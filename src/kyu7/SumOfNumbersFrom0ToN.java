package kyu7;

/**
 * Сумма чисел от 0 до N
 * 
 * Мы хотим создать функцию, которая вычисляет ряд,
 * начиная с 0 и до указанного числа.
 *
 * Example:
 * Input:
 * 6
 * Output:
 * 0+1+2+3+4+5+6 = 21
 *
 * Input:
 * -15
 * Output:
 * -15<0
 *
 * Input:
 * 0
 * Output:
 * 0=0
 */
public class SumOfNumbersFrom0ToN {
    public static void main(String[] args) {
        System.out.println(showSequence(6));
        System.out.println(showSequence(-15));
        System.out.println(showSequence(0));
    }

    public static String showSequence(int value) {
        if (value < 0) {
            return String.format("%d<0", value);
        }

        if (value == 0) {
            return String.format("%d=0", value);
        }

        var result = new StringBuilder();
        var sum = 0;

        for (int i = 0; i <= value; i++) {
            result.append(i);

            if (i != value) {
                result.append('+');
            }

            sum += i;
        }

        return result.append(" = ").append(sum).toString();
    }
}
