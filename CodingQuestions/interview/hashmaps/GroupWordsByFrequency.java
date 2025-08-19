package interview.hashmaps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupWordsByFrequency {
    public static void main(String[] args) {
        String[] arr = {"Dog", "dog", "cat", "Cat", "dog"};
        
        Map<String, Integer> freqMap = new LinkedHashMap<>();
        for(String word : arr) {
            freqMap.put(word, freqMap.getOrDefault(word, 0)+1);
        }

        Set<Integer> freqSet = new LinkedHashSet<>(); // unique frequencies
        for(Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            freqSet.add(entry.getValue());
        }

        for(int i : freqSet) { // iterate over frequencies, print list using map
            List<String> list = new ArrayList<>();

            for(Map.Entry<String, Integer> entry : freqMap.entrySet()) {
                if(entry.getValue() == i) {
                    list.add(entry.getKey());
                }
            }

            System.out.println(i + " > " + list);
        }
    }
}
