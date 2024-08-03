package kyu6;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;
import static java.lang.String.valueOf;

/**
 * Игра с цифрами.
 * <p>
 * Некоторые числа имеют забавные свойства. Например:
 * <p>
 * 89 --> 8? + 9? = 89 * 1
 * 695 --> 6? + 9? + 5? = 1390 = 695 * 2
 * 46288 --> 4? + 6?+ 2? + 8? + 8? = 2360688 = 46288 * 51
 * Учитывая два положительных целых числа n и p,
 * мы хотим найти целое положительное число k,
 * если оно существует, такое, что сумма цифр n,
 * возведенных в последовательные степени, начиная с p, равна k * n.
 * <p>
 * Другими словами, записав последовательные цифры n как a, b, c, d ...,
 * существует ли целое число k такое, что:
 * <p>
 * В этом случае мы вернем k, если нет, вернем -1.
 * <p>
 * Примечание: n и p всегда будут строго положительными целыми числами.
 */
public class PlayingWithDigits {
    public static void main(String[] args) {
        System.out.println(digPow(89, 1));
        System.out.println(digPow(92, 1));
        System.out.println(digPow(46288, 3));
    }

    public static long digPow(int n, int p) {
        var value = valueOf(n).split("");
        var sum = 0;

        for (String item : value) {
            sum += pow(parseInt(item), p++);
        }

        if (sum % n == 0) {
            return sum / n;
        }

        return -1;
    }
}
