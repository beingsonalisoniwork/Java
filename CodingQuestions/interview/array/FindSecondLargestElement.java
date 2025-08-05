package interview.array;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        // int[] arr = {10, 8, 9, 4, 0, 1, 4};
        // int[] arr = {10, 20, 30};
        int[] arr = {5, 5, 5};
        // int[] arr = {4};
        findSecondLargestElement(arr);
    }

    public static void findSecondLargestElement(int[] arr) {
        if(arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have atleast 2 elements");
        }

        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for(int num : arr) {
            if(num > largest) {
                secondLargest = largest;
                largest = num;
            } else if(num < largest && num > secondLargest) {
                secondLargest = num;
            } 
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest number exists");
        } else {
            System.out.println(secondLargest);
        }
    }
}
