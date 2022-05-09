package easy;

public class GetNthFibonacciNumber {
    //  O(1) space, O(n) time
    public static int getNthFibonacciNumber(int n ) {
//        if (n == 1) return 0;
//        else if (n == 2) return 1;
//        else {
//            return getNthFibonacciNumber(n - 1) + getNthFibonacciNumber(n - 2);
//        }
        int[] lastTwo = {0, 1};
        int counter = 3;
        while (counter <= n) {
            int nextFibNumber = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = nextFibNumber;
            counter++;
        }
        return n > 1 ? lastTwo[1] : lastTwo[0];
    }
}
