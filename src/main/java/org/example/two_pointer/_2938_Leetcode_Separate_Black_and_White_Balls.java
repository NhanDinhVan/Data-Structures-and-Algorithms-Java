package org.example.two_pointer;

import java.util.Arrays;

/**
 * _2938_Leetcode_Separate_Black_and_White_Balls
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/15/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/15/2024    NhanDinhVan    Create
 */

public class _2938_Leetcode_Separate_Black_and_White_Balls {
//    public String swap(int l, int r, String s){
//        char[] sArr = s.toCharArray();
//        char tmp = sArr[l];
//        sArr[l] = sArr[r];
//        sArr[r] = tmp;
//        return new String(sArr);
//    }
//    public long minimumSteps(String s) {
//        int R = s.length() - 1;
//        int L = R;
//        int miniStep = 0;
//        while(L > 0){
//            while (R >= 0 && s.charAt(R) != '0')
//                R--;
//            if(R < 0) break;
//            L = R;
//            while (L >= 0 && s.charAt(L) != '1')
//                L--;
//            if(L < 0) break;
//            miniStep += (R - L);
//            s = swap(L, R, s);
//        }
//        return miniStep;
//    }

    public long minimumSteps(String s) {
        int countOnes = 0; // Đếm số lượng '1' đã gặp
        long miniStep = 0; // Tổng số bước di chuyển

        // Duyệt qua từng ký tự của chuỗi
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                // Mỗi lần gặp '1', tăng biến đếm số '1'
                countOnes++;
            } else if (s.charAt(i) == '0') {
                // Khi gặp '0', tính số bước di chuyển cần thiết
                miniStep += countOnes; // Cần di chuyển các '1' đã gặp trước đó qua '0'
            }
        }

        return miniStep; // Trả về tổng số bước di chuyển
    }
}
