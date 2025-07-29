package day4;

public class LargestOfThreeNumbers {
    
    public static void main(String[] args) {
        
        int a = 10, b = 20, c = 30;

        if((a > b) && (a > c)) {
            System.out.println("a is largest = " + a);
        } else if((b > a) && (b > c)) {
            System.out.println("b is largest = " + b);
        } else {
            System.out.println("c is largest = " + c);
        } 
    }
}
