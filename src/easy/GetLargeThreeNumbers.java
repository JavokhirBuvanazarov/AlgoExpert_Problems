package easy;

public class GetLargeThreeNumbers {
    //  O(1) space, O(n) time
    public static int[] getLargeThreeNumbers(int[] arr) {
        int i, first, second, third;
        third = first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr.length ; i ++)
        {
            if (arr[i] > first)
            {
                third = second;
                second = first;
                first = arr[i];
            }

            else if (arr[i] > second)
            {
                third = second;
                second = arr[i];
            }

            else if (arr[i] > third)
                third = arr[i];
        }
        return new int[] {third, second, first};
    }
}
