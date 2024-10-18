package org.example.data_structures.array;

import java.util.HashSet;

/**
 * _929_Leetcode_Unique_Email_Addresses
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/18/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/18/2024    NhanDinhVan    Create
 */

public class _929_Leetcode_Unique_Email_Addresses {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> hset = new HashSet<>(); // Tạo HashSet để lưu trữ email duy nhất

        for (String email : emails) {
            // Tách địa chỉ email thành phần địa chỉ và phần miền
            String[] parts = email.split("@");
            String localPart = parts[0]; // Phần trước '@'
            String domainPart = parts[1]; // Phần sau '@'

            // Loại bỏ mọi ký tự sau '+' trong localPart
            int plusIndex = localPart.indexOf('+');
            if (plusIndex != -1) {
                localPart = localPart.substring(0, plusIndex);
            }

            // Loại bỏ dấu chấm trong localPart
            localPart = localPart.replace(".", "");

            // Tạo email mới
            String newEmail = localPart + "@" + domainPart; // Kết hợp lại

            hset.add(newEmail); // Thêm email đã xử lý vào HashSet
        }

        return hset.size(); // Trả về số lượng email duy nhất
    }
}
