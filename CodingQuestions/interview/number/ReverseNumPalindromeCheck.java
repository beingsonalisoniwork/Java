package interview.number;

public class ReverseNumPalindromeCheck {
    public static void main(String[] args) {
        int num = 121;

        // if(num < 0) { num *= -1; } 

        int revNum = reverseNum(num);
        System.out.println("reversed number = " + revNum);

        boolean isPalindrome = (revNum == num) ? true : false;
        System.out.println("is palindrome = " + isPalindrome);
    }

    public static int reverseNum(int n) {
        // if(n < 0) throw new IllegalArgumentException("Negative numbers are not considered to be palindrome");

        int result = 0;

        while(n > 0) {
            int digit = n % 10;
            result *= 10;
            result += digit;
            n /= 10;
        }

        return result;
    }
}
