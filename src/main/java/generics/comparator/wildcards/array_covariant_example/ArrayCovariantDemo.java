package generics.comparator.wildcards.array_covariant_example;

import java.rmi.server.RemoteObjectInvocationHandler;
import java.util.ArrayList;
import java.util.List;

public class ArrayCovariantDemo {
    public static void main(String[] args) {
        Partner bob = new Partner();
        bob.setFirstName("Bob");
        bob.setLastName("Evans");
        bob.setAge(32);
        Employee mike = new Employee();
        mike.setFirstName("Mike");
        mike.setLastName("Jack");
        Person[] person = new Person[10];
//        person[0] = bob;
        Employee[] employees = new Employee[2];
        person = employees;
//        The below will throw Array store exception, because we are storing partner object in Employee
//        person[0] = bob;
//      Let's try with List example
        List<Person> personList = new ArrayList<>();
        personList.add(bob);
        personList.add(mike);
//        System.out.println(personList);

//        Employee List
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(mike);

        List<Partner> partnerList = new ArrayList<>();
//        The below will throw compilation error, which upper bound can solve
//        personList = partnerList;
//        Upper bound
        partnerList.add(bob);
        saveAll(partnerList);

//        Lower bound
//        We have to make sure that what we load should be a person or super class of person
//        We cannot use ? extends person to the loadall, because while loading we may get partner and employee object so its always
//        safe to use ? super person for pass any person object or the parent class
        List<Object> objects = new ArrayList<>();
        objects.add(mike);
        objects.add(bob);
        loadAll(objects);


    }

    public static void saveAll(List<? extends Person> personList) {
        personList.forEach(person -> System.out.println(person));
    }

    public static void loadAll(List<? super Person> partnerList) {
        for (Object person : partnerList) {
            System.out.println(person);
        }
    }
}
