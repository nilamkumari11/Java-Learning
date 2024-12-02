package properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
//        this.l; -> its private can not be accessed
    }

//    @Override
    static void greeting() {
        System.out.println("Hey I am in boxweight greetings");
    }

    BoxWeight(BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight (double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // call the parent class constructor
        // used to initialise values in parent class

        System.out.println(super.w); // can be accessed by both this and super
        // but, super refers to the parent class
        // so, for same variables, if we want to refer to parent class
        // this will refer to the child class

        this.weight = weight;
    }

}
