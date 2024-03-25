package kyu7;

import java.util.List;

/**
 * Фильтрация списка
 * <p>
 * В этом ката вы создадите функцию, которая принимает список неотрицательных целых чисел и строк
 * и возвращает новый список с отфильтрованными строками.
 * <p>
 * Example
 * Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
 * Kata.filterList(List.of(1, "a", "b", 0, 15)) => List.of(1,0,15)
 * Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 123)) => List.of(1, 2, 123)
 */
public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(item -> item instanceof Integer)
                .toList();
    }

    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b")));
    }
}
