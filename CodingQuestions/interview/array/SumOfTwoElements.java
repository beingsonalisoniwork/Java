package interview.array;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoElements {
    public static void main(String[] args) {
        int[] arr = {2, 5, 10, 1, 3, 9};
        int target = 8;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            int counter = target - arr[i];
            if (map.containsKey(counter)) {
                System.out.println(arr[i] + " + " + counter + " = " + target);
                System.out.println("indexes are : " + i + ", " + map.get(counter));
                break;
            }
            map.put(arr[i], i);
        }

    }
}
