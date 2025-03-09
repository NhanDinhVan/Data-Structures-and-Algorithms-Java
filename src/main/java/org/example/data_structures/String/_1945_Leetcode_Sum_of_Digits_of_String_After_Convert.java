package org.example.data_structures.String;

/**
 * _1945_Leetcode_Sum_of_Digits_of_String_After_Convert
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/9/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/9/2025    NhanDinhVan    Create
 */

public class _1945_Leetcode_Sum_of_Digits_of_String_After_Convert {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            sb.append(s.charAt(i) - 'a' + 1);
        }

        while(k > 0){
            int tmp = 0;
            for(char c : sb.toString().toCharArray()){
                tmp += c - '0';
            }
            sb = new StringBuilder(String.valueOf(tmp));
            k--;
        }

//        System.out.println(sb.toString());

        return Integer.parseInt(sb.toString());
    }
}
