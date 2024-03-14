package kyu8;

/**
 * Простое умножение
 * <p>
 * Это ката о умножении заданного числа на восемь, если оно четное,
 * и на девять в противном случае.
 */
public class SimpleMultiplication {
    public static int simpleMultiplication(int n) {
        return isEven(n)
                ? multiplication(n, 8)
                : multiplication(n, 9);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }
}
