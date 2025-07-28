package day3;

public class IncrementOperator {
    public static void main(String[] args) {

        // increment operator
        int a = 10;
        System.out.println(a);
        a++; // a = a + 1;
        System.out.println(a);

        // post increment
        int b = 20;
        int result = b++; // first assignment (20), then increment (21)
        System.out.println(result); // prints 20
        System.out.println(b);

        // pre increment
        int c = 30;
        int res = ++c; // first increment, then assignment
        System.out.println(res); // prints 31
        System.out.println(c);
    }
}
