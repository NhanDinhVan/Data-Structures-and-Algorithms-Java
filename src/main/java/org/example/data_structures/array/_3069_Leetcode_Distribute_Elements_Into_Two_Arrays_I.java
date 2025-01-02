package org.example.data_structures.array;

/**
 * _3069_Leetcode_Distribute_Elements_Into_Two_Arrays_I
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/2/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/2/2025    NhanDinhVan    Create
 */

public class _3069_Leetcode_Distribute_Elements_Into_Two_Arrays_I {
    public int[] resultArray(int[] nums) {
        int s = nums.length;
        int[] m = new int[s];
        m[0] = nums[0];
        int[] n = new int[s];
        n[0] = nums[1];
        int mIdx = 1;
        int nIdx = 1;

        for(int i = 2; i < s; i++){
            if(m[mIdx-1] > n[nIdx-1]){
                m[mIdx++] = nums[i];
            }else{
                n[nIdx++] = nums[i];
            }
        }

        for(int i = 0; i < nIdx; i++){
            m[mIdx++] = n[i];
        }
        return m;
    }
}
