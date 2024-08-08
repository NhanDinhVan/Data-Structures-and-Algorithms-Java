package org.example.data_structures.HashMap_HashSet;

import java.util.HashSet;

/**
 * _202_Leetcode_Happy_Number
 * <p>
 * Version 1.0
 * <p>
 * Date:  8/8/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 8/8/24    NhanDinhVan    Create
 */
public class _202_Leetcode_Happy_Number {
    public boolean isHappy(int n) {
//        HashSet set = new HashSet();
//        int temp;
//
//        while (n != 1 && !set.contains(n)) {
//            temp = 0;
//            set.add(n);
//            while (n!=0) {
//                temp += (int) Math.pow(n%10, 2);
//                n /= 10;
//            }
//            n = temp;
//            if(set.contains(n))
//                return false;
//        }
//        return true;

//          
        HashSet hs = new HashSet();

        while (n != 1 && !hs.contains(n)){
            hs.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    public static int getNext(int n){
        int temp = 0;
        while (n != 0){
            temp += n%10 * n%10;
            n = n/10;
        }
        return n;
    }
}
