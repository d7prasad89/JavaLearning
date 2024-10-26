package completeReference.chapter7.methodoverload;

public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box();
//        box.printDimension();
        System.out.println(box.increaseDimension(2.0));
        System.out.println(box.increaseDimension(2, 3));
    }
}
