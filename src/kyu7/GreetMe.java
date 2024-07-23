package kyu7;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * Приветствуй меня
 * <p>
 * Напишите метод,
 * который принимает один аргумент в качестве имени,
 * а затем приветствует это имя,
 * написав его с заглавной буквы
 * и заканчивая восклицательным знаком.
 * <p>
 * Example: *
 * "riley" --> "Hello Riley!"
 * "JACK"  --> "Hello Jack!"
 */
public class GreetMe {
    public static void main(String[] args) {
        System.out.println(greet("riley"));
        System.out.println(greet("JACK"));

    }

    public static String greet(String name) {
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

        return String.format("Hello %s!", name);
    }
}
