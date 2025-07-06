package polymorphism;

/* 
 * Demonstrates Method / Function Overloading
 * Polymorphism - using same function for different purpose
 * 1. difference in number of arguments
 * 2. difference in data type of arguments / return type
*/

public class PrintStudentInfo {
    String name;
    int age;

    public void printInformation(String name) {
        System.out.println(name);
    }

    public void printInformation(int age) {
        System.out.println(age);
    }

    public void printInformation(String name, int age) {
        System.out.println(name + " " + age);
    }
}
