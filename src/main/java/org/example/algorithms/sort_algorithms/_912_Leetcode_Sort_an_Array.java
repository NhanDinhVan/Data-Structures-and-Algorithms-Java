package org.example.algorithms.sort_algorithms;

/**
 * _912_Leetcode_Sort_an_Array
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/20/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/20/24   NhanDinhVan    Create
 */
public class _912_Leetcode_Sort_an_Array {
    public int[] mergeSort(int[] a, int l, int r){
        if(l == r)
            return new int[] {a[l]};
        //
        int k = (l+r)/2;
        int[] a1 = mergeSort(a, l, k);
        int[] a2 = mergeSort(a, k+1, r);
        //
        int n = a1.length + a2.length;
        int[] result = new int[n];

        int i = 0, i1 = 0, i2 = 0;
        while(i < n){
            if(i1 < a1.length && i2 < a2.length){
                if(a1[i1] <= a2[i2]) {
                    result[i] = a1[i1];
                    i++; i1++;
                }else {
                    result[i] = a2[i2];
                    i++; i2++;
                }
            }else{
                if(i1 < a1.length){
                    result[i] = a1[i1];
                    i++; i1++;
                }
                if(i2 < a2.length){
                    result[i] = a2[i2];
                    i++; i2++;
                }
            }
        }
        return result;
    }
    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
}
