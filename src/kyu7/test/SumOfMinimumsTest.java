package kyu7.test;

import kyu7.SumOfMinimums;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumOfMinimumsTest {

    @Test
    @DisplayName("Test example from the problem statement")
    void testExample() {
        int[][] input = {
                {1, 2, 3, 4, 5},
                {5, 6, 7, 8, 9},
                {20, 21, 34, 56, 100}
        };
        assertThat(SumOfMinimums.sumOfMinimums(input)).isEqualTo(26);
    }

    @Test
    @DisplayName("Test single row with multiple elements")
    void testSingleRow() {
        int[][] input = {{5, 2, 8, 1}};
        assertThat(SumOfMinimums.sumOfMinimums(input)).isEqualTo(1);
    }

    @Test
    @DisplayName("Test rows with minimums in different positions")
    void testMixedMinPositions() {
        int[][] input = {
                {3, 1, 2},
                {4, 0, 5},
                {2, 5, 1}
        };
        assertThat(SumOfMinimums.sumOfMinimums(input)).isEqualTo(1 + 0 + 1);
    }

    @Test
    @DisplayName("Test with duplicate minimum values in rows")
    void testDuplicateMinValues() {
        int[][] input = {
                {4, 4, 4},
                {5, 5, 2, 2}
        };
        assertThat(SumOfMinimums.sumOfMinimums(input)).isEqualTo(4 + 2);
    }

    @Test
    @DisplayName("Test single element matrix")
    void testSingleElement() {
        int[][] input = {{7}};
        assertThat(SumOfMinimums.sumOfMinimums(input)).isEqualTo(7);
    }

    @Test
    @DisplayName("Test matrix with varying row lengths")
    void testVariableRowLengths() {
        int[][] input = {
                {2, 3},
                {5},
                {1, 4, 6}
        };
        assertThat(SumOfMinimums.sumOfMinimums(input)).isEqualTo(2 + 5 + 1);
    }
}