package kyu8;

/**
 * Возвращающие строки
 * <p>
 * Создайте функцию, которая будет возвращать инструкцию приветствия, использующую ввод;
 * ваша программа должна возвращать: "Hello, <name> how are you doing today?".
 * [Убедитесь, что вы вводите именно то, что я написал, иначе программа может выполняться неправильно]
 */
public class ReturningStrings {
    public static String greet(String name) {
        return "Hello, " + name + " how are you doing today?";
    }
}
