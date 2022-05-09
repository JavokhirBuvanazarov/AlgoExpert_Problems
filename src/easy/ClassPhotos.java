package easy;

import java.util.Arrays;

public class ClassPhotos {
    //  Space-O(1), Time-O(nlogn)
    public static boolean classPhotos(int[] reds, int[] blues) {
        Arrays.sort(reds);
        Arrays.sort(blues);
        boolean isRedsInFront = reds[0] > blues[0];
        for (int i=0; i < reds.length; i++) {
            if (isRedsInFront != reds[i] > blues[i]) {
                return false;
            }
        }
        return true;
    }
}
