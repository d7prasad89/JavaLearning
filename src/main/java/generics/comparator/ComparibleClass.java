package generics.comparator;

import org.jetbrains.annotations.NotNull;

public class ComparibleClass<T> implements Comparable<T>{
    @Override
    public int compareTo(@NotNull T o) {
        return 0;
    }
}
