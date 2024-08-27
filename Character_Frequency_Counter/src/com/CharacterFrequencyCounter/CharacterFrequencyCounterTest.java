package com.CharacterFrequencyCounter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;
public class CharacterFrequencyCounterTest {
	@Test
    void testSimpleString() {
        String input = "hello";
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('h', 1);
        expected.put('e', 1);
        expected.put('l', 2);
        expected.put('o', 1);

        assertEquals(expected, characterfrequencycounter.countFrequency(input));
    }

    @Test
    void testRepeatedCharacters() {
        String input = "aaaa";
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 4);

        assertEquals(expected, characterfrequencycounter.countFrequency(input));
    }

    @Test
    void testMixedCaseCharacters() {
        String input = "Hello";
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('H', 1);
        expected.put('e', 1);
        expected.put('l', 2);
        expected.put('o', 1);

        assertEquals(expected, characterfrequencycounter.countFrequency(input));
    }

    @Test
    void testSpecialCharacters() {
        String input = "he@llo!!";
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('h', 1);
        expected.put('e', 1);
        expected.put('@', 1);
        expected.put('l', 2);
        expected.put('o', 1);
        expected.put('!', 2);

        assertEquals(expected, characterfrequencycounter.countFrequency(input));
    }

    @Test
    void testEmptyString() {
        String input = "";
        Map<Character, Integer> expected = new HashMap<>();

        assertEquals(expected, characterfrequencycounter.countFrequency(input));
    }

    @Test
    void testStringWithNumbers() {
        String input = "a1b2c3";
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 1);
        expected.put('1', 1);
        expected.put('b', 1);
        expected.put('2', 1);
        expected.put('c', 1);
        expected.put('3', 1);

        assertEquals(expected, characterfrequencycounter.countFrequency(input));
    }

    @Test
    void testStringWithWhitespace() {
        String input = "a b c ";
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 1);
        expected.put(' ', 3);
        expected.put('b', 1);
        expected.put('c', 1);

        assertEquals(expected, characterfrequencycounter.countFrequency(input));
    }
}
