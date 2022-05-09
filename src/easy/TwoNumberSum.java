package easy;

import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {
    //  Space-O(n), Time-O(n)
    public static int[] twoNumberSum(int[] arr, int targetNumber) {
        Set<Integer> nums = new HashSet<>();
        for (int j : arr) {
            int potentialMath = targetNumber - j;
            if (nums.contains(potentialMath)) {
                return new int[]{potentialMath, j};
            } else {
                nums.add(j);
            }
        }
//        for (int i = 0; i< arr.length - 1; i++) {
//            for (int j = i + 1; j< arr.length; j++) {
//                if (i != j && arr[i] + arr[j] == targetNumber) {
//                    return new int[] {arr[i], arr[j]};
//                }
//            }
//        }
        return new int[0];
    }
}
