package interview.string;

import java.text.Normalizer;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        printCountOfConsonantsAndVowels("a e i o u");
        printCountOfConsonantsAndVowels("");
        printCountOfConsonantsAndVowels("abc123!");
        printCountOfConsonantsAndVowels("xyz");
        printCountOfConsonantsAndVowels(null);
        printCountOfConsonantsAndVowels("ÁÉÍÓÚ");

        String str = "hello there!";
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        System.out.println("consonants = " + fetchConsonantsCount(str) + ", vowels = " + fetchVowelsCount(str));
    }


    // optimized approach
    public static void printCountOfConsonantsAndVowels(String str) {
        if(str == null) {
            System.out.println("String is null.");
            return;
        }

        // for last case, as Á = a + accent > to remove the accent
        str = Normalizer.normalize(str, Normalizer.Form.NFD);
        str = str.replaceAll("\\p{M}", ""); // remove accents

        str = str.toLowerCase().replaceAll("[^a-z]", "");

        int vowels = 0, consonants = 0;
        for(char ch : str.toCharArray()) {
            if("aeiou".indexOf(ch) >= 0) // aeiou = [0,1,2,3,4] if ch = i then this will return 2 which is >= 0
                vowels++;
            else 
                consonants++;
        }
        System.out.println("consonants = " + consonants + ", vowels = " + vowels);
    }


    // intial approach
    public static int fetchConsonantsCount(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u') {
                count++;
            }
        }
        return count;
    }

    public static int fetchVowelsCount(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
}