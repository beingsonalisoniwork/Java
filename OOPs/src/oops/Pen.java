package src.oops;

public class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing...");
    }

    public void printProperties() {
        System.out.println(this.color + ", " + this.type);
    }
}
