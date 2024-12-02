package generics.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student nilam = new Student(37, 98.67f);
        Student ayushi = new Student(5, 87.32f);
        Student nitish = new Student(36, 46.90f);
        Student deepa = new Student(10, 77.32f);
        Student nidhi = new Student(35, 67.32f);

        Student[] list = {nilam, ayushi, nitish, deepa, nidhi};

        System.out.println(Arrays.toString((list)));

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int)(o1.marks - o2.marks);
//            }
//        });

        // lambda expressions

        Arrays.sort(list, (o1, o2) -> (int)(o1.marks - o2.marks));

        System.out.println(Arrays.toString(list));

        if(nilam.compareTo(ayushi) > 0) {
            System.out.println("Nilam has More marks");
        }
    }
}
