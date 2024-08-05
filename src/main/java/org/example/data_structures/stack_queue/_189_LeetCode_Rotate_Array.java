package org.example.data_structures.stack_queue;

import java.util.Arrays;

public class _189_LeetCode_Rotate_Array {
    public static void rotate(int[] nums, int k) {
//        int n = nums[nums.length-1];
//        for(int i = nums.length - 2 ; i > 0 ; i--) {
//            nums[i+1] = nums[i];
//            System.out.print(nums[i]);
//        }
//        nums[0] = n;
//        System.out.println();
//        if(k>0)
//            rotate(nums, k-1);
        int n = nums.length;

        // Điều chỉnh k nếu k lớn hơn độ dài của mảng
        k = k % n;
        int[] temp = new int[k]; // Mảng tạm để lưu các phần tử cuối cùng

        // Copy k phần tử cuối cùng vào mảng tạm
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        // Dịch chuyển các phần tử còn lại trong mảng
        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        // Đặt lại các phần tử từ mảng tạm vào vị trí đầu tiên
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
        System.out.println(
                Arrays.toString(nums)
        );
        System.out.println(
                Arrays.toString(temp)
        );
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 8);
    }
}
