package Access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(37, "Nilam", 55, 78);
        // need to do a few things
        // 1. access the data members
        // 2. modify the data members

//        obj.num; -> private
        obj.getNum();
        obj.setNum(20);

        //public -> available everywhere
        String a = obj.name;

        int roll = obj.roll; // in same package allowed
        int ex = obj.example; // protect in same package is accessed
    }

}
