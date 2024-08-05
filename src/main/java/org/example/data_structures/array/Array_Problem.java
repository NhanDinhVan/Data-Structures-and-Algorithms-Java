package org.example.data_structures.array;

public class Array_Problem {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        int i = m-1, j = n-1;
        while (i>=0 || j>=0) {
            if (i >= 0 && j >= 0) {
                if(nums1[i] >= nums2[j]){
                    nums1[k] = nums1[i];
                    k--;  i--;
                }else{
                    nums1[k] = nums2[j];
                    j--; k--;
                }
            }else if( i >= 0 )
            {
                nums1[k] = nums1[i];
                k--;  i--;
            }else if(j >= 0)
            {
                nums1[k] = nums2[j];
                j--; k--;
            }
        }
    }
    public int removeDuplicates(int[] nums) {
        int curIndex = 0;
        int n = nums.length;
        for(int i =0; i < n; i++ )
        {
            if(nums[i] != nums[curIndex])
            {
                curIndex++;
                nums[curIndex] = nums[i];
            }
        }
        if(nums.length==0)
            return 0;
        return curIndex+1;
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        for(int i =0; i < k; i++){
            int temp = nums[n-1];
            for(int j = n-1; j > 0; j--)
            {
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
    }



//
//    public static int solution(int[] nums)
//    {
//        Integer result = null;
//        for (int num : nums) {
//            if (num < 0 && (result == null || num > result))
//                result = num;
//        }
////        if(result > 0)
////            return 0;
//        return result;
//    }
//
//public static void solution2(int[] nums)
//{
//    int count = 1, cur = 0, i;
//    for (i = 1; i < nums.length; i++)
//    {
//        if(nums[i] != nums[cur])
//        {
//            System.out.println(nums[cur] + " " + cur + " " + count);
//            cur = i;
//            count = 1;
//        }else
//            count++;
//    }
//    if(i == nums.length)
//        System.out.println(nums[cur] + " " + cur + " " + count);
//}
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,5,6,6};
//        solution2(nums);
    }
}
