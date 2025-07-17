package practice;

public class TrickyPrints {
    public static void main(String[] args) {
        // simple print
        System.out.print("Hello");
        System.out.print("World");

        // first prints and THEN adds new line
        System.out.println("!");
        System.out.println("New line");

        int a = 5;
        int b = 10;
        System.out.println("result: " + a + b); // concatenate
        System.out.println("result: " + (a + b)); // addition

        System.out.println("this is a new line: \nand a tab: \tfinally, a backslash: \\");

        double value = 123.4567;
        System.out.printf("formatted value: %.2f%n", value);
        // %.2f two decimal places for a floating point number
        // %n platform independent new line
        // %s strings
        // %d integers
        // %b boolean

        String name = "Sonali";
        int age = 26;
        System.out.printf("Name: %s, Age: %d%n", name, age);
        System.out.printf("|%-15s|%n", "Product Name"); // left justified

        // if(true) break;
        // error - break cannot be used outside of a loop or a switch

        System.out.println('j' + 'a' + 'v' + 'a'); 
        // treats them ascii because of single quotes
        System.out.println("j" + "a" + "v" + "a"); 

        int $_ = 5;
        System.out.println($_);
        // variabl name can start with any ALPHABET (a-z, A-z) UNDERSCORE (_) DOLLAR ($)

        Integer n1 = 100;
        Integer n2 = 100;
        Integer n3 = 500;
        Integer n4 = 500;

        if(n1 == n2) System.out.println("n1 == n2");
        else System.out.println("n1 != n2");

        if(n3 == n4) System.out.println("n3 == n4");
        else System.out.println("n3 != n4");

        // caching
        // Integer class has caching range from -128 to 127
        // value 100 is in the range - hence same reference
        // value 500 is not in the above range hence different reference

        int x = 5;
        System.out.println(x++); // returns value before incrementing
        System.out.println(x); 
        System.out.println(++x); 

        int y = 1;
        int sum = y++ + ++y;
        // 1 + (1 (prev increment) + 2 (current increment)) = 4
        System.out.println(sum);
    }
}
