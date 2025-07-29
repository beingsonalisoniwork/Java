package day4;

public class EvenOrOddNumber {

    public static void main(String[] args) {

        // even and odd number program : 10 even (10 % 2 = 0) and 5 odd (5 % 2 = 1)
        int num = 10;

        if(num % 2 == 0) {
            System.out.println(num + " is an even numer");
        } else {
            System.out.println(num + " is an odd number");
        }
    }
}
