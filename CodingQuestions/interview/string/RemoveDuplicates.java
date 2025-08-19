package interview.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = " "; 
        // "aaaaaa", "aabbbcccc", " ", "1122!!@@##",  
        

        // Ques : Keep only one digit, one symbol, one letter
        // For category based de-duplication use Character.isDigit(), Character.isLetter()
        // Type	Examples
        // Punctuation	!, ., ,, ?, :
        // Symbols	@, #, $, %, &, *, ^, etc.
        // Whitespace	' ', \t, \n (not always included)
        // Other non-printables	ASCII control characters, etc.

        // using collection LinkedHashSet:
        Set<Character> charSet = new LinkedHashSet<>(); // preserves order and uniqueness
        for(char ch : str.toCharArray()) {
            charSet.add(ch);
        }
        StringBuilder newStr = new StringBuilder();
        for(char e : charSet) {
            newStr.append(e);
        }
        System.out.println(newStr);


        // using boolean:
        boolean[] seen = new boolean[256]; // array of size 256 values, default value : false
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!seen[ch]) {
                seen[ch] = true;
                result.append(ch);
            }
        }
        System.out.println(result);


        // using manual lookup:
        StringBuilder res = new StringBuilder();
        for(int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            if(res.indexOf(String.valueOf(ch)) == -1)
                res.append(ch); 
        }
        System.out.println(res);
    }
}