package abstraction;

// class Horse extends Animal {
//     Horse() {
//         System.out.println("horse constructor");
//     }
//     public void walk() {
//         System.out.println("walks on 4 legs");
//     }
// }

/*
 * MULTIPLE INHERITANCE 
 * taking properties of 2 classes 
 * only possible using interfaces
*/

class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("walks on 4 legs only");
    }
}