package org.example.math;

public class _258_Leetcode_Add_Digits {
    public int addDigits(int num) {
        if (num < 10) return num;
        return addDigits(num / 10 + num % 10);
    }
}
