package kyu7;

/**
 * Сумма чисел
 * 
 * Даны два целых числа a и b, которые могут быть положительными или отрицательными,
 * найдите сумму всех чисел между ними и включая их, и верните ее.
 * Если два числа равны, верните a или b.
 * Обратите внимание: a и b не упорядочены!
 * Examples (a, b) --> output (explanation)
 * (1, 0) --> 1 (1 + 0 = 1)
 * (1, 2) --> 3 (1 + 2 = 3)
 * (0, 1) --> 1 (0 + 1 = 1)
 * (1, 1) --> 1 (1 since both are same)
 * (-1, 0) --> -1 (-1 + 0 = -1)
 * (-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
 */
public class SumOfNumbers {
    static public int GetSum(int a, int b) {
        return a > b ? sum(b, a) : sum(a, b);
    }

    static int sum(int a, int b) {
        int result = 0;

        for (int i = a; i <= b; i++) {
            result += i;

        }

        return result;
    }
}
