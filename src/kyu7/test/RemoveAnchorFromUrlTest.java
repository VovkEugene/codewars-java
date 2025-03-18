package kyu7.test;

import kyu7.RemoveAnchorFromUrl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveAnchorFromUrlTest {
    @Test
    @DisplayName("Should remove anchor with content when anchor exists")
    void removeAnchorWithContent() {
        String input = "www.codewars.com#about";
        String expected = "www.codewars.com";
        assertThat(RemoveAnchorFromUrl.removeUrlAnchor(input)).isEqualTo(expected);
    }

    @Test
    @DisplayName("Should return original URL when no anchor present")
    void noAnchorPresent() {
        String input = "www.codewars.com?page=1";
        assertThat(RemoveAnchorFromUrl.removeUrlAnchor(input)).isEqualTo(input);
    }

    @Test
    @DisplayName("Should remove anchor when it's at the end")
    void anchorAtEnd() {
        assertThat(RemoveAnchorFromUrl.removeUrlAnchor("example.com#"))
                .isEqualTo("example.com");
    }

    @Test
    @DisplayName("Should handle multiple anchors by removing from first occurrence")
    void multipleAnchors() {
        assertThat(RemoveAnchorFromUrl.removeUrlAnchor("site.com#part1#part2"))
                .isEqualTo("site.com");
    }

    @Test
    @DisplayName("Should preserve query parameters before anchor")
    void queryParametersBeforeAnchor() {
        assertThat(RemoveAnchorFromUrl.removeUrlAnchor("site.com/page?query=1#anchor"))
                .isEqualTo("site.com/page?query=1");
    }

    @Test
    @DisplayName("Should handle empty input string")
    void emptyInput() {
        assertThat(RemoveAnchorFromUrl.removeUrlAnchor("")).isEmpty();
    }

    @Test
    @DisplayName("Should return empty string when only anchor exists")
    void onlyAnchor() {
        assertThat(RemoveAnchorFromUrl.removeUrlAnchor("#anchor")).isEmpty();
    }
}