package kyu7;

import java.math.BigInteger;

import static java.util.stream.IntStream.rangeClosed;

public class Factorial {
    public static int factorial(int n) {
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException();
        }

        return (rangeClosed(1, n)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply))
                .intValue();
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
