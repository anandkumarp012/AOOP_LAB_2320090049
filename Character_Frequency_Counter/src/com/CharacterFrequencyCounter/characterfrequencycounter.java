package com.CharacterFrequencyCounter;
import java.util.HashMap;
import java.util.Map;
public class characterfrequencycounter {
	public static Map<Character, Integer> countFrequency(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        return frequencyMap;
    }
}
