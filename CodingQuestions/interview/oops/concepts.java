package interview.oops;

// 1. encapsulation
class Employees {
    private String name;
    
    public String getName() { // getter 
        return name;
    }

    public void setName(String name) { // setter 
        this.name = name;
    }
}

// 2. abstraction
abstract class Remote {
    Remote() {
        System.out.println("Remote constructor called");
    }

    abstract void turnOn();

    void turnOff() {
        System.out.println("AC is turned off");
    }
}

class AcRemote extends Remote {
    AcRemote() {
        System.out.println("AcRemote constructor called");
    }

    @Override // compile time marker - allows us catch bugs early, if there's any typo in function name
    void turnOn() {
        System.out.println("AC is turned on");
    }
}

// 3. inheritance
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// 4. polymorphism
class Multiply { // method overloading, compile time ploymorphism
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }
}

class Head { // method overriding, run time polymorphism
    public void print() {
        System.out.println("Head");
    }
}

class SubHead1 extends Head {
    public void print() {
        System.out.println("SubHead1");
    }
}

class SubHead2 extends Head {
    public void print() {
        System.out.println("SubHead2");
    }
}

// 5. interface

public class concepts {
    public static void main(String[] args) {

        // 1. Encapsulation
        Employees emp1 = new Employees(); // emp1 is an object, and instance of Employees
        emp1.setName("Sonali");
        System.out.println(emp1.getName());

        // 2. Abstraction - partial blueprint, define some behaviour while other can be implemented by subclasses
        Remote remote = new AcRemote();
        remote.turnOn();
        remote.turnOff();

        // 3. Inheritance
        Animal dog = new Dog();
        dog.sound();

        // 4. Polymorphism
        Multiply product = new Multiply();
        System.out.println(product.multiply(5, 6));
        System.out.println(product.multiply(5.5, 10.5));

        Head userRole;
        userRole = new SubHead1();
        userRole.print();
        userRole = new SubHead2();
        userRole.print();

        // 5. Interface - pure contract, certain behaviour is already defined to be used
        // methods : default and static
        // constants only : public static final
        // constructors not allowed
        // 
    }
}
