package interview.array;

public class FindSmallestElement {
    public static void main(String[] args) {
        int[] arr = {10, 8, 9, 4, 0, 1, 4};
        // int[] arr = {4, 4, 4, 4};
        // int[] arr = {-3, -5, -1, -10};
        // int[] arr = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        // int[] arr = {42};

        // int smallestElement = getSmallestElement(arr);
        // int index = getIndex(arr, smallestElement);
        // if(index != -1) {
        //     System.out.println("smallest element = " + smallestElement + ", index = " + index);
        // } else {
        //     System.out.println("Value not found");
        // }
        
        // improve runtime:
        int[] result = getSmallestElementAndIndex(arr);
        System.out.println("smallest element = " + result[0] + ", index = " + result[1]);
    }

    // public static int getSmallestElement(int[] arr) {
    //     if(arr == null || arr.length == 0) {
    //         throw new IllegalArgumentException("Input array must not be null or empty");
    //     }
    //     int temp = arr[0];
    //     for(int i = 1; i < arr.length; i++) {
    //         if(temp > arr[i]) {
    //             temp = arr[i];
    //         }
    //     }
    //     return temp;
    // }

    // public static int getIndex(int[] arr, int value) {
    //     for(int i = 0; i < arr.length; i++) {
    //         if(arr[i] == value) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // to improve runtime: 
    public static int[] getSmallestElementAndIndex(int[] arr) {
        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input array must not be null or empty");
        }

        int minValue = arr[0], index = 0;
        for(int i = 1; i < arr.length; i++) {
            if(minValue > arr[i]) {
                minValue = arr[i];
                index = i;
            }
        }

        return new int[] {minValue, index};
    }
}
