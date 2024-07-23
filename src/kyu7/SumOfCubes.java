package kyu7;

/**
 * Сумма кубов
 * <p>
 * Напишите функцию, которая принимает целое положительное число n,
 * суммирует все кубические значения от 1 до n (включительно) и возвращает эту сумму.
 * <p>
 * Предположим, что входное значение n всегда будет положительным целым числом.
 * <p>
 * Examples: (Input --> output)
 * <p>
 * 2 --> 9 (sum of the cubes of 1 and 2 is 1 + 8)
 * 3 --> 36 (sum of the cubes of 1, 2, and 3 is 1 + 8 + 27)
 */
public class SumOfCubes {
    public static void main(String[] args) {
        System.out.println(sumCubes(1));
        System.out.println(sumCubes(2));
        System.out.println(sumCubes(3));
        System.out.println(sumCubes(4));
        System.out.println(sumCubes(10));
        System.out.println(sumCubes(123));
    }

    public static long sumCubes(long value) {
        var result = 0L;

        for (long i = 1; i <= value; i++) {
            result += i * i * i;
        }

        return result;
    }
}
