package interview.number;

public class FindFactorial {
    public static void main(String[] args) {
        long n = 20;

        long fact = findFactorialUsingLoop(n);
        long factorial = findFactorialUsingRecursion(n);

        System.out.println("using loop = " + fact);
        System.out.println("using recursion = " + factorial);
    }

    public static long findFactorialUsingLoop(long num) {
        if(num < 0) throw new IllegalArgumentException("Number should not be negative");
        if(num > 20) throw new ArithmeticException("Factorial result will overflow long data type");

        long fact = 1;
        for(long i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long findFactorialUsingRecursion(long num) {
        if(num < 0) throw new IllegalArgumentException("Number should not be negative");
        if(num > 20) throw new ArithmeticException("Factorial result will overflow long data type");

        if(num == 0) return 1;
        long fact = num;
        fact *= findFactorialUsingRecursion(num-1);
        return fact;
    }
}
