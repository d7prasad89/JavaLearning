package completeReference.chapter8.inheritence;

public class BoxDemo {
    public static void main(String[] args) {
        Box b = new Box(1, 2);
        WeightBox weightBox = new WeightBox(1, 2, 3);
        b = weightBox;
//        b.weight; - This will fail due to Access
    }
}
