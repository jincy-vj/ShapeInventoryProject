import java.util.Random;

public class ShapeFactory {

    public static Shape createShape() {
        Random rand = new Random();
        int type = rand.nextInt(3);
        switch (type) {
            case 0:
                return new Circle(rand.nextInt(10) + 1);
            case 1:
                return new Rectangle(rand.nextInt(10) + 1, rand.nextInt(10) + 1);
            default:
                return new Triangle(rand.nextInt(10) + 1, rand.nextInt(10) + 1);
        }
    }

}
