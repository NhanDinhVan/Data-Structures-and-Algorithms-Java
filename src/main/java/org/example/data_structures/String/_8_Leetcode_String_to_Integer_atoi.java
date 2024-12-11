package org.example.data_structures.String;

public class _8_Leetcode_String_to_Integer_atoi {
    public int myAtoi(String s) {
        s = s.trim();

        if (s.isEmpty()) return 0;

        int ans = 0;
        int index = 0;
        boolean negative = false;

        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            negative = s.charAt(index) == '-';
            index++;
        }

        while (index < s.length()) {
            char c = s.charAt(index);
            if (c < '0' || c > '9') break;

            int digit = c - '0';

            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            ans = ans * 10 + digit;
            index++;
        }

        return negative ? -ans : ans;
    }
}
