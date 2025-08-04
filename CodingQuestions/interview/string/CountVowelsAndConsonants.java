package interview.string;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "Hello, how are you?"; // consonants:7 vowels:7
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

    /*
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
    */
}