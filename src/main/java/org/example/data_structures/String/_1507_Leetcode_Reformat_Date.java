package org.example.data_structures.String;

/**
 * _1507_Leetcode_Reformat_Date
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/7/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/7/2024    NhanDinhVan    Create
 */

public class _1507_Leetcode_Reformat_Date {
    public String reformatDate(String date) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        StringBuilder ans = new StringBuilder();
        String[] dateArr = date.split(" ");
        ans.append(dateArr[2]+"-");

        for(int i = 0; i < months.length; i++){
            if(months[i].equals(dateArr[1])){
                if(i < 9){
                    ans.append("0");
                }
                ans.append(i+1).append("-");
                break;
            }
        }
        StringBuilder day = new StringBuilder();
        for (char c : dateArr[0].toCharArray()) {
            if (Character.isDigit(c)) { // Chỉ lấy ký tự là số
                day.append(c);
            }
        }

        if (day.length() == 1) {
            ans.append("0");
        }
        ans.append(day);

        return ans.toString();
    }
}
