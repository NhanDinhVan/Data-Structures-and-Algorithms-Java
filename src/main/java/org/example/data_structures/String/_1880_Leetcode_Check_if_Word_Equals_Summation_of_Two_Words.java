package org.example.data_structures.String;

/**
 * _1880_Leetcode_Check_if_Word_Equals_Summation_of_Two_Words
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/3/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/3/2024    NhanDinhVan    Create
 */

public class _1880_Leetcode_Check_if_Word_Equals_Summation_of_Two_Words {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int sum = 0;
        int firstSum = 0;
        int secondSum = 0;

        for(int i = 0; i < firstWord.length(); i++){
            firstSum = 10 * firstSum + (firstWord.charAt(i) - 'a');
        }
        for(int i = 0; i < secondWord.length(); i++){
            secondSum = 10 * secondSum + (secondWord.charAt(i) - 'a');
        }
        for(int i = 0; i < targetWord.length(); i++){
            sum = 10 * sum + (targetWord.charAt(i) - 'a');
        }
        return (firstSum + secondSum) == sum;
    }
}
