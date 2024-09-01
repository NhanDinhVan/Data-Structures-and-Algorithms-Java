package org.example.data_structures.String;

/**
 * _443_Leetcode_String_Compression
 * <p>
 * Version 1.0
 * <p>
 * Date:  8/19/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 8/19/24   NhanDinhVan    Create
 */
public class _443_Leetcode_String_Compression {
    public int compress(char[] chars) {
        /*
         * [ "a" , "a" , "b" , "b" , "c" , "c" , "c" ]
         *    l
         *    m
         *    r
         *
         * */
        int l = 0;
        int r = 0;
        int m = 0;
        int count = 0;

        while (r < chars.length) {
            l = r;
            count = 0;
            while (r < chars.length && chars[r] == chars[l]) {
                r++;
                count++;
            }
            chars[m++] = chars[l];
            while (count != 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[m++] = c;
                }
            }
        }
        return m;

    }
}
