package easy;

public class SortedSquaredArray {
    //  Space-O(n), Time-O(n)
    public static int[] sortedSquaredArray (int[] array) {
        int smallIndex = 0;
        int largeIndex = array.length - 1;
        int [] output = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            int smallVal = array[smallIndex];
            int largeVal = array[largeIndex];
            if (Math.abs(smallVal) > Math.abs(largeVal)) {
                output[i] = smallVal * smallVal;
                smallIndex++;
            } else {
                output[i] = largeVal*largeVal;
                largeIndex--;
            }
        }
        return output;
    }
}
