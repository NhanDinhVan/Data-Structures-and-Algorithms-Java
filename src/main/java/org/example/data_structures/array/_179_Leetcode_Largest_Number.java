package org.example.data_structures.array;

import java.util.Arrays;

/**
 * _179_Leetcode_Largest_Number
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/6/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/6/24   NhanDinhVan    Create
 */
public class _179_Leetcode_Largest_Number {
    public String largestNumber(int[] nums) {
        /*
        *
        * Input: nums = [3,30,34,5,9]
        * Output: "9534330"
        *
        * */
        StringBuilder s = new StringBuilder();

        for(int i = 0; i < nums.length; i++){
            int max = i;
            for(int j = i + 1; j < nums.length; j++){
                if(compare(nums[max],nums[j]))
                    max = j;
            }
            if(i != max){
                int temp = nums[i];
                nums[i] = nums[max];
                nums[max] = temp;
            }
        }

        for (int num : nums) {
            s.append(num);
        }
        // Kiểm tra nếu kết quả bắt đầu bằng '0', trả về "0"
        if (s.toString().startsWith("0")) {
            return "0";
        }
        System.out.println(Arrays.toString(nums));
        return Long.parseLong(s.toString())+"";
    }
    public static boolean compare(int a, int b){
        String ab = Integer.toString(a) + Integer.toString(b);
        String ba = Integer.toString(b) + Integer.toString(a);
        return ab.compareTo(ba) < 0;
    }

//    OPTIMIZE SOLUTION
//    public String largestNumber(int[] nums) {
//        String[] n=new String[nums.length];
//        for(int i=0;i<nums.length;i++){
//            n[i]=Integer.toString(nums[i]);
//        }
//        Arrays.sort(n,(a,b)->(b+a).compareTo(a+b));
//        if(n[0].equals("0")){
//            return "0";
//        }
//        StringBuilder sb=new StringBuilder();
//        for(String num:n){
//            sb.append(num);
//        }
//        return sb.toString();
//    }
}
