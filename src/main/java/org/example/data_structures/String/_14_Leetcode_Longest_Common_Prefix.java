package org.example.data_structures.String;

import java.util.ArrayList;
import java.util.List;

/**
 * _14_Leetcode_Longest_Common_Prefix
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/30/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/30/24   NhanDinhVan    Create
 */
public class _14_Leetcode_Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < strs[0].length(); i++){
            boolean check = true;
            for(int j = 0 ; j < strs.length; j++){
                if(i >= strs[j].length()){
                    check = false;
                    break;
                }
                if(strs[j].charAt(i) != strs[0].charAt(i))
                    check = false;
            }
            if(check){
                result.append(strs[0].charAt(i));
            }else{
                return result.toString();
            }
        }
        return result.toString();
    }
}
