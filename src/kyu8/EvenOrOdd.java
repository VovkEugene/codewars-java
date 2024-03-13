package kyu8;

/**
 * Четный или нечетный
 *
 * Создайте функцию, которая принимает целое число в качестве аргумента
 * и возвращает "Четное" для четных чисел или "Нечетное" для нечетных чисел.
 */

public class EvenOrOdd {
    public static String evenOrOdd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }
}
