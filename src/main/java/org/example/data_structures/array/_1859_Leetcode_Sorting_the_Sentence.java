package org.example.data_structures.array;

/**
 * _1859_Leetcode_Sorting_the_Sentence
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/1/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/1/24   NhanDinhVan    Create
 */
public class _1859_Leetcode_Sorting_the_Sentence {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sortedWords = new String[words.length];

        for (String word : words) {
            int index = word.charAt(word.length() - 1) - '0' - 1;
            sortedWords[index] = word.substring(0, word.length() - 1);
        }
        return String.join(" ", sortedWords);
    }
}
