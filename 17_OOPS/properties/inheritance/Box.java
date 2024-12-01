package properties.inheritance;

public class Box {
    private double l; // private -> can only access in this file ( this is data hiding)
    double w;
    double h;

    static void greeting() {
        System.out.println("Hey I am in box greetings");
    }

    public double getL() {
        return l; // this in same class, so it can access private stuff
    }

    // constructor
    Box() {
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }

    // cube
    Box( double side) {

        super(); // refering to object class

        this.h = side;
        this.w = side;
        this.l = side;
    }

    Box(double l, double h, double w) {
        System.out.println("Box class constructor");
        this.h = h;
        this.w = w;
        this.l = l;
    }

    Box( Box old) {
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }

    public void information() {
        System.out.println("Running the box");
    }
}
