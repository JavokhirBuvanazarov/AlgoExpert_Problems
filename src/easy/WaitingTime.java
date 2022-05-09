package easy;

import java.util.Arrays;

public class WaitingTime {
    //  Space-O(1), Time-O(nlogn)
    public static int waitingTime(int[] arr) {
        int totalTime = 0;
        Arrays.sort(arr);
        for (int i=0; i < arr.length; i++) {
            totalTime += arr[i] * (arr.length - (i + 1));
        }
        return totalTime;
    }
}
