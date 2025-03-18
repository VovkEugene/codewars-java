package kyu7.test;

import kyu7.FizzBuzz;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    @Test
    @DisplayName("Test n=3 → [\"1\", \"2\", \"Fizz\"]")
    void testFizzCase() {
        String[] result = FizzBuzz.fizzBuzz(3);
        assertThat(result).containsExactly("1", "2", "Fizz");
    }

    @Test
    @DisplayName("Test n=5 → contains \"Buzz\" at position 4")
    void testBuzzCase() {
        String[] result = FizzBuzz.fizzBuzz(5);
        assertThat(result).containsExactly("1", "2", "Fizz", "4", "Buzz");
    }

    @Test
    @DisplayName("Test n=15 → \"FizzBuzz\" at position 14")
    void testFizzBuzzCase() {
        String[] result = FizzBuzz.fizzBuzz(15);
        assertThat(result[14]).isEqualTo("FizzBuzz");
    }

    @Test
    @DisplayName("Test n=1 → single element array [\"1\"]")
    void testMinimalInput() {
        String[] result = FizzBuzz.fizzBuzz(1);
        assertThat(result).containsExactly("1");
    }

    @Test
    @DisplayName("Test n=2 → no replacements")
    void testNoReplacements() {
        String[] result = FizzBuzz.fizzBuzz(2);
        assertThat(result).containsExactly("1", "2");
    }

    @Test
    @DisplayName("Test n=15 full verification")
    void testComplexCase() {
        String[] expected = {
                "1", "2", "Fizz", "4", "Buzz",
                "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz"
        };
        String[] result = FizzBuzz.fizzBuzz(15);
        assertThat(result).containsExactly(expected);
    }
}