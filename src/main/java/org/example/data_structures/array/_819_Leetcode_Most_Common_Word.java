package org.example.data_structures.array;

import java.util.*;

/**
 * _819_Leetcode_Most_Common_Word
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/3/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/3/2025    NhanDinhVan    Create
 */

public class _819_Leetcode_Most_Common_Word {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedWords = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> wordCount = new HashMap<>();

        String[] words = paragraph
                .toLowerCase()
                .replaceAll("[!?',;\\.]", " ")
                .split("\\s+");

        for (String word : words) {
            if (!bannedWords.contains(word) && !word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        String mostCommon = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommon = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostCommon;
    }
}
