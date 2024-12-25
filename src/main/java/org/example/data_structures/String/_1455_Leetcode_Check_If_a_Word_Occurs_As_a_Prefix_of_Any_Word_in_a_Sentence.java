package org.example.data_structures.String;

/**
 * _1455_Leetcode_Check_If_a_Word_Occurs_As_a_Prefix_of_Any_Word_in_a_Sentence
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/25/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/25/2024    NhanDinhVan    Create
 */

public class _1455_Leetcode_Check_If_a_Word_Occurs_As_a_Prefix_of_Any_Word_in_a_Sentence {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] sentenceArr = sentence.split(" ");
        for(int i = 0; i < sentenceArr.length; i++){
            String s = sentenceArr[i];
            boolean check = true;
            if(s.length()<searchWord.length()) continue;
            for(int j = 0; j < searchWord.length(); j++){
                if(s.charAt(j) != searchWord.charAt(j)){
                    check = false;
                    break;
                }
            }
            if(check) return i+1;
        }
        return -1;
    }
}
