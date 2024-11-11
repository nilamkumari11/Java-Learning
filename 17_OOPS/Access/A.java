package Access;

public class A {
    private int num;
    public String name;
    int roll; // when not specify anything ( check package singleton: Main class)
    int[] arr;
    protected int example;

    // there is a table foe access of all the types,

    // getter
    public int getNum() {
        return num;
    }

    //setter
    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name, int roll, int example) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
        this.roll = roll;
        this.example = example;
    }


}
