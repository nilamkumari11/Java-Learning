package Access;

public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num, float gpa ) {
        this.num = num;
        this.gpa = gpa;
    }

    // how to create -> hashmaps
    // a number representation of an object
    // int value formed via some algorithm
    @Override
    public int hashCode() {
        return super.hashCode(); // not address -> can't get in java
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // string representation
    @Override
    public String toString() {
        return super.toString();
    }

    // gets called when garbage collection is done
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(35, 55.9f);
        ObjectDemo obj2 = new ObjectDemo(35, 37.8f);

        System.out.println(obj.hashCode()); // unique representation

        if(obj == obj2) { // variables are pointing to same object or not
            System.out.println("obj is equal to obj2");
        }
        if(obj.equals(obj2)) {
            System.out.println("obj equals to obj2");
        }

        System.out.println(obj.getClass());
        System.out.println(obj.getClass().getMethods()); // we can get any thing

    }
}
