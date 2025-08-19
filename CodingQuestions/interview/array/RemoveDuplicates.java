package interview.array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 2, 3, 1};
        // int[] arr = {};
        // int[] arr = {4, 4, 4, 4};
        // int[] arr = {1, 2, 3, 4};
        // int[] arr = {1, 2, 1, 2};
        // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40, 50, 60, 70, 80, 90, 90, 100};
        // int[] arr = {-1, -2, -1, -3};
        // int[] arr = {0, 1, 1, 2, 0, 3};
        // int[] arr = {Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE};
        // int[] arr = null;

        // java is pass by value
        // arr is getting pass by value (of REFERENCE) > hence contents can be changes but not the reference
        int newLen = removeDuplicates(arr);
        System.out.println(newLen);

        for(int i = 0; i < newLen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int removeDuplicates(int[] arr) {
        if(arr == null) {
            throw new IllegalArgumentException("Enter valid array");
            // return 0;
        }

        Set<Integer> seen = new HashSet<>();
        int index = 0;

        for(int i = 0; i < arr.length; i++) {
            // add element in the set only if not seen
            if(!seen.contains(arr[i])) {
                seen.add(arr[i]);
                // update array with elements : modifying the original array
                // arr[index++] = arr[i];
                arr[index] = arr[i];
                index++;
            } 
        }
        
        // arr becomes : 4, 2, 5, 3, 1, 3, 1
        // index or newLen : 5
        // from arr we need only 5 elements : 4, 2, 5, 3, 1
        return index;
    }

    // hashset approach: O(n) - space and time complexity
    // using Arrays.sort(arr) and 2 pointers: O(n log n) time complexity which is slower, O(1) space - does not maintain order
    // bit manipulation only for known ranges 0-31
}