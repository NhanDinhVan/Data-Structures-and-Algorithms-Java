package org.example.data_structures.String;

/**
 * _2129_Leetcode_Capitalize_the_Title
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/24/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/24/2025    NhanDinhVan    Create
 */

public class _2129_Leetcode_Capitalize_the_Title {
    public String capitalizeTitle(String title) {
        String[] strArr = title.split(" ");
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].length() <= 2){
                ans.append(strArr[i].toLowerCase() + " ");
                continue;
            }

            for(int j = 0; j < strArr[i].length(); j++){
                if(j == 0){
                    ans.append(Character.toUpperCase(strArr[i].charAt(j)));
                    continue;
                }
                ans.append(Character.toLowerCase(strArr[i].charAt(j)));
            }
            ans.append(" ");
        }

        ans.setLength(ans.length() - 1);
        return ans.toString();
    }
}
