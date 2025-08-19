package interview.number;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 1;
        printFibonacciSeries(n);
    }

    public static void printFibonacciSeries(int n) {
        if(n <= 0) throw new IllegalArgumentException("Number can't be zero or less");

        int a = 0, b = 1;
        for(int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }

        System.out.println();
    }
}