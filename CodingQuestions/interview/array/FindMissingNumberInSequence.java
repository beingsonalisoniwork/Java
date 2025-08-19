package interview.array;

public class FindMissingNumberInSequence {
    public static void main(String[] args) {
        // 1-n array given find the missing number
        // int[] arr = {8, 2, 4, 5, 3, 7, 1};
        // int[] arr = {1};
        int[] arr = {}; // missing number is 1
        int missingNum = findMissingNumber(arr);
        System.out.println(missingNum);
    }

    public static int findMissingNumber(int[] arr) {
        if(arr == null) throw new IllegalArgumentException("Enter valid array");
        
        int n = arr.length + 1; // new or expected length
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for(int num : arr) { 
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}

// time: O(n)
// space O(1)