package abstraction;

// abstract class Animal {
//     // public void walk() {}
//     abstract void walk();

//     Animal() {
//         System.out.println("animal constructor");
//     }

//     public void eats() {
//         System.out.println("animal eats");
//     }
// }

interface Animal {
    int eyes = 2; 
    // final for every animal 
    
    void walk();
    // Anima() {} 
    // can not create constructor in interface
}