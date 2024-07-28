package kyu6;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Разница в массиве
 * <p>
 * Ваша цель в этом ката — реализовать функцию разности,
 * которая вычитает один список из другого и возвращает результат.
 * <p>
 * Следует удалить все значения из списка a,
 * которые присутствуют в списке b, сохраняя их порядок.
 * <p>
 * Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
 * <p>
 * Если значение присутствует в b, все его вхождения должны быть удалены из другого:
 * Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
 */
public class ArrayDiff {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2}, new int[]{1})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{1})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{2})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{}, new int[]{1, 2})));
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        var list = new LinkedList<Integer>();

        for (int item : a) {
            if (!contains(b, item)) {
                list.add(item);
            }
        }

        return list.stream()
                .mapToInt(Integer::valueOf)
                .toArray();
    }

    private static boolean contains(int[] array, int value) {
        for (var item : array) {
            if (item == value) {
                return true;
            }
        }

        return false;
    }

    //public static int[] arrayDiff(int[] a, int[] b) {
    //        List<Integer> listA = Arrays.stream(a)
    //              .boxed()
    //              .collect(Collectors.toList());
    //        List<Integer> listB = Arrays.stream(b)
    //              .boxed()
    //              .collect(Collectors.toList());

    //        listA.removeAll(listB);

    //        return listA.stream()
    //              .mapToInt(e -> e)
    //              .toArray();
    //    }

    //public static int[] arrayDiff(int[] a, int[] b) {
    //    return IntStream.of(a)
    //          .filter(x -> IntStream.of(b)
    //              .noneMatch(y -> y == x))
    //          .toArray();
    //  }
}
