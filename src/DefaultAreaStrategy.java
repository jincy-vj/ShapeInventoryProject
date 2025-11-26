public class DefaultAreaStrategy implements AreaStrategy {

    public double compute(Shape shape) {
        return shape.area();
    }

}
