package kyu7;

/**
 * Двоичное сложение
 * Реализуйте функцию, которая складывает два числа и возвращает их сумму в двоичном формате.
 * Преобразование может быть выполнено до или после сложения.
 * <p>
 * Возвращаемое двоичное число должно быть строкой.
 */
public class BinaryAddition {
    public static String binaryAddition(int a, int b) {
        return Integer.toBinaryString(a + b);
    }
}
