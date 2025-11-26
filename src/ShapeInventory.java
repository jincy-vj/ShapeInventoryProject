import java.util.ArrayList;
import java.util.List;

public class ShapeInventory {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        // Factory Method + Decorator
        for (int i = 0; i < 5; i++) {
            shapes.add(new ShapeLogger(ShapeFactory.createShape()));
        }

        // Observer
        List<ObservableShape> observableShapes = new ArrayList<>();
        AreaObserver observer = new AreaObserver();
        for (Shape s : shapes) {
            ObservableShape obsShape = new ObservableShape(s);
            obsShape.addObserver(observer);
            observableShapes.add(obsShape);
        }

        // Command pattern
        for (ObservableShape obsShape : observableShapes) {
            Command cmd = new UpdateAreaCommand(obsShape);
            cmd.execute();
        }

        // Composite
        ShapeGroup group = new ShapeGroup();
        for (Shape s : shapes) group.add(s);
        System.out.println("[Composite] Total area of group: " + group.area());

        // Strategy
        AreaStrategy strategy = new DefaultAreaStrategy();
        for (Shape s : shapes) {
            System.out.println("[Strategy] Area via strategy: " + strategy.compute(s));
        }
    }
}
