import java.util.ArrayList;
import java.util.List;

public class ShapeGroup extends Shape {

    private final List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public double area() {
        double total = 0;
        for (Shape s : shapes) total += s.area();
        return total;
    }
}
