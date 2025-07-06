package src.oops;
import src.bank.Account;

/*
 * Package
 * related code; buil-in or user defined packages;
 * built-in like import java.util.Scanner; etc
*/

/*
 * OOPS
 * user defined class Pen; blueprint; represents dataType
*/

// class Pen {
//     String color;
//     String type;
//     public void write() {
//         System.out.println("writing...");
//     }
//     public void printProperties() {
//         System.out.println(this.color + ", " + this.type);
//         // 'this' keyword refers to current instance/object of class
//     }
// }

/*
 * STATIC Keyword
 * memory is given only once
*/

class Student {
    String name; // object
    static String school; // every object inside this class will have same school name

    public static void changeSchool() {
        school = "newSchoolName";
    }
}

public class OOPs {
    public static void main(String[] agrs) {

        /*
         * OOPS
         * object creation using 'new' keyword
        */
        
        Pen pen1 = new Pen();

        /*
         * Pen - type/class name
         * pen1 - variable name/object reference; holds memory reference to actual Pen object;
         * new - used to create new instance of class Pen; JVM allocates memory in heap and returns a reference to that memory;
         * Pen() - special function; constructor call; no arguments - default consrtuctor; object initialization logic happens (if any);
        */

        pen1.color = "black";
        pen1.type = "ballpoint";

        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "blue";
        // pen2.type = "gel";

        pen1.printProperties();
        pen2.printProperties();

        // PACKAGE

        /*
         * ENCAPSULATION 
         * data (propeties) + functions (methods) = inside one unit called CLASS
        */

        // bank.Account a1 = new bank.Account(); // if import statement was not present;
        Account a1 = new Account();
        a1.name = "customer1";
        // a1.setPassword("123456");
        String pwd = a1.getPassword();
        System.out.println(pwd);

        // static methods or variables can be accessed using Class name
        Student.school = "HRMS";
        Student s1 = new Student();
        s1.name = "Ritaali";
        // System.out.println(s1.school);
    } 
}