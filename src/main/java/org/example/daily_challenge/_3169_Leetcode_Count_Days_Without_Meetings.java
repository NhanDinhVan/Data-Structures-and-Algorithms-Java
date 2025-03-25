package org.example.daily_challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * _3169_Leetcode_Count_Days_Without_Meetings
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/25/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/25/2025    NhanDinhVan    Create
 */

public class _3169_Leetcode_Count_Days_Without_Meetings {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));

        List<int[]> mergedMeetings = new ArrayList<>();
        for (int[] meeting : meetings) {
            if (mergedMeetings.isEmpty() || meeting[0] > mergedMeetings.get(mergedMeetings.size() - 1)[1]) {
                mergedMeetings.add(meeting);
            } else {
                mergedMeetings.get(mergedMeetings.size() - 1)[1] =
                        Math.max(mergedMeetings.get(mergedMeetings.size() - 1)[1], meeting[1]);
            }
        }

        int meetingDaysCount = 0;
        for (int[] m : mergedMeetings) {
            meetingDaysCount += (m[1] - m[0] + 1);
        }

        return days - meetingDaysCount;
    }
}
