package org.example.binary_search;

import java.util.Arrays;

/**
 * _2798_Leetcode_Number_of_Employees_Who_Met_the_Target
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/14/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/14/2025    NhanDinhVan    Create
 */

public class _2798_Leetcode_Number_of_Employees_Who_Met_the_Target {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
//        int l = 0;
//        int r = hours.length-1;
//        int mid;
//
//        Arrays.sort(hours);
//        while(l <= r){
//            mid = l + (r-l)/2;
//
//            if(hours[mid] >= target){
//                r = mid-1;
//            }else{
//                l = mid+1;
//            }
//        }
//        return hours.length - l;
        int c = 0;
        for(int i : hours){
            if (i >= target) c++;
        }
        return c;
    }
}
