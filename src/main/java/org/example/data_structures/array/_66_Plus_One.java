package org.example.data_structures.array;

import java.util.Arrays;

public class _66_Plus_One {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n - 1; i >= 0 ; i--)
        {
            if(digits[i] < 9)
            {
                digits[i] +=1;
                return digits;
            }
                digits[i] = 0;
        }
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits = {1,1,2};
        System.out.println(
                Arrays.toString(plusOne(digits))
        );
    }
}
