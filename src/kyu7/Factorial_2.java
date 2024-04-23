package kyu7;

import java.math.BigInteger;

import static java.util.stream.IntStream.rangeClosed;

public class Factorial_2 {
    public static long factorial(int n) {
        return (rangeClosed(1, n)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply))
                .longValue();
    }
}
