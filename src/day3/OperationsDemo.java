package day3;

public class OperationsDemo {
    public static void main(String[] args) {
        
        // arithmetic operators
        int a = 10, b = 20;

        System.out.println("a + b = " + (a + b)); // add
        System.out.println("a - b = " + (a - b)); // subtract
        System.out.println("a * b = " + (a * b)); // mulitply
        System.out.println("a / b = " + (a / b)); // division returns quotient
        System.out.println("a % b = " + (a % b)); // modulus returns remainder
        int result = a + b;
        System.out.println("a + b = " + result); // add
        System.out.println();

        // relational or comparison operators
        System.out.println("a > b = " + (a > b)); // greater than
        System.out.println("a < b = " + (a < b)); // less than
        System.out.println("a >= b = " + (a >= b)); // greater than equal to
        System.out.println("a <= b = " + (a <= b)); // less than equal to
        System.out.println("a != b = " + (a != b)); // not equal to
        System.out.println("a == b = " + (a == b)); // equal to
        a = 20;
        System.out.println("a >= b = " + (a >= b)); 
        System.out.println("a <= b = " + (a <= b)); 
        System.out.println();
        a = 10;
        boolean res = a > b;
        System.out.println("a > b = " + res);
        System.out.println();

        // logical operators - can be used for strings as well in which it compares ASCII value
        boolean x = true;
        boolean y = false;

        System.out.println("x && y = " + (x && y)); // logical AND
        System.out.println("x || y = " + (x || y)); // logical OR
        System.out.println("!x = " + (!x)); // logical NOT
        System.out.println("!y = " + (!y));

        boolean b1 = 10 > 20;
        System.out.println("10 > 20 = " + b1);
        boolean b2 = 20 > 10;
        System.out.println("20 > 10 = " + b2);
        System.out.println("b1 && b2 = " + (b1 && b2));
        System.out.println("b1 || b2 = " + (b1 || b2));

        System.out.println((50 < 100) && (50 > 100));
        System.out.println();
    }
}