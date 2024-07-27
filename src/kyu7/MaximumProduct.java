package kyu7;

import java.util.ArrayList;

/**
 * ћаксимальный продукт
 * <p>
 * «адача
 * ƒан массив целых чисел.
 * Ќайдите максимальный продукт,
 * полученный в результате умножени€ двух соседних чисел в массиве.
 * <p>
 * ѕримечани€
 * –азмер массива/списка не менее 2. *
 * „исла массива/списка могут представл€ть собой смесь
 * положительных, отрицательных и нулей.
 * <p>
 * Input >> Output Examples:
 * <p>
 * adjacentElementsProduct([1, 2, 3]); ==> return 6
 * Explanation:
 * ћаксимальный продукт получаетс€ в результате умножени€ 2 * 3 = 6, и это соседние числа в массиве.
 * <p>
 * adjacentElementsProduct([9, 5, 10, 2, 24, -1, -48]); ==> return 50
 * Explanation:
 * ћаксимальное произведение, полученное в результате умножени€ 5 * 10 = 50.
 * <p>
 * adjacentElementsProduct([-23, 4, -5, 99, -27, 329, -2, 7, -921])  ==>  return -14
 * Explanation:
 * ћаксимальный продукт, полученный в результате умножени€ -2 * 7 = -14, и это соседние числа в массиве.
 */
public class MaximumProduct {
    public static void main(String[] args) {
        System.out.println(adjacentElementsProduct(new int[]{1, 2, 3}));
        System.out.println(adjacentElementsProduct(new int[]{-5, 8}));
    }

    public static int adjacentElementsProduct(int[] array) {
        var list = new ArrayList<Integer>();

        for (int i = 1; i < array.length; i++) {
            list.add(array[i - 1] * array[i]);
        }

        return list.stream()
                .reduce(Integer::max)
                .orElse(0);
    }

    //public int adjacentElementsProduct(int[] array) {    //
    //    return IntStream.range(1, array.length)
    //                    .map(i -> array[i - 1] * array[i])
    //                    .max()
    //                    .getAsInt();
    //  }
}
