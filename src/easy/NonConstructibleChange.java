package easy;

import java.util.Arrays;

public class NonConstructibleChange {
    //  Space-O(1), Time-O(nlogn)
    public static int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int targetNumber = 0;
        for (int coin : coins) {
            if (coin > targetNumber + 1) {
                return targetNumber + 1;
            }
            targetNumber += coin;
        }
        return targetNumber;
    }
}
