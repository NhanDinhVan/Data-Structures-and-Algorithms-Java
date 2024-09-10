package org.example.math;

/**
 * _67_Leetcode_Add_Binary
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/10/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/10/24   NhanDinhVan    Create
 */
public class _67_Leetcode_Add_Binary {
    /*
    * Input:    "1010", "1011"
    * Output:   "10101"
    *
    *
    * */
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while( j >= 0 || i >= 0 || carry == 1 ){
            int sum = carry;
            if(i >= 0){
                sum += a.charAt(i) - '0';
                i--;
            }
            if(j >= 0){
                sum += b.charAt(j) - '0';
                j--;
            }
            res.insert(0, sum%2);
            carry = sum/2;
        }
        return res.toString();
    }
}
