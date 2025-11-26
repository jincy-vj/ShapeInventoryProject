/**
 * STRUCTURAL PATTERN: Decorator
 */
public class ShapeLogger extends Shape {

    private final Shape shape;

    public ShapeLogger(Shape shape) {
        this.shape = shape;
        System.out.println("[Decorator] Created: " + shape);
    }

    public double area() {
        return shape.area();
    }

    public String toString() {
        return shape.toString();
    }

}
