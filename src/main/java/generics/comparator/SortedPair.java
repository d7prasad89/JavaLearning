package generics.comparator;

public class SortedPair<T extends Comparable<T>>  {
    private final T left;
    private final T right;

    public SortedPair(T first, T second){
        if(first.compareTo(second) < 0) {
            left = first;
            right = second;
        } else {
            left = second;
            right = first;
        }
    }

    public T getLeft() {
        return left;
    }

    public T getRight() {
        return right;
    }
}
