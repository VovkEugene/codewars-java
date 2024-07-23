package kyu7;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * ����������� ����
 * <p>
 * �������� �����,
 * ������� ��������� ���� �������� � �������� �����,
 * � ����� ������������ ��� ���,
 * ������� ��� � ��������� �����
 * � ���������� ��������������� ������.
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
