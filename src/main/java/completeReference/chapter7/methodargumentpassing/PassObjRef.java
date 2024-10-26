package completeReference.chapter7.methodargumentpassing;

import completeReference.chapter7.accessmodifier.Stack;

public class PassObjRef {

    public static void cal(Box b) {
        b.height = b.height * 10;
    }

    public static void main(String[] args) {
        Box b = new Box(3, 5);
        System.out.println("Before Method call "+ b);
        cal(b);
        System.out.println("After Method call "+ b);
    }
}

class Box {
    int width;
    int height;


    Box(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
