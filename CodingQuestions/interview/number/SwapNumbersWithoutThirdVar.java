package interview.number;

public class SwapNumbersWithoutThirdVar {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;

        System.out.println("Numbers a = " + a + " and b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        // using XOR - to mitigate risk of overflow in case of Integer.MAX_VALUE
        // a = a ^ b; 
        // b = a ^ b; 
        // a = a ^ b; 

        System.out.println("Swapped Numbers a = " + a + " and b = " + b);
    }
}