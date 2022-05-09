package easy;

public class ValidateSubsequence {
    //  Space-O(1), Time-O(n)
    public static boolean validateSubsequence(int[] array, int[] sequence) {
        int iteratorIndex = 0;
        int iteratorLen = sequence.length;
        for (int j : array) {
            int iteratorValue = sequence[iteratorIndex];
            if (j == iteratorValue) {
                iteratorIndex++;
            }
        }
        return iteratorIndex == iteratorLen;
    }
}
