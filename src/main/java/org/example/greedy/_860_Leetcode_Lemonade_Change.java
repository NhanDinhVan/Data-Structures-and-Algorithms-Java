package org.example.greedy;

/**
 * _860_Leetcode_Lemonade_Change
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/20/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/20/2024    NhanDinhVan    Create
 */

public class _860_Leetcode_Lemonade_Change {
    public boolean lemonadeChange(int[] bills) {
//        int[] cash = new int[3];
//        for(int i = 0; i < bills.length; i++){
//            if(bills[i] == 5) cash[0]++;
//
//            if(bills[i] == 10){
//                if(cash[0] == 0) return false;
//                cash[0]--;
//                cash[1]++;
//            }
//
//            if(bills[i] == 20){
//                if(cash[0] >= 1 && cash[1] >= 1){
//                    cash[0]--;
//                    cash[1]--;
//                    cash[2]++;
//                    continue;
//                }else if(cash[0] >= 3){
//                    cash[0] -= 3;
//                    cash[2]++;
//                    continue;
//                }
//                return false;
//            }
//        }
//        return true;


// Optimized Solution

        int n = bills.length;
        int five = 0; int ten = 0;

        for (int i = 0; i < n; i++){
            if (bills[i] == 5) five++;

            if (bills[i] == 10){
                if (five == 0) return false;
                ten++;
                five--;
            }

            if (bills[i] == 20){
                if (five < 3 && (ten == 0 || five == 0)) return false;

                if (ten != 0 && five != 0){
                    ten--;
                    five--;
                }
                else five -= 3;
            }
        }
        return true;
    }
}
