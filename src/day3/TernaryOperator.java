package day3;

public class TernaryOperator {
    public static void main(String[] args) {

        // ternary operator : var = expr ? r1 : r2;
        // true > r1, false > r2

        int a = 200, b = 100;
        int x = (a > b) ? a : b; // if true then a is assigned
        System.out.println(x);

        int c = 1, d = 1;
        int y = (c == d) ? 100 : 200;
        System.out.println(y);

        boolean z = (c != d) ? true : false;
        System.out.println(z);

        int age = 30;
        String result = (age >= 18) ? "Eligible" : "Not Eligible";
        System.out.println(result);
    }
}
