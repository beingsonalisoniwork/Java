package polymorphism;

// class Student {
//     String name;
//     int age;
//     public void printInformation(String name) {
//         System.out.println(name);
//     }
//     public void printInformation(int age) {
//         System.out.println(age);
//     }
//     public void printInformation(String name, int age) {
//         System.out.println(name + " " + age);
//     }
// }

public class Polymorphism {
    public static void main(String[] args) {

        // USING SAME FILE
        // Student s1 = new Student();
        // s1.name = "Sonali";
        // s1.age = 26;
        // s1.printInformation(s1.name, s1.age);

        PrintStudentInfo printer = new PrintStudentInfo();
        printer.printInformation(26);
        printer.printInformation("Sonali");
        printer.printInformation("Saurabh", 27);
    }
}