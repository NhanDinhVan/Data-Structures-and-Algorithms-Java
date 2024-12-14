package org.example.math;

import java.util.Stack;

public class _504_Leetcode_Base_7 {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        boolean isNegative = false;

        if(num < 0){
            isNegative = true;
            num = Math.abs(num);
        }
        while(num > 0){
            sb.append(num%7);
            num = num/7;
        }
        if(isNegative) sb.append("-");

        return sb.reverse().toString();
    }
}
