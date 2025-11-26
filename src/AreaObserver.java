public class AreaObserver implements Observer {

    public void update(Shape shape) {
        System.out.println("[Observer] Shape updated: " + shape + " -> area=" + shape.area());
    }
}
