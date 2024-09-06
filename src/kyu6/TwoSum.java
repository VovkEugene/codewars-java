package kyu6;

import java.util.Arrays;

/**
 * Напишите метод, который принимает массив чисел (целые числа для тестов) и целевое число.
 * Он должен найти в массиве два разных элемента, которые при сложении дают целевое значение.
 * Индексы этих элементов затем должны быть возвращены в списке следующим образом:
 * (индекс1, индекс2).
 * <p>
 * Для целей данного ката некоторые тесты могут иметь несколько ответов;
 * любые действительные решения будут приняты.
 * <p>
 * Ввод всегда будет действительным (числа будут представлять собой массив длиной 2 или больше,
 * и все элементы будут числами;
 * цель всегда будет суммой двух разных элементов из этого массива).
 */
public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3}, 4)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int lengthArray = numbers.length;

        for (int i = 0; i < lengthArray; i++) {
            for (int j = 0; j < lengthArray; j++) {
                if (i != j && numbers[i] + numbers[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }
}
