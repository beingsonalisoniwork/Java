package day4;

public class AssignmentQuestions {

    public static void main(String[] args) {
        // largest of 2 numbers - ternary operator or if else condition
        int a = 10, b = 20;
        int result = (a > b) ? a : b;
        System.out.println("largest element is = " + result);

        // smallest of 3 numbers
        int x = 10, y = 20, z = 30;
        if((x < y) && (x < z)) {
            System.out.println("smallest number is = " + x);
        } else if((y < x) && (y < z)) {
            System.out.println("smallest number is = " + y);
        } else {
            System.out.println("smallest number is = " + z);
        }

        // print week number based on week name
        String weedDayName = "Sunday";

        switch(weedDayName) {
            case "Sunday" : System.out.println(1); break;
            case "Monday" : System.out.println(2); break;
            case "Tuesday" : System.out.println(3); break;
            case "Wednesday" : System.out.println(4); break;
            case "Thursday" : System.out.println(5); break;
            case "Friday" : System.out.println(6); break;
            case "Saturday" : System.out.println(7); break;
            default : System.out.println("Invalid");
        }

    }
    
}
