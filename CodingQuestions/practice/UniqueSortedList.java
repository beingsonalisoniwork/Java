package practice;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Set;

public class UniqueSortedList {
    public static void main(String[] args) {
        // input
        List<String> input = Arrays.asList("banana", "apple", "mango", "apple", "Banana");
        // calling method
        List<String> result = getUniqueSortedList(input);
        // printing result
        System.out.println(result);
        List<String> result1 = getUniqueSortedListCI(input);
        System.out.println(result1);
    }

    // Case Sensitive
    public static List<String> getUniqueSortedList(List<String> list) {
        // using TreeSet to sort the list as well in alphabetical order
        Set<String> uniqueSortedSet = new TreeSet<>(list);
        // return set as arrayList
        return new ArrayList<>(uniqueSortedSet);
    }

    // Case Insesitive
     public static List<String> getUniqueSortedListCI(List<String> list) {
        // actual unique values
        Set<String> uniqueSortedSet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        uniqueSortedSet.addAll(list);
        // return set as arrayList
        return new ArrayList<>(uniqueSortedSet);
    }
}
