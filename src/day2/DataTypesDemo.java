package day2;

public class DataTypesDemo {
    public static void main(String[] args) {

        final double pi = 3.14; // value that can't be changed

        // numeric data types
        int a = 10, b = 20;
        System.out.println("value of a: " + a);
        System.out.println("value of b: " + b);

        System.out.println("sum of a and b: " + a+b); // concatenation with string
        System.out.println(a+b);
        System.out.println("sum of a and b: " + (a+b));

        byte by = 125;
        System.out.println(by);
        
        short sh = 3535;
        System.out.println(sh);

        long l = 12345678999L; // litral l/L is required
        System.out.println(l);

        // decimal numbers
        float price = 10.50f; // literal f/F is required
        System.out.println(price);

        double dbl = 15.1234567898765;
        System.out.println(dbl);

        char grade = 'A';
        System.out.println(grade);

        String name = "Sonali";
        System.out.println(name);

        String ch = "A";
        System.out.println(ch);

        boolean flag = true;
        System.out.println(flag);
        System.out.println(!flag);

        System.out.println(2*pi);
    }
}
