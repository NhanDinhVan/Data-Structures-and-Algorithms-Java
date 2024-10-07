package org.example.data_structures.String;

import java.util.HashMap;

/**
 * _1813_Leetcode_Sentence_Similarity_III
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/6/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/6/2024    NhanDinhVan    Create
 */

public class _1813_Leetcode_Sentence_Similarity_III {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");

        if(s1.length < s2.length){
            String[] tmp = s1;
            s1 = s2;
            s2 = tmp;
        }
        int start = 0;
        int end = 0;
        while (start < s1.length && s1[start].equals(s2[start])) {
            start++;
        }
        while (end < s1.length && s1[s1.length - end - 1].equals(s2[s2.length - end - 1])) {
            end++;
        }
        return start + end >= s2.length;
    }
}
