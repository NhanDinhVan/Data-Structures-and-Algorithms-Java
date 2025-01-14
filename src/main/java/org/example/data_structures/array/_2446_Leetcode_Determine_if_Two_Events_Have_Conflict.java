package org.example.data_structures.array;

/**
 * _2446_Leetcode_Determine_if_Two_Events_Have_Conflict
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/14/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/14/2025    NhanDinhVan    Create
 */

public class _2446_Leetcode_Determine_if_Two_Events_Have_Conflict {
    public boolean haveConflict(String[] event1, String[] event2) {
        return !(event1[1].compareTo(event2[0]) < 0 || event1[0].compareTo(event2[1]) > 0);
    }
}
