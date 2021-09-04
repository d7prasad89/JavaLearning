package creationalDesignPattern.factory;

public class ShapeFactory {
    public Shape getShape(ShapeType type) {
        switch (type) {
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default:
                return null;
        }
    }
}
