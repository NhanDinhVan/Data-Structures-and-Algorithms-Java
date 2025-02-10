package org.example.data_structures.String;

/**
 * _551_Leetcode_Student_Attendance_Record_I
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/10/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/10/2025    NhanDinhVan    Create
 */

public class _551_Leetcode_Student_Attendance_Record_I {
    public boolean checkRecord(String s) {
        int absent = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'A') absent++;
            if(absent >= 2) return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                int count = 1;
                while (i + 1 < s.length() && s.charAt(i + 1) == 'L') {
                    count++;
                    i++;
                }
                if (count >= 3) return false;
            }
        }

        return true;
    }
}
