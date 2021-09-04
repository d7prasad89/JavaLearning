package generics;

import generics.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonDemo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(32, "Matt"));
        personList.add(new Person(20, "John"));
        personList.add(new Person(25, "Bob"));
        Collections.sort(personList);
        System.out.println(personList);
    }
}
