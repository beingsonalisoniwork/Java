package interview.string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "AaBb"; // 
        // "madam", "aabbcc", " ", "a", "AaBb" (case-sensitive both unique), 

        // using hashmap:
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            // System.out.println(entry.getKey() + ", " + entry.getValue());
            if(entry.getValue() == 1) {
                System.out.println("first non-repeating char = " + entry.getKey());
                break;
            }
        }

        // without using hashmap:
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(str.indexOf(c) == str.lastIndexOf(c)) { // indexOf gives first occurence of c, lasIndexOf gives last occurence of c
                System.out.println("first non-repeating char = " + c);
                break;
            }
        }
    }
}
