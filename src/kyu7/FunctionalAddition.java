package kyu7;

import java.util.function.IntUnaryOperator;

/**
 * Функциональное дополнение
 * <p>
 * Создайте функцию add(n),
 * которая возвращает функцию,
 * которая всегда добавляет n к любому числу.
 * <p>
 * Примечание для Java: тип возвращаемого значения и методы не указаны, что усложняет задачу.
 * <p>
 * ...returnType addOne = Kata.add(1);
 * addOne.method(3) => 4
 */
public class FunctionalAddition {
    public static void main(String[] args) {
        System.out.println(add(3).applyAsInt(5));
    }

    public static IntUnaryOperator add(int n) {
        return operand -> operand + n;
    }
}
