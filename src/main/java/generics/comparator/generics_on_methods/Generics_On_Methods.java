package generics.comparator.generics_on_methods;

import generics.comparator.User;
import generics.comparator.UserComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Generics_On_Methods {
    public static void main(String[] args) {
        User rob = new User("Rob", "Thomson");
        User david = new User("David", "Augustian");
        User aa = new User("Aa","Aa");
        List<User> userList = new ArrayList<>();
        Collections.addAll(userList, rob, david, aa);
        User youngestUser = min(userList, new UserComparator());
        System.out.println(youngestUser);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(min(numbers, Integer::compare));
    }

    private static <T> T min(List<T> userList, Comparator<T> comparator) {
        if(userList.isEmpty()) {
            throw new IllegalArgumentException("List is empty, cannot find minimum");
        }
        T youngestUser = userList.get(0);
        for(int i=0; i<userList.size(); i ++ ){
            final T element = userList.get(i);
            if(comparator.compare(element, youngestUser) < 0){
                youngestUser = userList.get(i);
            }
        }
        return youngestUser;

    }
}
