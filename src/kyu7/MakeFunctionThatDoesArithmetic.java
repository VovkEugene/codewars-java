package kyu7;

/**
 * Создайте функцию, которая выполняет арифметические действия!
 * -----------------------------------------------------------
 * Даны два числа и арифметический оператор (его название в виде строки),
 * верните результат для двух чисел, для которых используется этот оператор.
 * -----------------------------------------------------------
 * a и b будут целыми положительными числами,
 * и a всегда будет первым числом в операции,
 * а b всегда вторым.
 * -----------------------------------------------------------
 * Это четыре оператора: "сложение", "вычитание", "деление", "умножение".
 * 5, 2, "add"      --> 7
 * 5, 2, "subtract" --> 3
 * 5, 2, "multiply" --> 10
 * 5, 2, "divide"   --> 2.5
 */
public class MakeFunctionThatDoesArithmetic {
    public static int arithmetic(int a, int b, String operator) {
        int result;

        switch (operator) {
            case "add" -> result = a + b;
            case "subtract" -> result = a - b;
            case "multiply" -> result = a * b;
            case "divide" -> result = a / b;
            default -> throw new IllegalStateException(
                    "Unexpected value: " + operator
            );
        }

        return result;
    }
}
