package practice;
// import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Ques: Write a java method that takes an array of integers and returns the first non-repeating element in the array.
// If all elements repeat, return -1.
// Example: input = [4, 5, 1, 2, 0, 4, 5, 2];
// output = 1

class FirstNonRepeatingElement {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Enter the size of array: ");
        // int size = scn.nextInt();
        // int[] arr = new int[size];
        // System.out.println("Enter the elements of array.");
        // for(int i = 0; i < size; i++) {
        //     System.out.println("Enter element " + (i+1) + ": ");
        //     arr[i] = scn.nextInt();
        // }

        int[] arr = {4, 5, 1, 2, 0, 4, 5, 2};
        findFirstNonRepeatitiveElement(arr);
        // int[] arr = {5, 1, 4, 2, 0, 4, 5, 2};

        // int num = findFirstNonRepeatitiveElement(arr);
        // System.out.println(num);

        // scn.close();
    }


    // brute force code
    // time complexity : O(n*n) = O(n2)
    // space complexity : O(1)
    // public static int findFirstNonRepeatitiveElement(int[] arr) {
    //     for(int i = 0; i < arr.length; i++) {
    //         boolean isRepeated = false;
    //         // updating isRepeated false, for every new element
    //         for(int j = 0; j < arr.length; j++) {
    //             // starting the loop from j = 0, as we want to check the repeatetion of elements at the end of the array 
    //             // with the elements at the start of the array. Also, since we dont want to count the same element in comparison 
    //             // hence we use the condition i != j.
    //             if(i != j  && arr[i] == arr[j]) {
    //                 isRepeated = true;
    //                 break;
    //                 // breaking the inner loop, once repeatetion is found
    //             }
    //         }
    //         // checking if the inner loop ran completely till the end of the array then isRepeated would remain false
    //         // hence, we found our unique element
    //         if(!isRepeated) {
    //             return arr[i];
    //         }
    //     }
    //     // no non-repeating elements found
    //     return -1;
    // }

    // optimised code
    public static void findFirstNonRepeatitiveElement(int[] arr) {
        // element, frequency
        Map<Integer, Integer> frequenceyMap = new HashMap<>();
        for(int element : arr) {
            // getOrDefault : if key does not exists, return default value instead of null (by pass nullPointerException)
            frequenceyMap.put(element, (frequenceyMap.getOrDefault(element, 0))+1);
        }

        // Map.Entry represents 1 key-value pair or 1 row in map
        // entrySet() - set of ALL key-value pairs or rows
        Set<Map.Entry<Integer, Integer>> entries = frequenceyMap.entrySet();
        // Set of: -> entry {4, 2} -> entry {5, 2} and so on

        for(Map.Entry<Integer, Integer> entry : entries) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }

        // return -1;
    }
}