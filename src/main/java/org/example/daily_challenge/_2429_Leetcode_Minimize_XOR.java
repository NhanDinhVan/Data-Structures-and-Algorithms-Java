package org.example.daily_challenge;

/**
 * _2429_Leetcode_Minimize_XOR
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/15/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/15/2025    NhanDinhVan    Create
 */

public class _2429_Leetcode_Minimize_XOR {
    public int minimizeXor(int num1, int num2) {
        int setBitsNum2 = Integer.bitCount(num2); // Đếm số bit 1 của num2
        int result = 0;

        // Duyệt từ bit cao nhất đến thấp nhất của num1
        for (int i = 31; i >= 0 && setBitsNum2 > 0; i--) {
            if ((num1 & (1 << i)) != 0) { // Kiểm tra bit thứ i của num1
                result |= (1 << i); // Bật bit thứ i trong kết quả
                setBitsNum2--; // Giảm số lượng bit cần bật
            }
        }

        // Nếu vẫn chưa đủ số bit 1, bật thêm từ phải sang trái
        for (int i = 0; i <= 31 && setBitsNum2 > 0; i++) {
            if ((result & (1 << i)) == 0) { // Nếu bit thứ i chưa bật
                result |= (1 << i); // Bật bit thứ i
                setBitsNum2--; // Giảm số lượng bit cần bật
            }
        }

        return result;
    }
}
