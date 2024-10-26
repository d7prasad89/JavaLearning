package generics.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserDemo {
    public static void main(String[] args) {
        User rob = new User("Rob", "John");
        User john = new User("John", "Doe");
        User benjamin = new User("Benjamin", "Franklin");
        List<User> list = new ArrayList<>();
        Collections.addAll(list, rob, john, benjamin);
        Collections.sort(list, new UserComparator());
        System.out.println(list);
    }
}
