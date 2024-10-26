package completeReference.chapter7.arrays;

public class ArrayLengthCheck {
    public static void main(String[] args) {
        int[] i = {1, 2, 3};
        System.out.println(i.length);
        i[1] = 0;
        System.out.println(i.length);
    }
}
