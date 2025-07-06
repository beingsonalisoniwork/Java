package inheritance;

/*
 * Inheritance
 * increases reusability;
*/

class Shape {
    // base/parent class
    String color;
}

class Triangle extends Shape {
    // derived/child class
}

// 1. Single Level Inheritance
// class Shape {
//     public void area() {
//         System.out.println("displays area of shape");
//     }
// }

// class Triangle extends Shape {
//     public void area(int length, int height) {
//         System.out.println(1/2 * length * height);
//     }
// }

// 2. Multi Level Inheritance
class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(1/2 * l * h);
    }
}

// 3. Hierarchial Inheritance
// class Triangle extends Shape {
//     public void area(int length, int height) {
//         System.out.println(1/2 * length * height);
//     }
// }

class Circle extends Shape {
    public void area(int radius) {
        System.out.println(3.14 * radius * radius);
    }
}

/*
 * 4. Hybrid Inheritance
 * 5. Multiple Inheritance - in the form of classes it is not present in Java but oe nly in C++ We use Interfaces for this in Java
*/

public class InheritanceDemo {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "pink";
    }
}