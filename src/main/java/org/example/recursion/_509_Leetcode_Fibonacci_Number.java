package org.example.recursion;

import java.util.HashMap;

/**
 * _509_Leetcode_Fibonacci_Number
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/4/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/4/2024    NhanDinhVan    Create
 */

public class _509_Leetcode_Fibonacci_Number {
    HashMap<Integer, Integer> memo = new HashMap<>();
    public int fib(int n) {
        if(n == 0 || n == 1)
            return n;
        if(memo.containsKey(n))
            return memo.get(n);
        int m = fib(n - 1) + fib(n - 2);
        memo.put(n,m);
        return m;
    }
}
