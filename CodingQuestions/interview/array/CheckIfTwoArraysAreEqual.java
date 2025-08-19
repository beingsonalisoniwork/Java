package interview.array;

import java.util.Arrays;

public class CheckIfTwoArraysAreEqual {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        boolean result = checkIfEqual(arr1, arr2);
        System.out.println(result);
    }

    public static boolean checkIfEqual(int[] arr1, int[] arr2) {
        // throw exception if any array is null
        if(arr1 == null || arr2 == null) throw new IllegalArgumentException("Input arrays must not be null");

        // return false if unequal length
        if(arr1.length != arr2.length) return false;

        // create copy of arr to keep original arr preserved
        int[] copyArr1 = Arrays.copyOf(arr1, arr1.length);
        int[] copyArr2 = Arrays.copyOf(arr2, arr2.length);
        // sort the copy arr
        Arrays.sort(copyArr1);
        Arrays.sort(copyArr2);
        
        for(int i = 0; i < copyArr1.length; i++) {
            // if the elements at any point are not equal, return false
            if(copyArr1[i] != copyArr2[i]) {
                return false;
            }
        }

        return true;
    }
}
