package day4;

public class ConditionalStatements {
    public static void main(String[] args) {
        
        // if statement
        int age = 25;
        if(age >= 18) {
            System.out.println("Eligible to vote");
        }

        // if else statement
        // if there are only single statement inside the { ... } then {} can be removed and statement can be directly written 
        int personAge = 17;
        if(personAge >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not Eligible to vote");
        }

        // if-else ladder
        // check if number is positive, negative or zero
        int num = 10;
        if(num < 0) {
            System.out.println(num + " is a negative number");
        } else if(num > 0) {
            System.out.println(num + " is a positive number");
        } else {
            System.out.println(num + " is zero");
        }

        // if(false) {
        //     System.out.println(20);
        // } else {
        //     System.out.println(40);
        // }

        // if(1 != 1) {
        //     System.out.println(1);
        // } else {
        //     System.out.println(2);
        // }

        // nested if else statement
        /*
        if(true) {
            if(false) {
                System.out.println("xyz");
            } else {
                System.out.println("abc");
            }
        } else {
            System.out.println("123");
        }
        */

        // switch case statement
        int weekDayNum = 5;
        switch(weekDayNum) {
            case 1 : System.out.println("Sunday"); break;
            case 2 : System.out.println("Monday"); break;
            case 3 : System.out.println("Tuesday"); break;
            case 4 : System.out.println("Wednesday"); break;
            case 5 : System.out.println("Thursday"); break;
            case 6 : System.out.println("Friday"); break;
            case 7 : System.out.println("Saturday"); break;
            default : System.out.println("Invalid");
        }

        // without break; it will execute next statement without checking the case
    }
}
