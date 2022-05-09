package easy;

public class ArrayOfProducts {
    //  Space-O(1), Time-O(n)
    public static int[] arrayOfProducts(int[] arr) {
//        MY SOLUTION
//        int[] productArray = new int[arr.length];
//        for (int i=0; i< arr.length; i++) {
//            int sum = 1;
//            for (int j=0; j< arr.length; j++) {
//                if (i != j) {
//                    sum = sum * arr[j];
//                }
//            }
//            productArray[i] = sum;
//        }
//        return productArray;

//        ALTERNATIVE SOLUTION
        int product = 1;
        for (int j : arr) {
            product *= j;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = product / arr[i];
        }
        return arr;
    }
}
