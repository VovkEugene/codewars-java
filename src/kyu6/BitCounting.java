package kyu6;

import java.util.Objects;

import static java.lang.Integer.toBinaryString;
import static java.util.Arrays.stream;

/**
 * Подсчет битов
 * <p>
 * Напишите функцию, которая принимает на вход целое число
 * и возвращает количество битов,
 * равных единице в двоичном представлении этого числа.
 * Вы можете гарантировать, что ввод неотрицательен.
 * <p>
 * Пример: двоичное представление числа 1234 — 10011010010,
 * поэтому в этом случае функция должна возвращать 5.
 */
public class BitCounting {
    public static void main(String[] args) {
        System.out.println(countBits(1234));
        System.out.println(countBits(4));
        System.out.println(countBits(7));
        System.out.println(countBits(9));
        System.out.println(countBits(10));
    }

    public static int countBits(int n) {
        return (int) stream(toBinaryString(n).split(""))
                .filter(item -> Objects.equals(item, "1"))
                .map(Integer::parseInt)
                .count();
    }

//    public static int countBits(int n) {
//        return Integer.bitCount(n);
//    }
}
