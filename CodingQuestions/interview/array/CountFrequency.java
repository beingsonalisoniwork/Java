package interview.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        int[] arr = {10, 10, 15, 20, 20, 20};
        // Arrays.stream(arr).forEach(num -> System.out.println(num));

        Map<Integer, Integer> map = countFrequency(arr);
        printFrequency(map);
    }

    public static Map<Integer, Integer> countFrequency(int[] arr) {
        if(arr == null || arr.length == 0) throw new IllegalArgumentException("Input must not be null or empty");
        
        Map<Integer, Integer> map = new LinkedHashMap<>(); // preserves original arr order
        // Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        return map;
    }

    public static void printFrequency(Map<Integer, Integer> map) {
        // sorting by key (default: ascending)
        // map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
        // ForEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()) : LAMBDA FUNCTION
        // For each entry in the stream, Do this: System.out.println(...)

        // Equivalent code: 
        // forEach(new Consumer<Map.Entry<Integer, Integer>>() {
        //     public void accept(Map.Entry<Integer, Integer> entry) {
        //         System.out.println(entry.getKey() + " " + entry.getValue());
        //     }
        // });

        // sorting by value or frequency in this case
        // map.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
        // <Integer, Integer>comparingByValue() > for no confusion | explicit type witness | prevent compiler confusion

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // lamda expression: 
        // map.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
