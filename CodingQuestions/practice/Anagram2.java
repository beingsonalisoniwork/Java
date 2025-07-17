package practice;

// Given an array of strings, find all anagram pairs in the given array.

import java.util.Arrays;

public class Anagram2 {

    final static int NO_OF_CHARS = 256;

    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        int[] count = new int[NO_OF_CHARS];
        Arrays.fill(count, 0);

        for(int i=0; i<s1.length() && i<s2.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }       

        // check for non-zero value in array
        for(int i=0; i<NO_OF_CHARS; i++) {
            if(count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void findAllAnagrams(String[] arr, int len) {
        for(int i=0; i<len-1; i++) {
            for(int j=i+1; j<len; j++) {
                if(areAnagrams(arr[i], arr[j])) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"javaquiz", "stringsliterals", "abcd", "literalsstrings", "ziuqavaj"};
        int len = arr.length;
        findAllAnagrams(arr, len);
    }
}