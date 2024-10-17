package org.example.data_structures.array;

/**
 * _1089_Leetcode_Duplicate_Zeros
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/17/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/17/2024    NhanDinhVan    Create
 */

public class _1089_Leetcode_Duplicate_Zeros {
    public void duplicateZeros(int[] arr) {
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] == 0){
//                for(int j = arr.length - 1; j > i; j--){
//                    arr[j] = arr[j - 1];
//                }
//                i++;
//            }
//        }
        int possibleDups = 0;
        int length = arr.length - 1;
        for (int i = 0; i <= length - possibleDups; i++) {
            if (arr[i] == 0) {
                // Nếu số 0 ở vị trí cuối cùng, không cần nhân đôi
                if (i == length - possibleDups) {
                    arr[length] = 0;
                    length -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        // Bắt đầu từ cuối mảng, di chuyển các phần tử
        int last = length - possibleDups;
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }
}
