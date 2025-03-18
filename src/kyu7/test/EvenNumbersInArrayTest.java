package kyu7.test;

import kyu7.EvenNumbersInArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EvenNumbersInArrayTest {
    @Test
    @DisplayName("Basic example from problem description")
    void testBasicExample() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expected = {4, 6, 8};
        assertThat(EvenNumbersInArray.evenNumbers(input, 3)).containsExactly(expected);
    }

    @Test
    @DisplayName("Negative numbers and multiple even elements")
    void testNegativeNumbers() {
        int[] input = {-22, 5, 3, 11, 26, -6, -7, -8, -9, -8, 26};
        int[] expected = {-8, 26};
        assertThat(EvenNumbersInArray.evenNumbers(input, 2)).containsExactly(expected);
    }

    @Test
    @DisplayName("Single element result")
    void testSingleElement() {
        int[] input = {6, -25, 3, 7, 5, 5, 7, -3, 23};
        assertThat(EvenNumbersInArray.evenNumbers(input, 1)).containsExactly(6);
    }

    @Test
    @DisplayName("All even numbers array")
    void testAllEvenNumbers() {
        int[] input = {2, 4, 6, 8, 10};
        int[] expected = {4, 6, 8, 10};
        assertThat(EvenNumbersInArray.evenNumbers(input, 4)).containsExactly(expected);
    }

    @Test
    @DisplayName("Zeros in array")
    void testWithZeros() {
        int[] input = {0, 1, 0, 3, 0};
        int[] expected = {0, 0};
        assertThat(EvenNumbersInArray.evenNumbers(input, 2)).containsExactly(expected);
    }

    @Test
    @DisplayName("Full set of even numbers")
    void testFullSet() {
        int[] input = {2, 4, 6, 8};
        assertThat(EvenNumbersInArray.evenNumbers(input, 4)).containsExactly(input);
    }

    @Test
    @DisplayName("Even numbers at the end")
    void testEvenAtEnd() {
        int[] input = {1, 3, 5, 2, 4, 6};
        int[] expected = {2, 4, 6};
        assertThat(EvenNumbersInArray.evenNumbers(input, 3)).containsExactly(expected);
    }
}