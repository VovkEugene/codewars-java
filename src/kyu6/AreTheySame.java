package kyu6;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Они «одинаковые»?
 * <p>
 * Учитывая два массива a и b,
 * напишите метод comp(a, b), который проверяет, имеют ли два массива «одинаковые» элементы
 * с одинаковой кратностью (кратность элемента — это количество раз его появления).
 * «То же самое» здесь означает, что элементы в b являются элементами в квадрате,
 * независимо от порядка.
 */
public class AreTheySame {
    public static void main(String[] args) {
        System.out.println(comp(
                new int[]{121, 144, 19, 161, 19, 144, 19, 11},
                new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361}
        ));
        System.out.println(comp(
                new int[]{121, 144, 19, 161, 19, 144, 19, 11},
                new int[]{132, 14641, 20736, 361, 25921, 361, 20736, 361}
        ));
        System.out.println(comp(
                new int[0],
                new int[]{132, 14641, 20736, 361, 25921, 361, 20736, 361}
        ));

    }

    public static boolean comp(int[] a, int[] b) {
        if (isNotValid(a, b)) {
            return false;
        }

        return !removeSameValue(a, b);
    }

    private static boolean removeSameValue(int[] a, int[] b) {
        var list = getList(b);
        int value;

        for (var item : a) {
            value = (int) Math.pow(item, 2);

            if (!list.contains(value)) {
                return true;
            }

            list.remove(Integer.valueOf(value));
        }

        return false;
    }

    private static boolean isNotValid(int[] a, int[] b) {
        if (a == null) {
            return true;
        }

        if (b == null) {
            return true;
        }

        return a.length != b.length;
    }

    private static ArrayList<Integer> getList(int[] b) {
        return new ArrayList<>(Arrays.stream(b)
                .boxed()
                .toList());
    }
}
