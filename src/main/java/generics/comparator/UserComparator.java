package generics.comparator;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User left, User right) {
        return left.getLastName().compareTo(right.getLastName());
    }
}
