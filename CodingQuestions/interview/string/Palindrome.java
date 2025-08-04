package interview.string;

public class Palindrome {
    public static void main(String[] args) {
        String str = "No lemon, no melon";
        // String str = "मलयालम";
        str = str.toLowerCase(); // comment for reverse string
        str = str.replaceAll("[^a-zA-Z0-9]", "").replaceAll(" ", ""); // if symbols and space need to be ignored
        System.out.println("is palindrome = " + isPalindrome(str));
    }

    // using reverse string:
    /*
    public static boolean isPalindrome(String str) {
        StringBuilder newStr = new StringBuilder();
        for(int i = str.length()-1; i >= 0; i--) {
            newStr.append(str.charAt(i));
        }
        return str.equalsIgnoreCase(newStr.toString()); // compare str with revStr and return boolean
    }
    */
    
    // using 2 pointer approach
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length()-1;
        while(left < right) {
            if(str.charAt(left++) != str.charAt(right--)) // updating left and right here using post increment and post decrement concept
                return false;
        }
        return true;
    }

    // static method belongs to the class, we can call them without creating an object
    // used static in the function because I am calling it from "main"

    // non-static way: 
    /*
    public class Palindrome {
    public static void main(String[] args) {
        Palindrome obj = new Palindrome(); // object created
        System.out.println("Is palindrome = " + obj.isPalindrome("madam"));
    }

    public boolean isPalindrome(String str) {
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        return str.equals(rev.toString());
    }
    */
}