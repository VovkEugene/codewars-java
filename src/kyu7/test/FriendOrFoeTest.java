package kyu7.test;

import kyu7.FriendOrFoe;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FriendOrFoeTest {
    @Test
    @DisplayName("Should filter names with exactly 4 characters")
    void testFriendFiltering() {
        List<String> input = Arrays.asList("Ryan", "Kieran", "Jason", "Yous");
        List<String> result = FriendOrFoe.friend(input);
        assertThat(result)
                .containsExactly("Ryan", "Yous")
                .hasSize(2)
                .allMatch(name -> name.length() == 4);
    }

    @Test
    @DisplayName("Should return empty list when no names have 4 characters")
    void testNoFriendsFound() {
        List<String> input = Arrays.asList("Peter", "Stephen", "Joe");
        List<String> result = FriendOrFoe.friend(input);
        assertThat(result).isEmpty();
    }

    @Test
    @DisplayName("Should handle empty input list")
    void testEmptyInput() {
        List<String> input = Collections.emptyList();
        List<String> result = FriendOrFoe.friend(input);
        assertThat(result).isEmpty();
    }

    @Test
    @DisplayName("Should return all names when all have 4 characters")
    void testAllFriends() {
        List<String> input = Arrays.asList("Anna", "John", "Mike", "Lara");
        List<String> result = FriendOrFoe.friend(input);
        assertThat(result)
                .containsExactlyElementsOf(input)
                .hasSize(4);
    }
}