package interview.string;

public class ReverseString {
    public static void main(String[] agrs) {
        String str = "Hello, World!";

        String newStr = reverseString(str);
        System.out.println("reversed string = " + newStr);
    }

    /*
    public static String reverseString(String str) {
        int len = str.length();
        String newStr = "";
        while(len != 0) {
            newStr += str.charAt(len-1);
            len--;
        }
        return newStr;
    }
    */

    // String is immutable, each += in java creates new object
    // O(n2) due to repeated copying

    public static String reverseString(String str) {
        StringBuilder newStr = new StringBuilder();
        for(int i = str.length()-1; i >= 0; i--) {
            newStr.append(str.charAt(i));
        }
        return newStr.toString();
    }
}
