package interview.array;

public class FindLargestElement {
    public static void main(String[] args) {
        // int[] arr = {10, 8, 11, 4, 0, 1, 12};
        int[] arr = null;

        int[] result = getLargestElementAndIndex(arr);
        System.out.println("largest element = " + result[0] + ", index = " + result[1]);
    }

    public static int[] getLargestElementAndIndex(int[] arr) {
        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input array must not be empty or null");
        }

        int maxValue = arr[0], index = 0;
        for(int i = 1; i < arr.length; i++) {
            if(maxValue < arr[i]) {
                maxValue = arr[i];
                index = i;
            }
        }
        return new int[] {maxValue, index};
    }
}
