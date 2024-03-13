package kyu8;

/**
 * Основные математические операции
 * <p>
 * Ваша задача - создать функцию, которая выполняет четыре основные математические операции.
 * <p>
 * Функция должна принимать три аргумента - operation(string/char), value1(число), value2(число).
 * Функция должна возвращать результат в виде чисел после применения выбранной операции.
 * <p>
 * Examples(Operator, value1, value2) --> output
 * ('+', 4, 7) --> 11
 * ('-', 15, 18) --> -3
 * ('*', 5, 5) --> 25
 * ('/', 49, 7) --> 7
 */
public class BasicMathematicalOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        return switch (op) {
            case "+" -> addition(v1, v2);
            case "-" -> subtraction(v1, v2);
            case "*" -> multiplication(v1, v2);
            case "/" -> division(v1, v2);
            default -> 0;
        };
    }

    public static Integer addition(int a, int b) {
        return a + b;
    }

    public static Integer subtraction(int a, int b) {
        return a - b;
    }

    public static Integer multiplication(int a, int b) {
        return a * b;
    }

    public static Integer division(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException ae) {
            return 0;
        }
    }
}
