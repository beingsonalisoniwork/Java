package day3;

public class DecrementOperator {
    public static void main(String[] args) {

        // decrement operator
        int a = 10;
        a--; // a = a - 1;
        System.out.println(a);

        // post decrement
        int b = 100;
        int result = b--; // first assignment, then decrement
        System.out.println(result);
        System.out.println(b);

        // pre decrement
        int c = 1000;
        int res = --c; // first decrement, then assignment
        System.out.println(res);
        System.out.println(c);
    }
}
