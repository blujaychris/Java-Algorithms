package searchingAlgorithms;

import helpers.Printing;

import java.util.Arrays;

public class BinarySearch {

    public static Boolean binarySearch(int[] arr, int n) {

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);
        }

        // Think about maintaining the boundaries of your array with a lo
        // index and a hi index. lo=0; hi=length - 1;
        int lo = 0;
        int hi = arr.length - 1;
        // Use a while loop to iterate until lo <= hi. The moment that lo exceeds
        // hi, we can be sure that the entire array has been searched.
        while (lo <= hi) {
            // Create a mid index. int mid = lo + (hi-lo)/2;
            int mid = lo + (hi - lo) / 2;
            // If arr[mid] < n, set lo = mid+1 to divide the array
            if (arr[mid] < n) lo = mid + 1;
                // Else If arr[mid] > n, set hi = mid - 1 to divide the array
            else if (arr[mid] > n) hi = mid - 1;
                // Otherwise, return true!
            else Printing.print(true);
        }
        return false;
    }


}
