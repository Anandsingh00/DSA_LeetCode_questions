package BinarySearch;

public class binarySearch {

    public static int binarySearchFunc(int arr[], int target) {
        int lo = 0, hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] < target) {
                lo = mid + 1;
            } else if (arr[mid] > target) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int n = 1000000000;
        int arr[] = new int[n];

        // Creating sorted array of size 100
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        int search =  999999 ;

        System.out.println("Searching element: " + search);

        // Binary Search Time
        long startBinary = System.nanoTime();
        int binaryIndex = binarySearchFunc(arr, search);
        long endBinary = System.nanoTime();

        long binaryTime = endBinary - startBinary;

        // Linear Search Time
        long startLinear = System.nanoTime();
        int linearIndex = linearSearch(arr, search);
        long endLinear = System.nanoTime();

        long linearTime = endLinear - startLinear;

        System.out.println("\nBinary Search Result: " + binaryIndex);
        System.out.println("Binary Search Execution Time: " + binaryTime + " ns");

        System.out.println("\nLinear Search Result: " + linearIndex);
        System.out.println("Linear Search Execution Time: " + linearTime + " ns");




        // Max execution time
        if (binaryTime > linearTime) {
            long result =binaryTime/ linearTime;
            System.out.println("\nBinary Search took more time " + result + "x times more");
        } else {
            long result = linearTime/binaryTime;
            System.out.println("\nLinear Search took more time " + result + "x times more");
        }
    }
}