package kyu7.test;

import kyu7.SummingNumberDigits;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SummingNumberDigitsTest {

    @Test
    @DisplayName("Test basic example: 10 → 1")
    void testBasicExample1() {
        assertThat(SummingNumberDigits.sumDigits(10)).isEqualTo(1);
    }

    @Test
    @DisplayName("Test double digits: 99 → 18")
    void testDoubleDigits() {
        assertThat(SummingNumberDigits.sumDigits(99)).isEqualTo(18);
    }

    @Test
    @DisplayName("Test negative number: -32 → 5")
    void testNegativeNumber() {
        assertThat(SummingNumberDigits.sumDigits(-32)).isEqualTo(5);
    }

    @Test
    @DisplayName("Test zero input: 0 → 0")
    void testZero() {
        assertThat(SummingNumberDigits.sumDigits(0)).isZero();
    }

    @Test
    @DisplayName("Test number with internal zeros: 100 → 1")
    void testInternalZeros() {
        assertThat(SummingNumberDigits.sumDigits(100)).isEqualTo(1);
    }

    @Test
    @DisplayName("Test single positive digit: 5 → 5")
    void testSinglePositiveDigit() {
        assertThat(SummingNumberDigits.sumDigits(5)).isEqualTo(5);
    }

    @Test
    @DisplayName("Test single negative digit: -5 → 5")
    void testSingleNegativeDigit() {
        assertThat(SummingNumberDigits.sumDigits(-5)).isEqualTo(5);
    }

    @Test
    @DisplayName("Test large number: 12345 → 15")
    void testLargeNumber() {
        assertThat(SummingNumberDigits.sumDigits(12345)).isEqualTo(15);
    }

    @Test
    @DisplayName("Test mixed digits with zero: 102 → 3")
    void testMixedDigitsWithZero() {
        assertThat(SummingNumberDigits.sumDigits(102)).isEqualTo(3);
    }
}