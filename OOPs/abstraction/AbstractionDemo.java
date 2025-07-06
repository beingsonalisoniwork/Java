package abstraction;

/*
 * DATA HIDING (Encapsulation)
 * process of protecting members of class from unintended changes;
 * ABSTRACTION
 * hiding the implementation details and showing only important/useful parts to the user;
*/

// abstract class Animal {
//     abstract void walk();
// }
// class Horse extends Animal {
//     public void walk() {
//         System.out.println("walks on 4 legs");
//     }
// }
// class Chicken extends Animal {
//     public void walk() {
//         System.out.println("walks on 2 legs");
//     }
// }

public class AbstractionDemo {
    public static void main(String[] args) {
        Horse horse = new Horse();
        // horse.eats();
        horse.walk();

        // Animal animal = new Animal();
        // animal.walk();
        // run-time error

        /*
         * Constructor Chaining
         * when a derived class object is created, first base class constructor is called and then derived class constructor;
        */
    }
}
