public class UpdateAreaCommand implements Command {

    private final ObservableShape shape;

    public UpdateAreaCommand(ObservableShape shape) {
        this.shape = shape;
    }

    public void execute() {
        System.out.println("[Command] Notifying observers for: " + shape);
        shape.notifyObservers();
    }

}
