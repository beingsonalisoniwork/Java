package practice;

// Given two non-empty strings s1 and s2 of lowercase letters, determine if they are anagrams 
// Anagrams - if they contain the same characters with the same frequencies

import java.util.Arrays;

public class Anagram1 {
    public static void main(String[] args) {
        String s1 = "sonali";
        String s2 = "ilanos";
        System.out.println(areAnagrams(s1, s2));
    }

    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        
        char[] chArr1 = s1.toCharArray();
        char[] chArr2 = s2.toCharArray();

        Arrays.sort(chArr1);
        Arrays.sort(chArr2);

        return Arrays.equals(chArr1, chArr2);
    }
}
