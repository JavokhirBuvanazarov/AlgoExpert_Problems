package easy;

import java.util.Arrays;

public class TandemBicycle {
    //  Space-O(1), Time-O(nlogn)
    public static int tandemBicycle(int[] redShirts, int[] blueShirts, boolean fastest) {
        Arrays.sort(redShirts);
        Arrays.sort(blueShirts);
        int totalSpeed = 0;

        for (int i = 0; i < redShirts.length; i++) {
            int tempBlueSpeed = fastest ? blueShirts[redShirts.length - (i + 1 )] : blueShirts[i];
            totalSpeed += Math.max(redShirts[i], tempBlueSpeed);
        }

        return totalSpeed;
    }
}
