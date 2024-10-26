package generics.comparator;

public class SortedPairDemo {
    public static void main(String[] args) {
        SortedPairNew<Integer> sortedPair= new SortedPairNew<>(100, 200);
        System.out.println(sortedPair.getLeft());
    }
}
