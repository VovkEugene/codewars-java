package kyu7;

/**
 * Напишите метод, который принимает число в качестве входных данных
 * и возвращает сумму абсолютных значений каждой из десятичных цифр числа.
 * ---
 * 10 --> 1
 * 99 --> 18
 * -32 --> 5
 */
public class SummingNumberDigits {
    public static int sumDigits(int number) {
        return String.valueOf(Math.abs(number))
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }
}
