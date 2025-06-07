package org.example.sliding_window;

/**
 * _1652_Leetcode_Defuse_the_Bomb
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/7/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/7/2024    NhanDinhVan    Create
 */

public class _1652_Leetcode_Defuse_the_Bomb {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int sum = 0;
        int[] result = new int[n];

        if(k == 0)
            return result;
        if(k > 0){
            for(int i = 1; i <= k ; i++)
                sum += code[i % n];
            for(int i = 0; i < n; i++){
                result[i] = sum;
                sum = sum - code[(i + 1)%n] + code[(i + k + 1) % n];
            }
        }else{
            for(int i = 1; i <= (-k); i++)
                sum += code[(n - i) % n];
            for(int i = 0; i < n; i++){
                result[i] = sum;
                sum = sum - code[(n + i - (-k)) % n] + code[(n+i)%n];
            }
        }
        return result;
    }
}
