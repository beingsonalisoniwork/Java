package day3;

public class SwapTwoNumbers {
    
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Values of a and b = " + a + ", " + b);

        // 1 - brute solution or using 3rd variable
        // int temp;
        // temp = a;
        // a = b;
        // b = temp;

        // 2 - using addition and subtraction operator
        // a = a + b; // 10+20=30
        // b = a - b; // 30-20=10
        // a = a - b; // 30-10=20

        // 3 - both values should not be zero
        // a = a * b;
        // b = a / b;
        // a = a / b;

        // 4 - bitwise XOR (^) decimal is converted into binary
        // a = 00001010, b = 00010100
        // a = a ^ b; // 00001010 ^ 00010100 = 0001 1110 > 30
        // b = a ^ b; 
        // a = a ^ b;

        // 5 - single statement
        b = a + b - (a = b); // 10 + 20 - (a = 20); > 30 - 20;

        System.out.println("Swapped values of a and b = " + a + ", " + b);
    }
}