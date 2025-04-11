package org.example.data_structures.String;

/**
 * _2843_Leetcode_Count_Symmetric_Integers
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/11/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/11/2025    NhanDinhVan    Create
 */

public class _2843_Leetcode_Count_Symmetric_Integers {
    public int countSymmetricIntegers(int low, int high) {
        int ans = 0;
        for(int i = low ; i <= high; i++){
            if(check(i)){
                ans++;
                System.out.println(i);

            }
        }
        return ans;
    }
    public boolean check(int n){
        String s = String.valueOf(n);
        int t1 = 0;
        int t2 = 0;
        for(int i = 0; i < s.length(); i++){
            if(i < s.length() / 2) t1 += s.charAt(i);
            else t2 += s.charAt(i);
        }
        return t1 == t2;
    }
}
