package interview.hashmaps;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicates {
    public static void main(String[] args) {
        String str = "sonalisoni";
        // s:2, o:2, n:2, i:2
        str = str.toLowerCase(); // to avoid case checks
        printDuplicates(str);

        int[] arr = {4, 5, 6, 7, 5, 6, 8, 9, 4};
        printElementsMoreThanOnce(arr);
    }

    // count word frequency in a sentence
    public static void printDuplicates(String str) {
        if(str == null || str.isEmpty()) { 
            System.out.println("Empty string provided."); 
            return;
        }
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) {
                System.out.print("[" + entry.getKey() + ", " + entry.getValue() + "]");
            }
        }
        System.out.println();
    }

    public static void printElementsMoreThanOnce(int[] arr) {
        if(arr == null || arr.length == 0) { 
            System.out.println("Empty array."); 
            return;
        }
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int i : arr) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        boolean hasDuplicates = false;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) { 
                hasDuplicates = true;
                System.out.print(entry.getKey() + " "); 
            }
        }
        System.out.println();

        if(!hasDuplicates) { System.out.println("No duplicates found."); }
    }
}
