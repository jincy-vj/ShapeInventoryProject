import java.util.ArrayList;
import java.util.List;

public class ObservableShape extends Shape {

    private final Shape shape;
    private final List<Observer> observers = new ArrayList<>();

    public ObservableShape(Shape shape) {
        this.shape = shape;
    }

    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    public void notifyObservers() {
        for (Observer obs : observers) obs.update(shape);
    }

    public double area() {
        return shape.area();
    }

    public String toString() {
        return shape.toString();
    }

}
