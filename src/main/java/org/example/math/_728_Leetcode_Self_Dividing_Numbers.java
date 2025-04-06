package org.example.math;

import java.util.ArrayList;
import java.util.List;

/**
 * _728_Leetcode_Self_Dividing_Numbers
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/6/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/6/2025    NhanDinhVan    Create
 */

public class _728_Leetcode_Self_Dividing_Numbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i = left; i <= right; i++)
            if(check(i)) ans.add(i);
        return ans;
    }

    public static boolean check(int n){
        int original = n;
        while(n > 0){
            int d = n % 10;
            if(d == 0 || original % d != 0) return false;
            n /= 10;
        }
        return true;
    }
}
