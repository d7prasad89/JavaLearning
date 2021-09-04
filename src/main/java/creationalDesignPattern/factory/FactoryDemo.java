package creationalDesignPattern.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape square = factory.getShape(ShapeType.SQUARE);
        square.draw();
    }
}
