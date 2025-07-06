package constructors;

/*
 * Constructors
 * same as class; no return type; called only once for one object (when creating the object);
 * Java does not have Destructor - it has automatic garbage collection 
*/

class Student {
    String name;
    int age;

    // Non-Parametrized Constructor / Default Constructor 
    Student() {
        System.out.println("Non parametrized constructor called!");
    }

    // Parametrized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructors - user defined: copy an object to another object
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    public void printStudentInfo() {
        System.out.println(this.name + ", " + this.age);
    }
}

public class ConstructorsDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Saurabh";
        s1.age = 27;

        s1.printStudentInfo();

        Student s2 = new Student("Sonali", 26);
        s2.printStudentInfo();

        Student s3 = new Student(s2);
        s3.printStudentInfo();
    }
}