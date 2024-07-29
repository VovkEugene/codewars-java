package kyu6;

/**
 * Сумма цифр (Sum of Digits / Digital Root)
 * <p>
 * Цифровой корень — это рекурсивная сумма всех цифр числа.
 * <p>
 * Учитывая n, возьмите сумму цифр n.
 * Если это значение содержит более одной цифры,
 * продолжайте уменьшать таким образом,
 * пока не получите однозначное число.
 * Входные данные будут неотрицательным целым числом.
 * <p>
 * Examples
 * 16  -->  1 + 6 = 7
 * 942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
 * 132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
 * 493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
 */
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(digitalRoot(16));
        System.out.println(digitalRoot(456));
    }

    public static int digitalRoot(int n) {
        int result = 0;

        while (n > 0) {
            result += n % 10;
            n /= 10;
        }

        if (result > 9) {
            return digitalRoot(result);
        }

        return result;
    }
}
