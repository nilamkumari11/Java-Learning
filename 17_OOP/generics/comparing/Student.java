package generics.comparing;

import java.rmi.StubNotFoundException;

public class Student implements Comparable<Student>{
    int rollNo;
    float marks;

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks+" ";
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("in compare to method");
        int diff = (int)(this.marks - o.marks);

        // if diff == 0 then both are equal
        // if diff < 1: o is bigger
        // else o is smaller

        return diff;
    }
}
