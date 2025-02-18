package org.example.daily_challenge;

/**
 * _2375_Leetcode_Construct_Smallest_Number_From_DI_String
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/18/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/18/2025    NhanDinhVan    Create
 */

public class _2375_Leetcode_Construct_Smallest_Number_From_DI_String {
    String smallest = null;
    public String smallestNumber(String pattern) {
        boolean[] used = new boolean[10];

        backtracking(pattern, used, new StringBuilder());

        return smallest;
    }

    public void backtracking(String pattern, boolean[] used, StringBuilder result){
        if(pattern.length() + 1 == result.length()){
            if(smallest == null || result.toString().compareTo(smallest) < 0){
                smallest = result.toString();
            }
            return;
        }

        for(int i = 1; i <= 9; i++){
            if(!used[i]){
                int len = result.length();

                if(len > 0){
                    char preChar = result.charAt(len - 1);

                    if((pattern.charAt(len - 1) == 'I' && preChar - '0' >= i) ||
                    (pattern.charAt(len - 1) == 'D' && preChar - '0' <= i)){
                        continue;
                    }
                }

                used[i] = true;
                result.append(i);
                backtracking(pattern, used, result);
                used[i] = false;
                result.deleteCharAt(result.length() - 1);
            }
        }
    }

}
