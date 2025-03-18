package kyu7.test;

import kyu7.FindTheCapitals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindTheCapitalsTest {

    @Test
    @DisplayName("Should return indices of uppercase letters for mixed case string")
    void testMixedCaseString() {
        String input = "CodEWaRs";
        int[] expected = {0, 3, 4, 6};
        assertThat(FindTheCapitals.capitals(input)).containsExactly(expected);
    }

    @Test
    @DisplayName("Should return all indices when all letters are uppercase")
    void testAllUppercase() {
        String input = "HELLO";
        int[] expected = {0, 1, 2, 3, 4};
        assertThat(FindTheCapitals.capitals(input)).containsExactly(expected);
    }

    @Test
    @DisplayName("Should return empty array when no uppercase letters")
    void testAllLowercase() {
        String input = "abcdefg";
        assertThat(FindTheCapitals.capitals(input)).isEmpty();
    }

    @Test
    @DisplayName("Should handle single uppercase letter at start")
    void testSingleUppercaseAtStart() {
        String input = "Apple";
        int[] expected = {0};
        assertThat(FindTheCapitals.capitals(input)).containsExactly(expected);
    }

    @Test
    @DisplayName("Should handle single uppercase letter at end")
    void testSingleUppercaseAtEnd() {
        String input = "bananA";
        int[] expected = {5};
        assertThat(FindTheCapitals.capitals(input)).containsExactly(expected);
    }

    @Test
    @DisplayName("Should handle consecutive uppercase letters")
    void testConsecutiveUppercase() {
        String input = "JAVAScript";
        int[] expected = {0, 1, 2, 3, 4};
        assertThat(FindTheCapitals.capitals(input)).containsExactly(expected);
    }
}