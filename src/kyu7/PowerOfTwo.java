package kyu7;

/**
 * Сила двух
 * <p>
 * Выполните функцию power_of_two/powerOfTwo (или ее эквивалент, в зависимости от вашего языка),
 * которая определяет, является ли данное неотрицательное целое число степенью двойки.
 * <p>
 * Из соответствующей записи в Википедии:
 * --- степень двойки — это число вида 2n, где n — целое число,
 * --- т. е. результат возведения в степень с числом два в качестве основания
 * --- и целым числом n в качестве показателя степени.
 * <p>
 * Вы можете предположить, что ввод всегда действителен.
 * <p>
 * Остерегайтесь определенных крайних случаев - например, 1 является степенью 2,
 * поскольку 2^0 = 1, а 0 не является степенью 2.
 */
public class PowerOfTwo {
    public static boolean isPowerOfTwo(long n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(PowerOfTwo.isPowerOfTwo(1024));
        System.out.println(PowerOfTwo.isPowerOfTwo(4096));
        System.out.println(PowerOfTwo.isPowerOfTwo(333));
        System.out.println(PowerOfTwo.isPowerOfTwo(0));
        System.out.println(PowerOfTwo.isPowerOfTwo(1));
    }
}
