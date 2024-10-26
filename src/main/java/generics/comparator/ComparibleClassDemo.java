package generics.comparator;

public class ComparibleClassDemo {
    public static void main(String[] args) {
        ComparibleClass<Integer> comparibleClass = new ComparibleClass<>();
        comparibleClass.compareTo(3);
    }
}
