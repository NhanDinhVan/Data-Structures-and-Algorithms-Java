package org.example.data_structures.String;

/**
 * _43_Leetcode_Multiply_Strings
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/11/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/11/2024    NhanDinhVan    Create
 */

public class _43_Leetcode_Multiply_Strings {
    public static String multiply(String num1, String num2) {
//        Failed Solution
//
//        if(num1.equals("0") || num2.equals("0")) return "0";
//
//        long n1 = 0;
//        long n2 = 0;
//
//        for(int i = 0; i < num1.length(); i++){
//            n1 = n1*10 + (num1.charAt(i) - '0');
//        }
//        for(int i = 0; i < num2.length(); i++){
//            n2 = n2*10 + (num2.charAt(i) - '0');
//        }
//        return String.valueOf(n1 * n2);

        if(num1.equals("0") || num2.equals("0")) return "0";

        int n1 = num1.length();
        int n2 = num2.length();
        int[] ans = new int[n1 + n2];

        for(int i = n1 - 1; i >= 0; i--){
            for(int j = n2 - 1; j >= 0; j--){
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = mul + ans[p2];

                ans[p1] += sum / 10;
                ans[p2] = sum % 10;
            }
        }

        StringBuilder strAns = new StringBuilder();
        for(int s : ans){
            if(!(strAns.length() == 0 && s == 0)){
                strAns.append(s);
            }
        }
        return strAns.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("123", "456"));
    }
}
