package org.example.sliding_window;

/**
 * _2269_Leetcode_Find_the_K_Beauty_of_a_Number
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/22/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/22/2024    NhanDinhVan    Create
 */

public class _2269_Leetcode_Find_the_K_Beauty_of_a_Number {
    public static int divisorSubstrings(int num, int k) {
//        int ans = 0;
//        String numString = String.valueOf(num);
//        System.out.println(numString);
//        for(int i = 0, j = k -1; j < numString.length(); j++, i++){
//            int divisor = 0;
//            for(int n = i; n <= j; n++){
//                divisor = divisor*10 + Integer.parseInt(String.valueOf(numString.charAt(n)));
//            }
//            System.out.println(divisor);
//            if(divisor == 0){
//                continue;
//            }
//            if(num % divisor == 0) ans++;
//        }
//        return ans;
        int ans = 0;
        String numString = String.valueOf(num);
        System.out.println(numString);
        for(int i = 0, j = k -1; j < numString.length(); j++, i++){
            int divisor = Integer.parseInt(String.valueOf(numString.substring(i,j+1)));
            System.out.println(divisor);
            if(divisor == 0){
                continue;
            }
            if(num % divisor == 0) ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        divisorSubstrings(100, 2);
    }
}
