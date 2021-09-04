package generics.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        Student bob = new Student(15, "Bob");
        Student max = new Student(19, "Max");
        Student mike = new Student(14, "Mike");

        List<Student> students = new ArrayList<>();

        Collections.addAll(students, bob, max, mike);

        System.out.println(students);

        // Sorting below
        Collections.sort(students, new AgeComparator());

        System.out.println(students);

        Collections.sort(students, new ReverseComparator<>(new AgeComparator()));
        System.out.println(students);
    }
}
