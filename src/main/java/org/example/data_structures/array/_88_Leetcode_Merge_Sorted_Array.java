package org.example.data_structures.array;

public class _88_Leetcode_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        int i = m -1, j = n-1;
        while (i >=0 || j >= 0) {
            if(i >= 0 && j >= 0) {
                if(nums1[i] > nums2[j]) {
                    nums1[k] = nums1[i];
                    i--; k--;
                }else
                {
                    nums1[k] = nums2[j];
                    j--; k--;
                }
            }else if(j<0)
            {
                nums1[k] = nums1[i];
                i--; k--;
            }else
            {
                nums1[k] = nums2[j];
                j--; k--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 4, nums2, 3);
        System.out.println(nums1.toString());
    }
}
