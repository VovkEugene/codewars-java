package kyu7;

/**
 * Дан 2D массив размером m * n,
 * * ваша задача - найти сумму минимальных значений в каждой строке.
 * ---
 * [ [ 1, 2, 3, 4, 5 ]        #  minimum value of row is 1
 * , [ 5, 6, 7, 8, 9 ]        #  minimum value of row is 5
 * , [ 20, 21, 34, 56, 100 ]  #  minimum value of row is 20
 * ]
 * ---
 * Таким образом, метод должен возвращать 26,
 * * потому что сумма минимальных значений равна 1 + 5 + 20 = 26.
 */
public class SumOfMinimums {
    public static int sumOfMinimums(int[][] array) {
        int result = 0;
        for (int[] numbers : array) {
            int min = numbers[0];
            for (int number : numbers) {
                if (number < min) {
                    min = number;
                }
            }
            result += min;
        }
        return result;
    }
}
