package completeReference.chapter7.methodoverload;

public class Box {

    private double height, weight, depth;

    public Box(double height, double weight, double depth) {
        this.height = height;
        this.weight = weight;
        this.depth = depth;
    }

    public Box() {
        this.depth = -1;
        this.height = -1;
        this.weight = -1;
    }

    public Box(int length) {
        height = weight = depth = length;
    }

    void printDimension() {
        System.out.println(height * weight * depth);
    }

    int increaseDimension(int i) {
        System.out.println("Inside int i");
        return (int) (height * weight * depth + i);
    }

    int increaseDimension(int height, int weight) {
        System.out.println("Inside height, weight version");
        return (int) (height * weight * depth);
    }

    double increaseDimension(double d) {
        System.out.println("Inside double d");
        return height * weight * depth + d;
    }

}
